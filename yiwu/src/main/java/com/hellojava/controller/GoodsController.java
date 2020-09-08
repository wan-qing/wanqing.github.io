package com.hellojava.controller;

import com.hellojava.entity.Goods;
import com.hellojava.service.GoodsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 商品表(Goods)表控制层
 *
 * @author makejava
 * @since 2020-09-08 23:29:34
 */
@RestController
@RequestMapping("goods")
public class GoodsController {
    /**
     * 服务对象
     */
    @Resource
    private GoodsService goodsService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Goods selectOne(Integer id) {
        return this.goodsService.queryById(id);
    }

}