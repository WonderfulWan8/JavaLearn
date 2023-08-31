package com.atguigu.jxc.service;

import com.atguigu.jxc.domain.ServiceVO;
import com.atguigu.jxc.entity.Goods;
import com.atguigu.jxc.entity.request.GoodsListReq;

import java.util.List;
import java.util.Map;

public interface GoodsService {


    ServiceVO getCode();


    List<Goods> listInventory(GoodsListReq goodsListReq);
}
