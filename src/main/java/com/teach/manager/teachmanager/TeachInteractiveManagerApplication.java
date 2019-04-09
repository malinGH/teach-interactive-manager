package com.teach.manager.teachmanager;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @author malin
 */
@SpringBootApplication
@ServletComponentScan
@MapperScan("com.teach.manager.teachmanager.dao")
public class TeachInteractiveManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TeachInteractiveManagerApplication.class, args);
    }

}
