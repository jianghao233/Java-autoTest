package com.course.testng.suite;

import org.testng.annotations.Test;
//写测试主要的 Test 下包含的方法
public class LoginTest {

    @Test
    public void loginTaoBao(){
        System.out.println("淘宝登陆成功");
    }
}
