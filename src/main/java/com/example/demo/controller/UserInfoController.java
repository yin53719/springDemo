package com.example.demo.controller;

import com.example.demo.dto.User;
import com.example.demo.service.UserService;
import com.example.demo.utils.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserInfoController {
    @Autowired
    private  UserService userService ;
    @Autowired
    private JdbcOperations jdbcOperations;
    /**
    * 根据用户名查询用户
    * @return
    */
    @GetMapping("/getUserInfo")
    public ResponseUtil getUserInfo (@RequestParam(name = "userName", required = false) String userName){
        ResponseUtil response =  new ResponseUtil();
        try {
            RowMapper<User> rowMapper = new BeanPropertyRowMapper<>(User.class);
            List<User> userInfo =  jdbcOperations.query("SELECT userName,password,phone,id  FROM tc_user", rowMapper);
//            List<User> userInfo = userService.selectUserByName(userName);
            response.setStatus(200);
            response.setData(userInfo);
            int x = 10;
            while( x < 20 ) {
                System.out.print("value of x : " + x );
                x++;
                System.out.print("\n");
            }


            System.out.println("\n");
        }catch (Exception e){
            response.setStatus(500);
            response.setMsg(e.getMessage());
        }
        return response;
    }
    /**
     * 根据用户名修改用户信息
     * @return
     */
    @PutMapping("/updateByName")
    public ResponseUtil updateByName (@RequestBody User user){
        userService.updateByName(user);
        ResponseUtil responseUtil = new ResponseUtil();
        responseUtil.setStatus(1);
        responseUtil.setMsg("修改成功");
        return responseUtil;
    }
    /**
     * 创建用户
     * @return
     */
    @PostMapping("/insertByName")
    public ResponseUtil insertByName (@RequestBody User user){
        userService.insertByName(user);
        ResponseUtil responseUtil = new ResponseUtil();
        responseUtil.setStatus(1);
        responseUtil.setMsg("创建成功");
        return responseUtil;
    }
    /**
     * 根据id删除用户
     * @return
     */
    @DeleteMapping("/deleteByName")
    public ResponseUtil deleteByName (@RequestParam(name = "id", required = true) int id){
        userService.deleteByName(id);
        ResponseUtil responseUtil = new ResponseUtil();
        responseUtil.setStatus(1);
        responseUtil.setMsg("删除成功");
        return responseUtil;
    }
}
