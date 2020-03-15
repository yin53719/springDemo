package com.example.demo.controller;

import com.example.demo.dto.ActivityDTO;
import com.example.demo.service.ActivityService;
import com.example.demo.utils.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/activity")
public class ActivityController {

    @Autowired
    private ActivityService activityService;

//    @GetMapping("/getActivity")
//    public ActivityDTO getActivity(@RequestParam(value = "id") int id) {
//
//        ActivityDTO activityDTO = new ActivityDTO();
//        activityDTO = activityService.selectActivityList(id);
//
//
//        return activityDTO;
//
//    }

    @GetMapping("/getActivityList")
    public ResponseUtil getActivityList(Integer id) {
        ResponseUtil response =  new ResponseUtil();
        try{
            List<ActivityDTO> activityDTOs = activityService.selectActivityList(id);
            response.setStatus(200);
            response.setData(activityDTOs);
        }catch(Exception e){
            response.setStatus(500);
            response.setMsg(e.getMessage());
        }
        return response;

    }

    @GetMapping("/getAllInfoList")
    public ResponseUtil getAllInfoList(@RequestParam(name = "id", required = false) Integer id) {
        ResponseUtil response =  new ResponseUtil();
        List<ActivityDTO> activityDTOs = activityService.selectAllInfoList(id);
        Map<String,Object> result = new HashMap<String,Object>();
        response.setStatus(500);
        response.setData(activityDTOs);
        return response;

    }
}
