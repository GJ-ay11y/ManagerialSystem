package com.gj.mapper;

import com.gj.pojo.UserMessage;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    List<UserMessage> findOne(@Param("username") String username, @Param("password") String password);

}
