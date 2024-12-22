package org.qoerx.modules.system.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.qoerx.common.result.Result;
import org.qoerx.modules.system.user.entity.SysUser;
import org.qoerx.modules.system.user.mapper.SysUserMapper;
import org.qoerx.modules.system.user.service.ISysUserService;
import org.springframework.stereotype.Service;

/**
 * 系统用户 服务实现类
 * Author: wangshuo
 * Date: 2024/12/22 下午8:24
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {
    @Override
    public Result<String> addData(SysUser sysUser) {
        baseMapper.insert(sysUser);
        return Result.ok("添加成功");
    }
}
