package org.qoerx.common.result;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * 返回结果
 * Author: wangshuo
 * Date: 2024/12/22 上午10:13
 */
@Schema(description = "返回结果")
@Data
public class Result<T> {
    /**
     * 成功标志
     */
    @Schema(description = "成功标志")
    private boolean success = true;
    /**
     * 结果编码
     */
    @Schema(description = "结果编码")
    private int code;
    /**
     * 结果消息
     */
    @Schema(description = "结果消息")
    private String message;
    /**
     * 返回数据对象 data
     */
    @Schema(description = "返回数据对象")
    private T data;
    /**
     * 时间戳
     */
    @Schema(description = "时间戳")
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
