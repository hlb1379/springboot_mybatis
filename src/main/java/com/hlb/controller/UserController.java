package com.hlb.controller;

import com.hlb.pojo.User;
import com.hlb.quartz_job.QuartzSysJob;
import com.hlb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Fly on 2019/3/28.
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private QuartzSysJob sysJob;


    @GetMapping("/userlist")
    public List<User> list() throws  Exception{
        //调用QuartzSysJob中的方法
        sysJob.sendMsg();  //该方法极有可能出现延迟，需要采用异步
        List<User> list = userService.getList();
        //throw new Exception("登录异常");
        return list;
    }

    @GetMapping("userupdate/{n}")
    public Map up(@PathVariable Integer n) throws Exception{
        Map map = new HashMap();
        userService.update(n);
        map.put("state", "200");
        map.put("message", "数据更新成功");
        return map;
    }
}