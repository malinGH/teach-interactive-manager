package com.teach.manager.teachmanager.common.interceptor;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @program: teach-interactive-manager
 * @ClassName: LoginInterceptor
 * @description: 登录拦截器封装类
 * @author: malin
 * @create: 2019-04-19 14:44
 **/

public class LoginInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Headers", "Content-Type,Content-Length, Authorization, Accept,X-Requested-With");
        response.setHeader("Access-Control-Allow-Methods", "PUT,POST,GET,DELETE,OPTIONS");
        response.setHeader("X-Powered-By", "Jetty");
        String method = request.getMethod();
        System.out.println(method);
        if ("OPTIONS".equals(method)) {
            response.setStatus(200);
            return false;
        }
        System.err.println("登录拦截器已生效");
        return true;
    }
}
