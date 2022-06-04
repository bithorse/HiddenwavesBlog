package com.hiddenwaves.service.impl;

import com.hiddenwaves.entity.User;
import com.hiddenwaves.mapper.UserMapper;
import com.hiddenwaves.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ruichen.ma
 * @since 2022-04-21
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
