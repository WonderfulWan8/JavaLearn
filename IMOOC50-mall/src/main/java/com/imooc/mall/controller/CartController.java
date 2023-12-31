package com.imooc.mall.controller;

import com.imooc.mall.common.ApiRestResponse;
import com.imooc.mall.filter.UserFilter;
import com.imooc.mall.model.query.vo.CartVO;
import com.imooc.mall.model.query.vo.CategoryVO;
import com.imooc.mall.service.CartService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 描述：购物车controller
 */
@RestController
@RequestMapping("/cart")
public class CartController {
    @Autowired
    CartService cartService;

    @PostMapping("/add")
    @ApiOperation("添加商品到购物车")
    public ApiRestResponse add(@RequestParam Integer productId, @RequestParam Integer count) {
        List<CartVO> cartVOList = cartService.add(UserFilter.currentUser.getId(), productId, count);
        return ApiRestResponse.success(cartVOList);
    }

    @GetMapping("/list")
    @ApiOperation("购物车商品列表")
    public ApiRestResponse list() {
//         内部获取用户ID 防止横向越权
        List<CartVO> cartVOList = cartService.list(UserFilter.currentUser.getId());
        return ApiRestResponse.success(cartVOList);
    }

    @PostMapping("/update")
    @ApiOperation("更新购物车")
    public ApiRestResponse update(@RequestParam Integer productId, @RequestParam Integer count) {
        //         内部获取用户ID 防止横向越权
        List<CartVO> cartVOList = cartService.update(UserFilter.currentUser.getId(), productId, count);
        return ApiRestResponse.success(cartVOList);
    }

    @PostMapping("/delete")
    @ApiOperation("删除购物车商品")
    public ApiRestResponse delete(@RequestParam Integer productId) {
        //         内部获取用户ID 防止横向越权 否则删除到别人的购物车了
        List<CartVO> cartVOList = cartService.delete(UserFilter.currentUser.getId(), productId);
        return ApiRestResponse.success(cartVOList);
    }

    @PostMapping("/select")
    @ApiOperation("选择/不选择购物车的商品")
    public ApiRestResponse select(@RequestParam Integer productId, @RequestParam Integer selected) {
        //         内部获取用户ID 防止横向越权 否则删除到别人的购物车了
        List<CartVO> cartVOList = cartService.select(UserFilter.currentUser.getId(), productId, selected);
        return ApiRestResponse.success(cartVOList);
    }
    @PostMapping("/selectAll")
    @ApiOperation("全选/全不选购物车的商品")
    public ApiRestResponse selectAll(@RequestParam Integer selected) {
        //         内部获取用户ID 防止横向越权 否则删除到别人的购物车了
        List<CartVO> cartVOList = cartService.selectAll(UserFilter.currentUser.getId(), selected);
        return ApiRestResponse.success(cartVOList);
    }
}
