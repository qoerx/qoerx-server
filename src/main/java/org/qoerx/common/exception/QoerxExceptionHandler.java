package org.qoerx.common.exception;

import lombok.extern.slf4j.Slf4j;
import org.qoerx.common.result.Result;
import org.qoerx.common.result.ResultEnum;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.resource.NoResourceFoundException;

/**
 * 异常处理器
 * Author: wangshuo
 * Date: 2024/12/22 上午10:19
 */
@RestControllerAdvice
@Slf4j
public class QoerxExceptionHandler {

    /**
     * 处理自定义异常
     * */
    @ExceptionHandler(QoerxException.class)
    public Result<String> handleQoerxException(QoerxException e) {
        log.error("自定义异常：", e.getMessage());
        return Result.error(e.getCode(), e.getMsg());
    }

    /**
     * 资源未找到处理
     * */
    @ExceptionHandler(NoResourceFoundException.class)
    public Result<String> handleResourceNotFoundException(NoResourceFoundException e){
        log.error(e.getMessage(), e);
        return Result.error(ResultEnum.RESOURCE_NOT_FOUND.getCode(), ResultEnum.RESOURCE_NOT_FOUND.getMessage());
    }


    /**
     * 通用异常类
     * */
    @ExceptionHandler(Exception.class)
    public Result<String> handleException(Exception e){
        log.error(e.getMessage(), e);
        return Result.error(ResultEnum.ERROR.getCode(), ResultEnum.ERROR.getMessage());
    }
}
