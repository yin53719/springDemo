package com.example.demo.service;

import com.example.demo.dto.ActivityDTO;

import java.util.List;

public interface ActivityService {

    List<ActivityDTO> selectActivityList(Integer id);
    List<ActivityDTO> selectAllInfoList(Integer id);
}
