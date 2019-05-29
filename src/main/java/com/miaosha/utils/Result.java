package com.miaosha.utils;

/**
 * 封装返回的结果
 * @param <T>
 */
public class Result<T> {

    private int code;//状态码
    private String msg;//错误信息
    private T data;//返回的结果

    private Result(T data) {
        this.code = 200;
        this.msg = "success";
        this.data = data;
    }
    private Result(CodeMsg codeMsg){
        if (codeMsg == null) return;
        this.code = codeMsg.getCode();
        this.msg = codeMsg.getMsg();
    }

    /**
     * 成功的时候调用
     * @param data
     * @return
     */
    public static Result success(Object data){
        return  new Result(data);
    }

    /**
     * 失败的时候调用
     * @param codeMsg
     * @return
     */
    public static Result error(CodeMsg codeMsg){
        return new Result(codeMsg);
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public T getData() {
        return data;
    }
}
