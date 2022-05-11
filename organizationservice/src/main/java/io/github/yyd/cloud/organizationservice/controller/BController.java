package io.github.yyd.cloud.organizationservice.controller;

import io.github.yyd.cloud.organizationservice.entity.User;
import io.github.yyd.cloud.organizationservice.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangyidian
 * @date 2022/05/11
 **/
@Slf4j
@RestController
@RequestMapping("/b")
public class BController {

    @Autowired
    private IUserService userService;

    @GetMapping("/b")
    public User b(User user){
        user.setEmail(user.getEmail() + ":orgB:");
        return user;
    }

    @PostMapping("/b1")
    public User b1(@RequestBody User user){
        user.setEmail(user.getEmail() + ":orgB:");
        user.setUsername(user.getUsername() + ":orgB:");
        userService.save(user);
        return user;
    }
}
