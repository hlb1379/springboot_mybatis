package com.hlb.service;

import com.hlb.pojo.User;

import java.util.List;

/**
 * Created by Fly on 2019/3/28.
 */
public interface UserService {

    List<User> getList();

    void update(Integer n);
}
