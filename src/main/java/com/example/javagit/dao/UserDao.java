package com.example.javagit.dao;


import org.junit.*;

import java.util.Arrays;
import java.util.List;

public class UserDao {
    public static void main(String[] args) {
        //关掉拼写检查
        List<Object> objectList = Arrays.asList(new String[]{"chenshiqi"});
        System.out.print(objectList.toString());
    }

    @Test
    public void test(){
        System.out.println("hello world!");
    }

    @BeforeClass
    public static void before(){
        System.out.println("开始之前");
    }

    @AfterClass
    public static void after(){
        System.out.println("完成之后");
    }

    @Before
    public void willbefore(){
        System.out.println("要开始了……");
    }

    @After
    public void willafter(){
        System.out.println("要结束了……");
    }
}
