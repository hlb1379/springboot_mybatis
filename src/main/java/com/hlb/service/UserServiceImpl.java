package com.hlb.service;

import com.hlb.mapper.UserMapper;
import com.hlb.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Fly on 2019/3/28.
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getList() {

        return userMapper.getList();
    }

    @Override
    public void update(Integer n) {
        //更新操作，模拟两个操作，然后在两个操作蹭模拟故障，观察结果，有事务和无事务的区别

        userMapper.ModifyPwd("王小王");
        int i = 1/n;
        userMapper.ModifyPwd("李辉");

    }
}