package com.example.backend.service.impl;

import com.example.backend.BackEndApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,classes = {BackEndApplication.class, ActivityTagServiceImpl.class})
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@RunWith(SpringRunner.class)
public class ActivityTagServiceImplTest {

    @Autowired
    private ActivityTagServiceImpl activityTagService;
    @Test
    public void getActIDByTags() {

        List<Long> requiredTags=new ArrayList<>();
        List<Long> activity_id;
        //用例1
        requiredTags.add(1L);
        requiredTags.add(2L);
        requiredTags.add(10L);
        requiredTags.add(100L);
        activity_id=activityTagService.getActIDByTags(requiredTags);
        System.out.println("用例1");
        if(activity_id!=null)
        for(int i=0;i<activity_id.size();i++){
            System.out.println(activity_id.get(i)+'\n');
        }
//        用例2
        requiredTags.clear();
        requiredTags=null;
        activity_id=activityTagService.getActIDByTags(requiredTags);
        System.out.println("用例2");
        if(activity_id!=null)
            for(int i=0;i<activity_id.size();i++){
                System.out.println(activity_id.get(i)+'\n');
            }
        //用例3
        List RequiredTags=new ArrayList();
        RequiredTags.add("1123");
        RequiredTags.add(123);
        RequiredTags.add("asd");
        activity_id=activityTagService.getActIDByTags(requiredTags);
        System.out.println("用例3");
        if(activity_id!=null)
            for(int i=0;i<activity_id.size();i++){
                System.out.println(activity_id.get(i)+'\n');
            }
    }
}
