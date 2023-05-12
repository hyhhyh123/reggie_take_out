package com.maoxiaoyu.reggie.dto;

import com.maoxiaoyu.reggie.entity.Dish;
import com.maoxiaoyu.reggie.entity.DishFlavor;
import com.maoxiaoyu.reggie.entity.Dish;
import com.maoxiaoyu.reggie.entity.DishFlavor;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Data
public class DishDto extends Dish {

    private List<DishFlavor> flavors = new ArrayList<>();

    private String categoryName;

    private Integer copies;
}
