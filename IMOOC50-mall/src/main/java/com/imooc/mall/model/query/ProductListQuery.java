package com.imooc.mall.model.query;

import java.util.List;

/**
 * 描述： 商品列表的query
 */
public class ProductListQuery {
//    目录处理：如果查某个目录下的商品，不仅是需要查出来该目录的，还需要查出来子目录的所有商品
//    所以这里要拿到某一个目录id下的所有子目录id的list
    private String keyword;
    private List<Integer> categoryIds;

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public List<Integer> getCategoryIds() {
        return categoryIds;
    }

    public void setCategoryIds(List<Integer> categoryIds) {
        this.categoryIds = categoryIds;
    }
}


























