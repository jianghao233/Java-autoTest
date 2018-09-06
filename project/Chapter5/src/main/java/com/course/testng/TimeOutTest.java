package com.course.testng;

import org.testng.annotations.Test;

public class TimeOutTest {

    @Test(timeOut = 3000)//单位为毫秒值 ，期待在3秒内得到响应结果
    public void testSuccess() throws InterruptedException {
        Thread.sleep(2000);  //线程休眠
    }

    @Test(timeOut = 2000)
    public void testFailed() throws InterruptedException {
        Thread.sleep(3000);
    }
}
