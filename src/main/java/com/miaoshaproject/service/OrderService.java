package com.miaoshaproject.service;

import com.miaoshaproject.error.BusinessException;
import com.miaoshaproject.service.model.OrderModel;

/**
 * @Author: DLQ
 * @Date: 2020/4/29 23:36
 * @Version: 1.0
 */
public interface OrderService {
    //1、通过签单url上传过来秒杀活动id，然后下单接口内校验对应id是否属于对应商品且活动已开始（推荐使用）
    //2、直接在下单接口内判断对应的商品是否存在秒杀活动，若存在进行中的，则以秒杀价格下单
    OrderModel createOrder(Integer userId, Integer itemId, Integer promoId, Integer amount,String stockLogId) throws BusinessException;
}
