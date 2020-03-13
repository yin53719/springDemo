package com.example.demo.service;

import com.example.demo.po.ActivityPO;

public class ActivityService {

   public ActivityPO getActivityInfo (){
       ActivityPO activityPO = new ActivityPO();


       activityPO.setUserName("hardy1111");
       activityPO.setPassWord("pass1234");
       activityPO.setPhone(123456);
       activityPO.setStatus(1);

       return activityPO;
   }
}
