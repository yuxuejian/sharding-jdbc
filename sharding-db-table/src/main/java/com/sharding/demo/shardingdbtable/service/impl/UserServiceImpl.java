package com.sharding.demo.shardingdbtable.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sharding.demo.shardingdbtable.dao.UserMapper;
import com.sharding.demo.shardingdbtable.entity.User;
import com.sharding.demo.shardingdbtable.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
