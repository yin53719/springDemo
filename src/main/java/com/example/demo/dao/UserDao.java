package com.example.demo.dao;


import com.example.demo.dto.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface UserDao {
    /**
     * 根据user_name查询数据库
     * (映射执行mapper文件中的sql语句selectUserByUserName)
     * @param userName 名字
     * @return User
     */
    public User selectUserByUserName(String userName);
    public void updateByName(User user);
    public void insertByName(User user);
    public void deleteByName(int id);
}
