package com.miaosha.utils;

/**
 * 错误状态码
 */
public class CodeMsg {

    private int code;
    private String msg;

    /**
     * 可以创建多个错误对象
     */
    public static CodeMsg successCode = new CodeMsg(200,"succes");
    public static CodeMsg errorCode = new CodeMsg(500,"服务内部错误");

    private CodeMsg(int code, String succes) {
        this.code = code;
        this.msg = succes;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
