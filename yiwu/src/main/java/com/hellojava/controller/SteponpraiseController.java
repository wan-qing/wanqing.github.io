package com.hellojava.controller;

import com.hellojava.entity.Steponpraise;
import com.hellojava.service.SteponpraiseService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 踩赞表(Steponpraise)表控制层
 *
 * @author makejava
 * @since 2020-09-08 23:29:35
 */
@RestController
@RequestMapping("steponpraise")
public class SteponpraiseController {
    /**
     * 服务对象
     */
    @Resource
    private SteponpraiseService steponpraiseService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Steponpraise selectOne(Integer id) {
        return this.steponpraiseService.queryById(id);
    }

}