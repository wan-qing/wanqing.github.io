package com.hellojava.controller;

import com.hellojava.entity.Followandfans;
import com.hellojava.service.FollowandfansService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 关注与粉丝表(Followandfans)表控制层
 *
 * @author makejava
 * @since 2020-09-08 23:29:34
 */
@RestController
@RequestMapping("followandfans")
public class FollowandfansController {
    /**
     * 服务对象
     */
    @Resource
    private FollowandfansService followandfansService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Followandfans selectOne(Integer id) {
        return this.followandfansService.queryById(id);
    }

}