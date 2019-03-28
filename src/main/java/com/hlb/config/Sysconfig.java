package com.hlb.config;

import com.hlb.interceptor.FirstInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by Fly on 2019/3/28.
 */
@Configuration
public class Sysconfig implements WebMvcConfigurer {
    public FirstInterceptor firstInterceptor(){
        return new FirstInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(this.firstInterceptor()).addPathPatterns("/**");
    }

}