package com.imooc.mall.service.impl;

import com.imooc.mall.common.Constant;
import com.imooc.mall.exception.ImoocMallException;
import com.imooc.mall.exception.ImoocMallExceptionEnum;
import com.imooc.mall.model.dao.CartMapper;
import com.imooc.mall.model.dao.ProductMapper;
import com.imooc.mall.model.pojo.Cart;
import com.imooc.mall.model.pojo.Product;
import com.imooc.mall.model.query.vo.CartVO;
import com.imooc.mall.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 描述：购物车service实现类
 */
@Service
public class CartServiceImpl implements CartService {
    @Autowired
    CartMapper cartMapper;
    @Autowired
    ProductMapper productMapper;

    @Override
    public List<CartVO> list(Integer userId) {
        List<CartVO> cartVOS = cartMapper.selectList(userId);
        for (int i = 0; i < cartVOS.size(); i++) {
            CartVO cartVO = cartVOS.get(i);
            cartVO.setTotalPrice(cartVO.getPrice() * cartVO.getQuantity());
        }
        return cartVOS;
    }

    @Override
    public List<CartVO> add(Integer userId, Integer productId, Integer count) {
        valiProduct(productId, count);
        Cart cart = cartMapper.selectCartByUserAndProductId(userId, productId);
        if (cart == null) {
//        之前不在购物车,新增记录
            cart = new Cart();
            cart.setProductId(productId);
            cart.setUserId(userId);
            cart.setQuantity(count);
            cart.setSelected(Constant.Cart.CHECKED);
            cartMapper.insertSelective(cart);
        } else {
//        之前已在购物车，增加数量
            count = cart.getQuantity() + count;
            Cart cartNew = new Cart();
            cartNew.setQuantity(count);
            cartNew.setId(cart.getId());
            cartNew.setProductId(cart.getProductId());
            cartNew.setUserId(cart.getUserId());
            cartNew.setSelected(Constant.Cart.CHECKED);
            cartMapper.updateByPrimaryKeySelective(cartNew);
        }
        return this.list(userId);
    }

    private void valiProduct(Integer productId, Integer cout) {
        Product product = productMapper.selectByPrimaryKey(productId);
//        判断商品是否存在，商品是否上架
        if (product == null || product.getStatus().equals(Constant.SaleStatus.NOT_SALE)) {
            throw new ImoocMallException(ImoocMallExceptionEnum.NOT_SELL);
        }
//        判断商品库存
        if (cout > product.getStock()) {
            throw new ImoocMallException(ImoocMallExceptionEnum.NOT_ENOUGH);
        }
    }

    @Override
    public List<CartVO> update(Integer userId, Integer productId, Integer count) {
        valiProduct(productId, count);
        Cart cart = cartMapper.selectCartByUserAndProductId(userId, productId);
        if (cart == null) {
//        商品之前不在购物车,无法更新
            throw new ImoocMallException(ImoocMallExceptionEnum.UPDATE_FAILD);
        } else {
//        之前已在购物车，更新数量
            Cart cartNew = new Cart();
            cartNew.setQuantity(count);
            cartNew.setId(cart.getId());
            cartNew.setProductId(cart.getProductId());
            cartNew.setUserId(cart.getUserId());
            cartNew.setSelected(Constant.Cart.CHECKED);
            cartMapper.updateByPrimaryKeySelective(cartNew);
        }
        return this.list(userId);
    }

    @Override
    public List<CartVO> delete(Integer userId, Integer productId) {
        Cart cart = cartMapper.selectCartByUserAndProductId(userId, productId);
        if (cart == null) {
//        商品之前不在购物车,无法删除
            throw new ImoocMallException(ImoocMallExceptionEnum.DELETE_FAILD);
        } else {
//        之前已在购物车，可以删除
            cartMapper.deleteByPrimaryKey(cart.getId());
        }
        return this.list(userId);
    }

    @Override
    public List<CartVO> select(Integer userId, Integer productId, Integer selected) {
        Cart cart = cartMapper.selectCartByUserAndProductId(userId, productId);
        if (cart == null) {
//        商品之前不在购物车,无法进行选中操作
            throw new ImoocMallException(ImoocMallExceptionEnum.UPDATE_FAILD);
        } else {
//        之前已在购物车，可以更新状态
            cartMapper.selectOrNot(userId,productId,selected);
        }
        return this.list(userId);
    }
    @Override
    public List<CartVO> selectAll(Integer userId, Integer selected) {
//        改变选中状态，productId为null的时候查全部
        cartMapper.selectOrNot(userId,null,selected);
        return this.list(userId);
    }
}
