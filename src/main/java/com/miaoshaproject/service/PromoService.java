package com.miaoshaproject.service;

import com.miaoshaproject.service.model.PromoModel;

/**
 * @Author: DLQ
 * @Date: 2020/5/1 0:16
 * @Version: 1.0
 */
public interface PromoService {
    // 根据itemId获取即将进行或正在进行的秒杀活动
    PromoModel getPromoModelByItemId(Integer itemId);

    //活动发布
    void publishPromo(Integer promoId);

    //生成秒杀令牌
    String generateSecondKillToken(Integer promoId, Integer itemId, Integer userId);
}
