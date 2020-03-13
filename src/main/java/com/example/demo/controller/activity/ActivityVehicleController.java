package com.example.demo.controller.activity;

import com.example.demo.dto.ActivityDTO;
import com.example.demo.service.ActivityService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import  com.example.demo.dto.ActivityDTO;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ActivityVehicleController {


    @GetMapping("/hello")
    public ActivityDTO hello(@RequestParam(value = "name", defaultValue = "World") String name) {

        ActivityDTO activityDTO = new ActivityDTO();

        ActivityService activityService = new ActivityService();

        activityDTO.setUserName(activityService.getActivityInfo().userName);
        activityDTO.setPassWord(activityService.getActivityInfo().passWord);
        activityDTO.setPhone(activityService.getActivityInfo().phone);

        return activityDTO;
    }
}
