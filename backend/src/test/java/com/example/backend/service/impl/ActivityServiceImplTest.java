package com.example.backend.service.impl;

import com.example.backend.BackEndApplication;
import com.example.backend.entity.Activity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,classes = {BackEndApplication.class, ActivityServiceImpl.class})
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@RunWith(SpringRunner.class)
public class ActivityServiceImplTest {

    @Autowired
    private ActivityServiceImpl activityServiceImpl;
    @Test
    public void getAll() {
    }

    @Test
    public void getUserAllCreateActList() {
    }

    @Test
    public void getUserAllApplyActList() {
    }

    @Test
    public void getUserAllActList() {
    }

    @Test
    public void getTestActList() {
    }

    @Test
    public void getAct() {
    }

    @Test
    public void createAct() {
        Activity act=new Activity();
        act.setActivity_id(123L);
        Long ID=activityServiceImpl.CreateAct(act);
        System.out.println(ID);
    }

    @Test
    public void deleteAct() {
    }

    @Test
    public void updateAct() {
    }

    @Test
    public void isCreator() {
    }

    @Test
    public void setActivityState() {
    }

    @Test
    public void getUserAllParticipateActList() {
    }

    @Test
    public void getMapActList() {
    }

    @Test
    public void patchActImages() {
    }

    @Test
    public void getAvailableActs() {
    }

    @Test
    public void activityHitNumPlus() {
    }

    @Test
    public void modifyActivityRemind() {
    }
}