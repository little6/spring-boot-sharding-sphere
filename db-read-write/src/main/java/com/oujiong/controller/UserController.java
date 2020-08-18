package com.oujiong.controller;


import com.oujiong.entity.User;
import com.oujiong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


/**
 * @Description: 接口测试
 *
 * @author xub
 * @date 2019/8/24 下午6:31
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * @Description: 保存用户
     */
    @PostMapping("save-user")
    public Object saveUser() {
        return userService.saveOne(new User("小小", "女", 3));
    }

    /**
     * @Description: 获取用户列表
     */
    @GetMapping("list-user")
    public Object listUser() {
        return userService.list();
    }

    /**
     * 根据id集合查询用户信息
     * @return
     */
    @GetMapping("users")
    public List<User> users(){
        return userService.findByUserIds(Arrays.asList(2,10,1));
    }

}
