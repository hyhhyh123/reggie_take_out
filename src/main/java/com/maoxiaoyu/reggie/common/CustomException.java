package com.maoxiaoyu.reggie.common;

/**
 * 自定义业务异常类
 * @version 17.0
 * @auther 猫小鱼
 */
public class CustomException extends RuntimeException{
    public CustomException(String message){
        super(message);
    }
}
