package com.hellojava.controller;

import com.hellojava.entity.Roles;
import com.hellojava.service.RolesService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 角色表(Roles)表控制层
 *
 * @author makejava
 * @since 2020-09-08 23:29:35
 */
@RestController
@RequestMapping("roles")
public class RolesController {
    /**
     * 服务对象
     */
    @Resource
    private RolesService rolesService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Roles selectOne(Integer id) {
        return this.rolesService.queryById(id);
    }

}