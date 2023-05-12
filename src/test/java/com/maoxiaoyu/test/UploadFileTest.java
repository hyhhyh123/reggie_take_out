package com.maoxiaoyu.test;

import org.junit.jupiter.api.Test;

/**
 * @version 17.0
 * @auther 猫小鱼
 */
public class UploadFileTest {
    @Test
    public void test1(){
        String fileName = "ererewe.jpg";
        String suffix = fileName.substring(fileName.lastIndexOf("."));
        System.out.println(suffix);
    }
}
