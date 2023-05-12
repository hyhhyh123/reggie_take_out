package com.maoxiaoyu.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.maoxiaoyu.reggie.entity.Employee;
import com.maoxiaoyu.reggie.mapper.EmployeeMapper;
import com.maoxiaoyu.reggie.service.EmployeeService;
import org.springframework.stereotype.Service;

/**
 * @version 17.0
 * @auther 猫小鱼
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}
