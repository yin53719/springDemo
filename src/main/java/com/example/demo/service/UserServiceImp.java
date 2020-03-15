package com.example.demo.service;

import com.example.demo.dao.UserDao;
import com.example.demo.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserDao userDao;//注入UserDao

    @Override
    public List<User> selectUserByName(String userName) {
        return userDao.selectUserByUserName(userName);
    }

    @Override

    public void updateByName(User user){
        userDao.updateByName(user);
    }



    @Override
    public void insertByName(User user){
        userDao.insertByName(user);
    }

    @Override
    public void deleteByName(int id){
        userDao.deleteByName(id);
    }
}
