package com.maoxiaoyu.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.maoxiaoyu.reggie.entity.AddressBook;
import com.maoxiaoyu.reggie.mapper.AddressBookMapper;
import com.maoxiaoyu.reggie.service.AddressBookService;
import org.springframework.stereotype.Service;

/**
 * @version 17.0
 * @auther 猫小鱼
 */
@Service
public class AddressBookServiceImpl extends ServiceImpl<AddressBookMapper, AddressBook> implements AddressBookService {
}
