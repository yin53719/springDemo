package com.example.demo.dao;


import com.example.demo.dto.ActivityDTO;

import com.example.demo.po.ActivityPO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ActivityDao {

     public List<ActivityDTO> selectActivityList(Integer id);
     public List<ActivityDTO> selectAllInfoList(Integer id);

     public void insertActivity(ActivityPO activityPO);
}
