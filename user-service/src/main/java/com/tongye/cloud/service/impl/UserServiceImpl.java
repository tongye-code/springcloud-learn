package com.tongye.cloud.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.tongye.cloud.dto.User;
import com.tongye.cloud.service.IUserService;

/**
 * <p>
 *
 * <p>
 *
 * @Author zhuhanqing
 * @Date 2021/12/1 10:54
 * @Version 1.0.0
 */
@Service
public class UserServiceImpl implements IUserService {

    @Override
    public void create(User user) {

    }

    @Override
    public User getUser(Long id) {
        User user  = new User();
        user.setId(1L);
        user.setUsername("张三");
        user.setPassword("123456");
        user.setEmail("12345678@qq.com");
        return user;
    }

    @Override
    public List<User> getUserByIds(List<Long> ids) {
        User user  = new User();
        user.setId(1L);
        user.setUsername("张三");
        user.setPassword("123456");
        user.setEmail("12345678@qq.com");
        List<User> list = new ArrayList<User>();
        list.add(user);
        return list;
    }

    @Override
    public User getByUsername(String username) {
        User user  = new User();
        user.setId(1L);
        user.setUsername("张三");
        user.setPassword("123456");
        user.setEmail("12345678@qq.com");
        return user;
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(Long id) {

    }
}
