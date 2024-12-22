package org.qoerx.modules.system.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.qoerx.common.result.Result;
import org.qoerx.modules.system.user.entity.SysUser;

/**
 * 系统用户 服务接口
 * Author: wangshuo
 * Date: 2024/12/22 下午8:22
 */
public interface ISysUserService extends IService<SysUser> {
    /**
     * 新增用户
     * */
    Result<String> addData(SysUser sysUser);
}
