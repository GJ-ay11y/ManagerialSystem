package com.gj.service;

import com.gj.pojo.UserMessage;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<UserMessage> findOne(@Param("username") String username, @Param("password") String password);
}
