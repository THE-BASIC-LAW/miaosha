package com.miaoshaproject.controller;

import com.miaoshaproject.controller.viewobject.ItemVO;
import com.miaoshaproject.response.CommonReturnType;
import com.miaoshaproject.service.model.ItemModel;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @Author: DLQ
 * @Date: 2020/4/29 14:15
 * @Version 1.0
 */
@Controller("/item")
@RequestMapping("/item")
@CrossOrigin(allowCredentials = "true")
public class ItemController {

    //创建商品的controller
    public CommonReturnType createItem(@RequestParam(name = "title") String title,
                                       @RequestParam(name = "description") String description,
                                       @RequestParam(name = "price") BigDecimal price,
                                       @RequestParam(name = "stock") Integer stock,
                                       @RequestParam(name = "imageUrl") String imageUrl) {
        //封装service请求用来创建商品
        ItemModel itemModel = new ItemModel();
        itemModel.setTitle(title);
        itemModel.setDescription(description);
        itemModel.setPrice(price);
        itemModel.setStock(stock);
        itemModel.setImageUrl(imageUrl);

        ItemModel itemModelReturn = itemService.createItem(itemModel);
        ItemVO itemVO = new ItemVO();
        return CommonReturnType.create(itemModelReturn)
    }

    private ItemVO convertBOFromModel(ItemModel itemModel) {
        if(itemModel == null) {
            return null;
        }
        ItemVO itemVO = new ItemVO();
        BeanUtils.copyProperties(itemModel, itemVO);
        return itemVO;
    }
}
