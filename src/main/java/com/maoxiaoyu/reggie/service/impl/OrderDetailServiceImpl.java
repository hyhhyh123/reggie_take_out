package com.maoxiaoyu.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.maoxiaoyu.reggie.entity.OrderDetail;
import com.maoxiaoyu.reggie.mapper.OrderDetailMapper;
import com.maoxiaoyu.reggie.service.OrderDetailService;
import org.springframework.stereotype.Service;

/**
 * @version 17.0
 * @auther 猫小鱼
 */
@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {
}
