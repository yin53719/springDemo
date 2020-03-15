package com.example.demo.service;

import com.example.demo.dto.User;

import java.util.List;

public interface UserService {
    /**
     * 通过姓名查找User
     * @param userName
     * @return
     */
    List<User> selectUserByName(String userName);

    void updateByName(User user);

    void insertByName(User user);

    void deleteByName(int id);
}