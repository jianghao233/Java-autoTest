package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {

    //最基本的注解，用来把方法标记为测试的一部分
    @Test
    public void testCase1(){
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
        System.out.println("Test这是测试用例1");
    }

    @Test
    public void testCase2(){
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
        System.out.println("Test这是测试用例2");
    }
    //在测试方法之前运行的标签
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod这是在测试方法之前运行的");
    }
  //在测试方法之后运行的标签
    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod这是在测试方法之后运行的");
    }
  //在类运行之前运行的方法
    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass这是在类运行之前运行的方法");
    }
  //在类运行之后运行的方法
  //使用场景：在类正式运行之前，是否需要注册对象或一些静态的方法或变量赋值在该方法里写，写完之后其他的方法中可以使用；
    @AfterClass
    public void afterClass(){
        System.out.println("afterClass这是在类运行之后运行的方法");
    }
    
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite测试套件");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite测试套件");
    }
}
