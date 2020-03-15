package com.example.demo.service;

import com.example.demo.dto.ActivityDTO;
import com.example.demo.po.ActivityPO;

import java.util.List;

public interface ActivityService {

    List<ActivityDTO> selectActivityList(Integer id);
    List<ActivityDTO> selectAllInfoList(Integer id);

    void insertActivity(ActivityPO activityPO);
}
