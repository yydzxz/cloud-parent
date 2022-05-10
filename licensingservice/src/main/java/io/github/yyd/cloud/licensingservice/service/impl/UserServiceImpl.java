package io.github.yyd.cloud.licensingservice.service.impl;

import io.github.yyd.cloud.licensingservice.entity.User;
import io.github.yyd.cloud.licensingservice.mapper.UserMapper;
import io.github.yyd.cloud.licensingservice.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yyd
 * @since 2022-05-08
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
