package com.teach.manager.teachmanager.common.util;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.framework.recipes.locks.InterProcessMutex;
import org.apache.curator.retry.RetryNTimes;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * @program: teach-interactive-manager
 * @ClassName: ZookeeperUtil
 * @description: zk使用工具
 * @author: malin
 * @create: 2019-04-25 10:06
 **/
public class ZookeeperUtil {

    private static final String ZK_ADDRESS = "192.168.17.11:2181";
    private static final String ZK_PATH = "/zktest";
    private static final CountDownLatch COUNT_DOWN_LATCH = new CountDownLatch(1);

    public static void main(String[] args) throws Exception {
        CuratorFramework client = CuratorFrameworkFactory.newClient(ZK_ADDRESS, new RetryNTimes(1000, 3));
        client.start();
        List<String> children = client.getChildren().forPath("/");
        System.err.println(children);
        System.out.println("zk client start successfully!");
        Thread t1 = new Thread(() -> doWithLock(client), "t1");
        Thread t2 = new Thread(() -> doWithLock(client), "t2");

        t1.start();
        t2.start();
        COUNT_DOWN_LATCH.countDown();
    }

    private static void print(Object result) {
        System.err.println(
                result instanceof byte[]
                        ? new String((byte[]) result)
                        : result);
    }

    private static void doWithLock(CuratorFramework client) {
        InterProcessMutex lock = new InterProcessMutex(client, ZK_PATH);
        try {
            COUNT_DOWN_LATCH.await();
            if (lock.acquire(10 * 1000, TimeUnit.SECONDS)) {
                System.err.println(Thread.currentThread().getName() + " hold lock");
                Thread.sleep(5000L);
                System.err.println(Thread.currentThread().getName() + " release lock");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                lock.release();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }


}
