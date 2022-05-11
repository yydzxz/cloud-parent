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
@RequestMapping("/a")
public class AController {

    @Autowired
    private IUserService userService;

    @GetMapping("/a")
    public User a(User user){
        user.setEmail(user.getEmail() + ":orgA:");
        return user;
    }

    @PostMapping("/a1")
    public User a1(@RequestBody User user){
        user.setEmail(user.getEmail() + ":orgA:");
        user.setUsername(user.getUsername() + ":orgA:");
        userService.save(user);
        return user;
    }
}
