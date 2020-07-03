package com.gj.controller;

import com.gj.pojo.HouseList;
import com.gj.pojo.UserMessage;
import com.gj.service.OwnerService;
import com.gj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

@Controller
@RequestMapping("/login")
@SessionAttributes(value = "username")
public class LoginController {
    //controller调用service
    @Autowired
    @Qualifier("UserServiceImpl")
    private UserService userService;

    @RequestMapping("/owner")
    public String ownerLogin(String username, String password, Model model) {
        String msg = "";
        List<UserMessage> list = userService.findOne(username, password);
        if (list.size() > 0){
            model.addAttribute("username",username);
            return "main";
        }else {
            msg = "用户名或密码有误！";
            model.addAttribute("msg",msg);
            return "login1";
        }
    }

}
