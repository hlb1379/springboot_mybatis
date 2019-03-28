package com.hlb.interceptor;

import com.hlb.SpringbootMybatisApplication;
import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Fly on 2019/3/28.
 */

public class FirstInterceptor implements HandlerInterceptor{

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        System.out.println("前前前前前");
        SpringbootMybatisApplication.logger.debug("前置");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
//        System.out.println("中中中中后");
        SpringbootMybatisApplication.logger.info("后置");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
//        System.out.println("后后后最终");
        SpringbootMybatisApplication.logger.info("最终");
    }
}
