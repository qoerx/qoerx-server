package org.qoerx.common.base.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * 基础实体类
 * Author: wangshuo
 * Date: 2024/12/22 下午7:57
 */
@Schema(description = "基础实体类")
@Data
public class BaseEntity {
    /**创建人id*/
    @Schema(description = "创建人id")
    private String createUserId;
    /**创建时间*/
    @Schema(description = "创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String createTime;
    /**更新人id*/
    @Schema(description = "更新人id")
    private String updateUserId;
    /**更新时间*/
    @Schema(description = "更新时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String updateTime;

}
