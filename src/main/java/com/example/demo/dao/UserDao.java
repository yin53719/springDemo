package com.example.demo.dao;


import com.example.demo.dto.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {
    /**
     * 根据user_name查询数据库
     * (映射执行mapper文件中的sql语句selectUserByUserName)
     * @param userName 名字
     * @return User
     */
    public List<User> selectUserByUserName(String userName);
    public void updateByName(User user);
    public void insertByName(User user);
    public void deleteByName(int id);
}
