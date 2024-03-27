package com.dao.mapper;

import com.dao.entity.User;

import java.util.List;

public interface UserMapper {
    List<User> selectAll();
    int insertUser(User user);

    void updateUser(User user);

    void deleteUser(int userId);

}
