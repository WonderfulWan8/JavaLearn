package com.imooc.mall.controller;

import com.github.pagehelper.PageInfo;
import com.imooc.mall.common.ApiRestResponse;
import com.imooc.mall.service.OrderService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述: 订单后台管理Controller
 */
@RestController
public class OrderAdminController {
    @Autowired
    OrderService orderService;
    @GetMapping("admin/order/list")
    @ApiOperation("管理员订单列表")
    public ApiRestResponse listForAdmin(@RequestParam Integer pageNum,@RequestParam Integer pageSize){
       PageInfo pageInfo = orderService.listForAdmin(pageNum,pageSize);
       return ApiRestResponse.success(pageInfo);
    }

    /**
     * 发货 订单状态流程  0用户已取消，10未付款（初始状态），20已付款，30已发货，40交易完成
     */
}



