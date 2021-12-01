package com.tongye.cloud.service;

import java.util.List;

import com.tongye.cloud.dto.User;

/**
 * <p>
 *  用户服务接口
 * <p>
 *
 * @Author zhuhanqing
 * @Date 2021/12/1 10:43
 * @Version 1.0.0
 */
public interface IUserService {
    /**
     * 创建新用户
     *
     * @param user 用户信息
     * @return void
     * @Author zhuhanqing
     * @Date 2021/12/1 10:46
     */
    void create(User user);

    /**
     * 根据id查询用户
     *
     * @param id 用户id
     * @return com.tongye.cloud.dto.User
     * @Author zhuhanqing
     * @Date 2021/12/1 11:02
     */
    User getUser(Long id);

    /**
     * 根据ids查询用户列表
     *
     * @param ids 用户id列表
     * @return java.util.List<com.tongye.cloud.dto.User>
     * @Author zhuhanqing
     * @Date 2021/12/1 11:07
     */
    List<User> getUserByIds(List<Long> ids);

    /**
     * 根据用户名查询用户
     *
     * @param username 用户名称
     * @return com.tongye.cloud.dto.User
     * @Author zhuhanqing
     * @Date 2021/12/1 11:07
     */
    User getByUsername(String username);

    /**
     * 更新用户
     *
     * @param user 用户信息
     * @return void
     * @Author zhuhanqing
     * @Date 2021/12/1 11:07
     */
    void update(User user);

    /**
     * 根据id删除用户
     *
     * @param id 用户id
     * @return void
     * @Author zhuhanqing
     * @Date 2021/12/1 11:07
     */
    void delete(Long id);
}
