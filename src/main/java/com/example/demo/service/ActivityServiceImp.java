package com.example.demo.service;

import com.example.demo.dao.ActivityDao;
import com.example.demo.dto.ActivityDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityServiceImp implements ActivityService {
    @Autowired
    private ActivityDao activityDao;

    @Override
   public List<ActivityDTO> selectActivityList(Integer id){

     return  activityDao.selectActivityList(id);

   }
    @Override
   public List<ActivityDTO> selectAllInfoList(Integer id){

     return  activityDao.selectAllInfoList(id);

   }
}
