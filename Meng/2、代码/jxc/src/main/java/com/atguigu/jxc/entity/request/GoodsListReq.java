package com.atguigu.jxc.entity.request;

public class GoodsListReq {
    private Integer page;
    private Integer rows;
    private String codeOrName;
    private Integer goodsTypeId;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public String getCodeOrName() {
        return codeOrName;
    }

    public void setCodeOrName(String codeOrName) {
        this.codeOrName = codeOrName;
    }

    public Integer getgoodsTypeId() {
        return goodsTypeId;
    }

    public void setgoodsTypeId(Integer goodsTypeId) {
        this.goodsTypeId = goodsTypeId;
    }

    @Override
    public String toString() {
        return "GoodsListReq{" +
                "page=" + page +
                ", rows=" + rows +
                ", codeOrName='" + codeOrName + '\'' +
                ", goodsTypeId=" + goodsTypeId +
                '}';
    }
}

