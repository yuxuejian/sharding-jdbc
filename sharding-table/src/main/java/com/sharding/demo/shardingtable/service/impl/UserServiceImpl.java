package com.sharding.demo.shardingtable.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sharding.demo.shardingtable.dao.UserMapper;
import com.sharding.demo.shardingtable.entity.User;
import com.sharding.demo.shardingtable.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
