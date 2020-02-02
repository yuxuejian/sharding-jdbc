package com.sharding.demo.shardingtable.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sharding.demo.shardingtable.entity.User;
import com.sharding.demo.shardingtable.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/get")
    public List<User> getUser(@RequestParam String userName) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_name", userName);
        return userService.list(queryWrapper);
    }

    @GetMapping("/getById")
    public User getById(@RequestParam long id) {
        return userService.getById(id);
    }

    @GetMapping("/list")
    public List<User> getUserList() {
        return userService.list();
    }

    @PostMapping("save")
    public String save(@RequestBody User user) {
        System.out.println(user.toString());
        userService.save(user);
        return "成功";
    }
}
