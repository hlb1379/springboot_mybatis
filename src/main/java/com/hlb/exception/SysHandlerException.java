package com.hlb.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.security.auth.message.AuthException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Fly on 2019/3/28.
 */
@ControllerAdvice
public class SysHandlerException {
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Map exceptionHandler(Exception e){
        HashMap map = new HashMap<>();
        map.put("status", "500");
        map.put("message---exception", e.getMessage());
        return map;
    }
    @ExceptionHandler(AuthException.class)
    @ResponseBody
    public Map authAxceptionHandler(Exception e){
        HashMap map = new HashMap<>();
        map.put("status", "500");
        map.put("message--auth", e.getMessage());
        return map;
    }
}