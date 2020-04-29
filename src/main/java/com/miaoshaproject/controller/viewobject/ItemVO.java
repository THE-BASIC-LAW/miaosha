package com.miaoshaproject.controller.viewobject;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * @Author: DLQ
 * @Date: 2020/4/29 14:13
 * @Version 1.0
 */
public class ItemVO {
    private Integer id;

    //商品名称
    private String title;

    //商品价格
    private BigDecimal price;

    //商品销量
    private Integer sales;

    //商品库存
    private Integer stock;

    //商品描述
    private String description;

    //商品图片链接
    private String imageUrl;
}
