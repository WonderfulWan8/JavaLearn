package com.imooc.mall.exception;

public enum ImoocMallExceptionEnum {
    NEED_USER_NAME(10001, "用户名不能为空"),
    NEED_USER_PASSWORD(10002, "密码不能为空"),
    PASSWORD_TOO_SHORT(10003, "密码长度不能小于八位"),
    NAME_EXISTED(10004, "不允许重名"),
    INSERT_FAILED(10005, "插入失败"),
    WRONG_PASSWORD(10006, "密码错误"),
    NEED_LOGIN(10007, "用户未登录"),
    UPDATE_FAILD(10008, "更新失败"),
    NEED_ADMIN(10009, "无管理员权限"),
    PARA_NOT_NULL(10010, "参数不能为空"),
    CREATE_FAILED(10011, "新增失败"),
    REQUEST_PARAM_ERROR(10012, "参数错误"),
    DELETE_FAILD(10013, "删除失败"),
    MKDIR_FAILD(10014, "文件夹创建失败"),
    UPLOAD_FAILD(10015, "图片上传失败"),
    BATCHUPDATE_FAILD(10016, "批量更新状态失败"),
    NOT_SELL(10017, "商品状态异常、商品状态不可售"),
    NOT_ENOUGH(10018, "商品库存不足"),

    CART_EMPTY(10019, "购物车已勾选商品为空"),
    NO_ENUM(10020, "未找到对应枚举类"),
    NO_ORDER(10021, "订单不存在"),
    NOT_YOUR_ORDER(10021, "订单不属于你"),
    WRONG_ORDER_STATUS(10022, "订单状态不符"),
    SYSTEM_ERROR(20000, "系统异常"),
    ;
    /**
     * 异常码
     */
    Integer code;
    /**
     * 异常信息
     */
    String msg;

    ImoocMallExceptionEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
