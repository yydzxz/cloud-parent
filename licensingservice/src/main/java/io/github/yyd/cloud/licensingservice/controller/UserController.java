package io.github.yyd.cloud.licensingservice.controller;

import io.github.yyd.cloud.licensingservice.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author yyd
 * @since 2022-05-08
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("all")
    public Object all(){
        return userMapper.selectList(null);
    }
}
