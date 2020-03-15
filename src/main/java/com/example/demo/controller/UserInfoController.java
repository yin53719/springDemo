package com.example.demo.controller;

import com.example.demo.dto.User;
import com.example.demo.service.UserService;
import com.example.demo.utils.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserInfoController {
    @Autowired
    private  UserService userService ;
    private Object Map;
    /**
    * 根据用户名查询用户
    * @return
    */
    @GetMapping("/getUserInfo")
    public User getUserInfo (@RequestParam(name = "userName", required = false) String userName){
        User user = new User();
        user  = userService.selectUserByName(userName);
       return user;
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
