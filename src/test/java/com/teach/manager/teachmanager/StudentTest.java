package com.teach.manager.teachmanager;

import com.alibaba.fastjson.JSONObject;
import com.teach.manager.teachmanager.manager.student.StudentManager;
import com.teach.manager.teachmanager.pojo.Page;
import com.teach.manager.teachmanager.pojo.Query;
import com.teach.manager.teachmanager.pojo.vo.StudentVo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @program: teach-interactive-manager
 * @ClassName: StudentTest
 * @description:
 * @author: malin
 * @create: 2019-04-17 16:08
 **/

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentTest {

    @Autowired
    private StudentManager studentManager;

    @Test
    public void findStudentInfoTest() {
        Query<StudentVo> query = new Query<>();
        StudentVo studentVo = new StudentVo();
        studentVo.setId(1);
        query.setQuery(studentVo);
        Page<StudentVo> infoByPage = studentManager.findStudentInfoByPage(query);
        Assert.assertNotNull(infoByPage);
        System.err.println(JSONObject.toJSON(infoByPage));
    }

    @Test
    public void addStudentInfoTest() {
        StudentVo studentVo = new StudentVo();
        studentVo.setName("张三");
        studentVo.setPhone("13321139290");
        boolean result = studentManager.addStudentInfo(studentVo);
        Assert.assertTrue(result);
    }
}
