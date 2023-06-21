package com.example.backend.service.impl;

import com.example.backend.BackEndApplication;
import com.example.backend.entity.Activity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,classes = {BackEndApplication.class, ActivityServiceImpl.class})
//@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
//@RunWith(SpringRunner.class)
//@PropertySource(value = "classpath:application.properties")
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,classes = BackEndApplication.class)
public class ActivityServiceImplTest {

    @Autowired
    private ActivityServiceImpl activityServiceImpl;

    @Test
    public void testcreateAct() {
        //用例一
        Activity act=new Activity();
        act.setActivity_id(123L);
        Long ID=activityServiceImpl.CreateAct(act);
        System.out.println(ID);
        //用例一
        Activity act1=null;
        //act.setActivity_id(123L);
        Long ID1=activityServiceImpl.CreateAct(act1);
        System.out.println(ID1);
    }
}
