package com.example.demo.dao;


import com.example.demo.dto.ActivityDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ActivityDao {

     public List<ActivityDTO> selectActivityList(Integer id);
     public List<ActivityDTO> selectAllInfoList(Integer id);
}
