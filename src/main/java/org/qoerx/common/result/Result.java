package org.qoerx.common.result;

import lombok.Data;

/**
 * Author: wangshuo
 * Date: 2024/12/22 上午10:13
 */
@Data
public class Result<T> {
    /**
     * 成功标志
     */
    private boolean success = true;
    /**
     * 返回代码
     */
    private int code;
    /**
     * 返回处理消息
     */
    private String message;
    /**
     * 返回数据对象 data
     */
    private T data;
    /**
     * 时间戳
     */
    private long timestamp = System.currentTimeMillis();
    public Result() {
    }
    public Result(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static<T> Result<T> ok(T data) {
        Result<T> r = new Result<T>();
        r.setSuccess(true);
        r.setCode(ResultEnum.SUCCESS.getCode());
        r.setData(data);
        return r;
    }

    public static<T> Result<T> error(Integer code, String message) {
        Result<T> r = new Result<T>();
        r.setSuccess(true);
        r.setCode(code);
        r.setMessage(message);
        r.setData(null);
        return r;
    }
}
