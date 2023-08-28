package com.imooc.mall.service;

import com.github.pagehelper.PageInfo;
import com.imooc.mall.model.query.vo.OrderVO;
import com.imooc.mall.model.request.CreateOrderReq;

/**
 * 描述： 订单service
 */
public interface OrderService {
    String create(CreateOrderReq createOrderReq);

    OrderVO detail(String orderNo);

    PageInfo listForCustomer(Integer pageNum, Integer pageSize);

    void cancle(String orderNo);

    String qrcode(String orderNo);

    PageInfo listForAdmin(Integer pageNum, Integer pageSize);

    void pay(String orderNo);

    void deliver(String orderNo);

    void finish(String orderNo);
}
