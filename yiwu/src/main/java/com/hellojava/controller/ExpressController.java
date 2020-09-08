package com.hellojava.controller;

import com.hellojava.entity.Express;
import com.hellojava.service.ExpressService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 快递表(Express)表控制层
 *
 * @author makejava
 * @since 2020-09-08 23:29:34
 */
@RestController
@RequestMapping("express")
public class ExpressController {
    /**
     * 服务对象
     */
    @Resource
    private ExpressService expressService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Express selectOne(Integer id) {
        return this.expressService.queryById(id);
    }

}