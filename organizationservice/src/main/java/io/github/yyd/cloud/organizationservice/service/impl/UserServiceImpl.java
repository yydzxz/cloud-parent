package io.github.yyd.cloud.organizationservice.service.impl;

import io.github.yyd.cloud.organizationservice.entity.User;
import io.github.yyd.cloud.organizationservice.mapper.UserMapper;
import io.github.yyd.cloud.organizationservice.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yyd
 * @since 2022-05-09
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
