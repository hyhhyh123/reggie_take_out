package com.maoxiaoyu.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.maoxiaoyu.reggie.entity.User;
import com.maoxiaoyu.reggie.mapper.UserMapper;
import com.maoxiaoyu.reggie.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @version 17.0
 * @auther 猫小鱼
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
