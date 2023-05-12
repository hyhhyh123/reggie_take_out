package com.maoxiaoyu.reggie.dto;

import com.maoxiaoyu.reggie.entity.Setmeal;
import com.maoxiaoyu.reggie.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
