package org.qoerx.common.result;

/**
 * 返回信息枚举
 * Author: wangshuo
 * Date: 2024/12/22 上午10:13
 */
public enum ResultEnum {
    SUCCESS(200, "操作成功"),
    ERROR(500, "操作失败"),
    RESOURCE_NOT_FOUND(404, "资源不存在，请检查您的路径是否正确");

    private Integer code;

    private String message;

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
