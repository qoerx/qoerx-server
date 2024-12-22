package org.qoerx.modules.system.user.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import org.qoerx.common.result.Result;
import org.qoerx.modules.system.user.entity.SysUser;
import org.qoerx.modules.system.user.service.ISysUserService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * 系统用户 控制层
 * Author: wangshuo
 * Date: 2024/12/22 下午8:26
 */
@RestController
@Tag(name = "系统用户controller")
@RequestMapping("/sys_user")
public class SysUserController {
    @Resource
    private ISysUserService sysUserService;

    /**
     * 分页获取所有用户信息
     * @param sysUser 用户信息
     * @param pageNo 第几页
     * @param pageSize 每页有几条数据
     * @param request
     * */
    @Operation(summary = "分页获取所有用户信息")
    @GetMapping(value = "/page")
    public Result<IPage<SysUser>> getPageList(SysUser sysUser,
                                 @RequestParam(name = "pageNo", defaultValue = "1") Integer pageNo,
                                 @RequestParam(name = "pageSize", defaultValue = "10") Integer pageSize,
                                 HttpServletRequest request){
        Page<SysUser> page = new Page<>(pageNo, pageSize);
        IPage<SysUser> pageList = sysUserService.page(page, new QueryWrapper<SysUser>());
        return Result.ok(pageList);
    }

    /**
     * 新增用户
     * @param sysUser 用户信息
     * */
    @Operation(summary = "新增用户")
    @PostMapping(value = "/save")
    public Result<String> saveData(@RequestBody SysUser sysUser){
        return sysUserService.addData(sysUser);
    }

    /**
     * 修改用户
     * @param sysUser 用户信息
     * */
    @Operation(summary = "修改用户")
    @PutMapping(value = "/update")
    public Result<String> updateData(@RequestBody SysUser sysUser){
        sysUserService.updateById(sysUser);
        return Result.ok("修改成功");
    }

    /**
     * 删除用户
     * @param id id
     * */
    @Operation(summary = "删除用户")
    @DeleteMapping(value = "/by_id")
    public Result<String> deleteById(@RequestParam(name = "id") String id){
        sysUserService.removeById(id);
        return Result.ok("删除成功");
    }

    /**
     * 根据id获取用户信息
     * @param id id
     * */
    @Operation(summary = "根据id获取用户信息")
    @GetMapping(value = "/by_id")
    public Result<SysUser> getUserById(@RequestParam String id){
        SysUser sysUser = sysUserService.getById(id);
        return Result.ok(sysUser);
    }


}
