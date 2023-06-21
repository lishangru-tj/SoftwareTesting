package com.example.backend.service.impl;

import com.example.backend.BackEndApplication;
import com.example.backend.common.Result;
import com.example.backend.entity.Task;
import com.example.backend.service.TaskService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,classes = BackEndApplication.class)
public class TaskServiceImplTest {

    @Resource
    public TaskService taskService;
    @Test
    public void testfindOneTaskAndRelative() {
        //用例1:
        Long id=Long.parseLong("1650822563365000000");
        Task task = taskService.findOneTaskAndRelative(id);
        System.out.printf("根据id"+id+"查找到的task信息：" + task);
        //用例2:
        id=Long.parseLong("1650822563365588993");
        task = taskService.findOneTaskAndRelative(id);
        System.out.printf("根据id"+id+"查找到的task信息：" + task);
        //用例3:
        id=Long.parseLong("1651046925918195713");
        task = taskService.findOneTaskAndRelative(id);
        System.out.printf("根据id"+id+"查找到的task信息：" + task);
    }

    @Test
    public void testmodifyTaskStatus() {
        Long id=Long.parseLong("1650822924532912130");
        Task task1=taskService.findOneTaskAndRelative(id);
        short a=0;
        task1.setTaskState(a);
        Result<String> result=taskService.patchOneTask(task1);
        System.out.printf(result.getData());

        id=Long.parseLong("1650822563365588993");
        Task task2=taskService.findOneTaskAndRelative(id);
        short b=1;
        task2.setTaskState(b);
        result=taskService.patchOneTask(task2);
        System.out.printf(result.getData());

        id=Long.parseLong("1651047066418991106");
        Task task3=taskService.findOneTaskAndRelative(id);
        short c=1;
        task3.setTaskState(c);
        result=taskService.patchOneTask(task3);
        System.out.printf(result.getData());
    }
}