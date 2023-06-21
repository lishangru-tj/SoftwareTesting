package com.example.backend.service.impl;

import com.example.backend.BackEndApplication;
import com.example.backend.common.Result;
import com.example.backend.entity.User;
import org.junit.Test;
import com.example.backend.service.UserService;
import com.example.backend.mapper.UserMapper;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,classes = BackEndApplication.class)
public class UserServiceImplTest {
    @Resource
    public UserService userService;
    @Test
    public void testconfirmUser() {
        String email="12";
        String password="12";
        //测试用例一：用户不存在
        email="11@qq.com";
        password="yy657826";
        Result r=userService.confirmUser(email,password);
        if(r.getCode()==10001&&r.getMsg()=="用户不存在")
        {
            System.out.printf("测试用例一通过，该用户不存在\n");
        }
        else {
            System.out.printf("测试用例一不通过\n");
        }


        //测试用例二：密码错误
        email="657826973@qq.com";
        password="11";//正确的密码是："yy657826973"
        r=userService.confirmUser(email,password);
        if(r.getCode()==10001&&r.getMsg()=="密码错误")
        {
            System.out.printf("测试用例二通过，密码错误\n");
        }
        else {
            System.out.printf("测试用例二不通过\n");
        }

        //测试用例三：用户账号封禁中

        email="1558124206@qq.com";
        password="yy657826973";//正确的密码是："yy657826973"
        r=userService.confirmUser(email,password);
        String MSG=r.getMsg();
        if(r.getCode()==10001&&MSG!="用户不存在"&&MSG!="密码错误")
        {
            System.out.printf("测试用例三通过，账号封禁中\n");
        }
        else {
            System.out.printf("测试用例三不通过:"+MSG+"over\n");
        }

        //测试用例四：账号密码正确
        email="657826973@qq.com";
        password="yy657826973";//正确的密码是："yy657826973"
        r=userService.confirmUser(email,password);
        if(r.isSuccess())
        {
            System.out.printf("测试用例四通过，账号密码通过，成功登陆");
        }
        else {
            System.out.printf("测试用例四不通过");
        }

    }



    @Test
    public void testmvnregisterUser() {
        String email="";
        String password="";
        String name="";
        //测试用例一:  注册失败，邮箱已被注册
        Result r=userService.registerUser(email,password,name);
        if(r.getCode()==10001&&r.getMsg()=="用户已验证")
        {
            System.out.printf("测试用例一通过，该用户邮箱已被验证\n");
        }
        else {
            System.out.printf("测试用例二不通过\n");
        }

        //测试用例二： 注册失败，向邮箱发送验证信息,验证失败
        r=userService.registerUser(email,password,name);
        if(r.getCode()==10001&&r.getMsg()=="用户已验证")
        {
            System.out.printf("测试用例一通过，该用户邮箱已被验证\n");
        }
        else {
            System.out.printf("测试用例二不通过\n");
        }

        //测试用例三： 注册成功，向邮箱发送验证信息，验证成功
        r=userService.registerUser(email,password,name);
        if(r.getCode()==10001&&r.getMsg()=="用户已验证")
        {
            System.out.printf("测试用例一通过，该用户邮箱已被验证\n");
        }
        else {
            System.out.printf("测试用例二不通过\n");
        }



    }
}
