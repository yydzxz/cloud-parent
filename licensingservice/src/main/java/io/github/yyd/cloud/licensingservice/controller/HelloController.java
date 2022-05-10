package io.github.yyd.cloud.licensingservice.controller;

import io.github.yyd.cloud.licensingservice.entity.User;
import io.github.yyd.cloud.licensingservice.manager.organization.HelloManager;
import javax.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangyidian
 * @date 2022/05/08
 **/
@Slf4j
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private HelloManager helloManager;

    @Value("${thisenv}")
    private String thisenv;

    @Value("${myenv}")
    private String myenv;

    @GetMapping("/config")
    public Object getConfig(){
        return thisenv + ":" + myenv;
    }


    @GetMapping("/hi")
    public User hi(User user, HttpServletRequest request){
        log.debug("debugdebugdebugdebugdebugdebug");
        return helloManager.hi(user);
    }

}
