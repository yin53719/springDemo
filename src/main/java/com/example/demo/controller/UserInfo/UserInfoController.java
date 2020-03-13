package com.example.demo.controller.UserInfo;

import com.example.demo.dto.User;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
@RequestMapping("/api")
public class UserInfoController {
    private  UserService userService ;

    @GetMapping("/login")
    public User login (@RequestParam(name = "userName", required = false) String userName){
        User user = new User();
        System.out.println(userName);

        user  = userService.selectUserByName(userName);
       return user;
    }
}
