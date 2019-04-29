package com.teach.manager.teachmanager.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: teach-interactive-manager
 * @ClassName: WelcomeTeach
 * @description: 欢迎界面测试使用
 * @author: malin
 * @create: 2019-04-04 18:36
 **/
@RequestMapping("/test")
@RestController
@Api(value = "欢迎测试")
public class WelcomeTeach {

    @ResponseBody
    @RequestMapping("/index.html")
    @ApiOperation(value = "测试欢迎页面", httpMethod = "GET")
    public String welcomeHtml() {
        return "hello Teach";
    }

}
