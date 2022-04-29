package com.example.user.controller;

import com.example.user.VO.ResponseTemplate;
import com.example.user.entity.User;
import com.example.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@Slf4j
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public Map<User,String> saveUser(@RequestBody User user){
        userService.saveUser(user);
        Map<User,String> resultMap=new HashMap<>();
        resultMap.put(user,"User added");
        log.info("Inside /save controller: "+user);
        return resultMap;
    }

    @GetMapping("/get/{id}")
    public ResponseTemplate getUserWithDepartment(@PathVariable("id") Long userId){
        return userService.getUserWithDepartment(userId);
    }


}
