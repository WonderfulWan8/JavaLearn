package com.imooc.mall.service;

import com.imooc.mall.model.request.CreateOrderReq;

/**
 * 描述： 订单service
 */
public interface OrderService {
    String create(CreateOrderReq createOrderReq);
}
