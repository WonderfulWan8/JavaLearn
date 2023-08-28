package com.imooc.mall.controller;

import com.github.pagehelper.PageInfo;
import com.imooc.mall.common.ApiRestResponse;
import com.imooc.mall.model.query.vo.OrderVO;
import com.imooc.mall.model.request.CreateOrderReq;
import com.imooc.mall.service.OrderService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * 描述： 订单controller
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    OrderService orderService;

    @PostMapping("/create")
    @ApiOperation("创建订单")
    public ApiRestResponse create(@RequestBody CreateOrderReq createOrderReq) {
        String orderNo = orderService.create(createOrderReq);
        return ApiRestResponse.success(orderNo);
    }

    @GetMapping("/detail")
    @ApiOperation("前台订单详情")
    public ApiRestResponse detail(@RequestParam String orderNo) {
        OrderVO orderVO = orderService.detail(orderNo);
        return ApiRestResponse.success(orderVO);
    }

    @GetMapping("/list")
    @ApiOperation("前台订单列表")
    public ApiRestResponse list(@RequestParam Integer pageNum, @RequestParam Integer pageSize) {
        PageInfo pageInfo = orderService.listForCustomer(pageNum, pageSize);
        return ApiRestResponse.success(pageInfo);
    }

    @GetMapping("/cancle")
    @ApiOperation("前台取消订单")
    public ApiRestResponse cancle(@RequestParam String orderNo) {
        orderService.cancle(orderNo);
        return ApiRestResponse.success();
    }

    @PostMapping("/qrcode")
    @ApiOperation("生成支付二维码")
    public ApiRestResponse qrcode(@RequestParam String orderNo) {
        String pngAddress = orderService.qrcode(orderNo);
        return ApiRestResponse.success(pngAddress);
    }

    @GetMapping("/pay")
    @ApiOperation("支付订单")
    public ApiRestResponse pay(@RequestParam String orderNo) {
        orderService.pay(orderNo);
        return ApiRestResponse.success();
    }

    @PostMapping("/deliver")
    @ApiOperation("发货")
    public ApiRestResponse deliver(@RequestParam String orderNo) {
        orderService.deliver(orderNo);
        return ApiRestResponse.success();
    }

    /**
     * 完结订单 管理员和用户都可以调用
     * @param orderNo
     * @return
     */
    @PostMapping("/finish")
    @ApiOperation("完结订单")
    public ApiRestResponse finish(@RequestParam String orderNo) {
        orderService.finish(orderNo);
        return ApiRestResponse.success();
    }
}

