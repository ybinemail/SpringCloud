package com.macro.cloud.service;

import com.macro.cloud.domain.User;

import java.util.List;

/**
 * Created by Robin on 2020/1/29.
 */
public interface UserService {
    void create(User user);

    User getUser(Long id);

    void update(User user);

    void delete(Long id);

    User getByUsername(String username);

    List<User> getUserByIds(List<Long> ids);
}
