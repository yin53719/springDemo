package com.example.demo.controller;

import com.example.demo.dto.ActivityDTO;
import com.example.demo.dto.User;
import com.example.demo.po.ActivityPO;
import com.example.demo.service.ActivityService;
import com.example.demo.utils.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/activity")
public class ActivityController {

    @Autowired
    private ActivityService activityService;

    /**
    *  单表查询活动列表，或者根据id查询活动详情
    * */
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
    /**
     *  根据活动id关联查询活动以及创建人信息
     * */
    @GetMapping("/getAllInfoList")
    public ResponseUtil getAllInfoList(@RequestParam(name = "id", required = false) Integer id) {
        ResponseUtil response =  new ResponseUtil();
        List<ActivityDTO> activityDTOs = activityService.selectAllInfoList(id);
        response.setStatus(500);
        response.setData(activityDTOs);
        return response;

    }

    /**
     * 创建用户
     * @return
     */
    @PostMapping("/insertActivity")
    public ResponseUtil insertActivity (@RequestBody ActivityPO activityPO){
        activityService.insertActivity(activityPO);
        ResponseUtil responseUtil = new ResponseUtil();
        responseUtil.setStatus(1);
        responseUtil.setMsg("创建成功");
        return responseUtil;
    }
}
