package com.hellojava.controller;

import com.hellojava.entity.Evaluate;
import com.hellojava.service.EvaluateService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 评价表(Evaluate)表控制层
 *
 * @author makejava
 * @since 2020-09-08 23:29:34
 */
@RestController
@RequestMapping("evaluate")
public class EvaluateController {
    /**
     * 服务对象
     */
    @Resource
    private EvaluateService evaluateService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Evaluate selectOne(Integer id) {
        return this.evaluateService.queryById(id);
    }

}