package com.oujiong.service;

import com.oujiong.entity.User;

import java.util.List;

/**
 * @author xub
 * @Description: 用户相关接口
 * @date 2019/8/24 下午6:32
 */
public interface UserService {

    /**
     * 获取所有用户信息
     */
    List<User> list();

    /**
     * 单个 保存用户信息
     *
     * @param user
     */
    String saveOne(User user);

    /**
     * @description: 根据id集合查询用户信息
     * @author: hyy
     * @date: 2020/8/18 7:45 下午
     */
    List<User> findByUserIds(List<Integer> ids);
}