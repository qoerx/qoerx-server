package org.qoerx.modules.system.user.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.qoerx.common.base.entity.BaseEntity;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户表实体
 * Author: wangshuo
 * Date: 2024/12/22 下午6:06
 */
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "系统用户")
@TableName("sys_user")
public class SysUser extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    /**id*/
    @Schema(description = "id")
    @TableId(type = IdType.ASSIGN_ID)
    private String id;
    /**用户账号*/
    @Schema(description = "用户账号")
    private String username;
    /**密码*/
    @Schema(description = "密码")
    private String password;
    /**密码盐*/
    @Schema(description = "密码盐")
    private String salt;
    /**性别*/
    @Schema(description = "性别")
    private Integer sex;
    /**邮箱*/
    @Schema(description = "邮箱")
    private String email;
    /**手机号*/
    @Schema(description = "手机号")
    private String phone;
    /**状态*/
    @Schema(description = "状态")
    private Integer status;
    /**删除状态*/
    @TableLogic
    private Integer delFlag;
}
