package com.imooc.mall.model.dao;

import com.imooc.mall.model.pojo.Order;
import com.imooc.mall.model.pojo.OrderItem;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    Order selectByOrderNo(String selectByOrderNo);

    List<Order> selectForCustomer(Integer useId);
    List<Order> selectAll();
}