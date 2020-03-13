package com.example.demo.controller.UserInfo;

import com.example.demo.dto.UserInfoDto;
import com.example.demo.po.UserInfoPo;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public class UserInfoController {

    public UserInfoDto userInfoDto(){
        UserInfoDto userInfoDto = new UserInfoDto();
        UserInfoPo userInfoPo = new UserInfoPo();
       return userInfoDto;
    }
}
