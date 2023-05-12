package com.maoxiaoyu.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.maoxiaoyu.reggie.entity.Category;

/**
 * @version 17.0
 * @auther 猫小鱼
 */
public interface CategoryService extends IService<Category> {
    public void remove(Long ids);
}
