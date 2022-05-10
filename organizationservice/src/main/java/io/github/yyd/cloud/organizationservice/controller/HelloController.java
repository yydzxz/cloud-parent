package io.github.yyd.cloud.organizationservice.controller;

import io.github.yyd.cloud.organizationservice.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangyidian
 * @date 2022/05/09
 **/
@Slf4j
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/hi")
    public User hi(User user){
        log.debug("organizationservice debug");
        return user;
    }

}
