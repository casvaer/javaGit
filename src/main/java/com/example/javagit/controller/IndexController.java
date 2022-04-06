package com.example.javagit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @RequestMapping("/name")
    @ResponseBody
    public String returnString(){
       User user = new User();
       user.setName("chenshiqi");
       user.setAge(25);

        return user.toString();
    }
}
