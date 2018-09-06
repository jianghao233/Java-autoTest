package com.course.testng.multiThread;

import org.testng.annotations.Test;

public class MultiThreadOnAnnotion {

    @Test(invocationCount = 10,threadPoolSize = 3)  //用10个线程来执行，设置现场池为3
    public void test(){
        System.out.println(1);
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId()); //打印出线程ID
    }

}
