package com.imooc.mybatis.entity;

import java.io.Serializable;

/**
 * (TGoodsDetail)实体类
 *
 * @author makejava
 * @since 2023-08-05 09:44:56
 */
public class GoodsDetail implements Serializable {
    private static final long serialVersionUID = -97318397645110894L;
    
    private Integer gdId;
    
    private Integer goodsId;
    
    private String gdPicUrl;
    
    private Integer gdOrder;

    private Goods goods;
    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    @Override
    public String toString() {
        return "TGoodsDetail{" +
                "gdId=" + gdId +
                ", goodsId=" + goodsId +
                ", gdPicUrl='" + gdPicUrl + '\'' +
                ", gdOrder=" + gdOrder +
                '}';
    }

    public Integer getGdId() {
        return gdId;
    }

    public void setGdId(Integer gdId) {
        this.gdId = gdId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGdPicUrl() {
        return gdPicUrl;
    }

    public void setGdPicUrl(String gdPicUrl) {
        this.gdPicUrl = gdPicUrl;
    }

    public Integer getGdOrder() {
        return gdOrder;
    }

    public void setGdOrder(Integer gdOrder) {
        this.gdOrder = gdOrder;
    }

}

