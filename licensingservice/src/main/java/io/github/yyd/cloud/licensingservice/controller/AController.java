package io.github.yyd.cloud.licensingservice.controller;

import io.github.yyd.cloud.licensingservice.entity.User;
import io.github.yyd.cloud.licensingservice.manager.organization.OrgAMananger;
import io.github.yyd.cloud.licensingservice.manager.organization.OrgBMananger;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
    private OrgAMananger orgAMananger;

    @Autowired
    private OrgBMananger orgBMananger;

    @GetMapping("/a")
    public User a(User user){
        log.info("licensing: a");
        user.setEmail(user.getEmail() + ":licenceA:");
        orgAMananger.a(user);
        orgAMananger.a1(user);
        orgBMananger.b(user);
        orgBMananger.b1(user);
        return user;
    }
}
