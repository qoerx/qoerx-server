package org.qoerx.modules.system.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.qoerx.modules.system.user.entity.SysUser;

/**
 * 系统用户 数据访问层
 * Author: wangshuo
 * Date: 2024/12/22 下午8:19
 */
@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {
}
