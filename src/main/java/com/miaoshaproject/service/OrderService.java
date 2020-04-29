package com.miaoshaproject.service;

import com.miaoshaproject.error.BusinessException;
import com.miaoshaproject.service.model.OrderModel;

/**
 * @Author: DLQ
 * @Date: 2020/4/29 23:36
 * @Version: 1.0
 */
public interface OrderService {
    OrderModel createModel(Integer userId, Integer itemId, Integer amount) throws BusinessException;
}
