package io.github.yyd.cloud.licensingservice.controller;

import io.github.yyd.cloud.licensingservice.entity.User;
import lombok.extern.slf4j.Slf4j;
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

    @RequestMapping("/b")
    public User b(User user){
        log.info("licensing: b");
        user.setEmail(user.getEmail() + ":licenceB:");
        return user;
    }
}
