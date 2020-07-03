package com.gj.service.Impl;

import com.gj.mapper.UserMapper;
import com.gj.pojo.UserMessage;
import com.gj.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public List<UserMessage> findOne(String username, String password) {
        return userMapper.findOne(username, password);
    }
}
