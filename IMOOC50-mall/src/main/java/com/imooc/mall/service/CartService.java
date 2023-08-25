package com.imooc.mall.service;

import com.imooc.mall.model.query.vo.CartVO;

import java.util.List;

/**
 * 描述： 购物车service
 */
public interface CartService {
    List<CartVO> list(Integer userId);

    List<CartVO> add(Integer userId, Integer productId, Integer count);

    List<CartVO> update(Integer userId, Integer productId, Integer count);

    List<CartVO> delete(Integer userId, Integer productId);

    List<CartVO> select(Integer userId, Integer productId, Integer selected);

    List<CartVO> selectAll(Integer userId, Integer selected);
}
