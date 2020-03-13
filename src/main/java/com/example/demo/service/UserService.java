package com.example.demo.service;

import com.example.demo.dto.User;

public interface UserService {
    /**
     * 通过姓名查找User
     * @param userName
     * @return
     */
    User selectUserByName(String userName);
}