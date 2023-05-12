package com.maoxiaoyu.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.maoxiaoyu.reggie.entity.Orders;

/**
 * @version 17.0
 * @auther 猫小鱼
 */
public interface OrderService extends IService<Orders> {
    //实现用户下单的功能
    public void submit(Orders orders);
}
