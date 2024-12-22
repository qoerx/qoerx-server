package org.qoerx.common.exception;

import lombok.Data;

/**
 * 自定义异常类
 * Author: wangshuo
 * Date: 2024/12/22 上午10:17
 */
@Data
public class QoerxException extends RuntimeException{
    private int code;
    private String msg;
}
