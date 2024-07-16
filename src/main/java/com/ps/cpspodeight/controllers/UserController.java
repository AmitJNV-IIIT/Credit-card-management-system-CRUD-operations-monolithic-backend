package com.ps.cpspodeight.controllers;

import com.ps.cpspodeight.entities.UserInfo;
import com.ps.cpspodeight.services.UserInfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user/")
@RestController
public class UserController {
    @Autowired
    private UserInfoServiceImpl userInfoService;

    @PostMapping
    public UserInfo addUser(@RequestBody UserInfo userInfo){
        return userInfoService.addNewUser(userInfo);
    }

}
