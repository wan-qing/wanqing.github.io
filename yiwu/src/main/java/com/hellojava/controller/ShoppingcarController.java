package com.hellojava.controller;

import com.hellojava.entity.Shoppingcar;
import com.hellojava.service.ShoppingcarService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 购物车表(Shoppingcar)表控制层
 *
 * @author makejava
 * @since 2020-09-08 23:29:35
 */
@RestController
@RequestMapping("shoppingcar")
public class ShoppingcarController {
    /**
     * 服务对象
     */
    @Resource
    private ShoppingcarService shoppingcarService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Shoppingcar selectOne(Integer id) {
        return this.shoppingcarService.queryById(id);
    }

}