package com.teach.manager.teachmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: teach-interactive-manager
 * @ClassName: WelcomeTeach
 * @description: 欢迎界面测试使用
 * @author: malin
 * @create: 2019-04-04 18:36
 **/
@RequestMapping("/test")
@Controller
public class WelcomeTeach {

    @ResponseBody
    @RequestMapping("/index.html")
    public String welcomeHtml() {
        return "hello Teach";
    }

}
