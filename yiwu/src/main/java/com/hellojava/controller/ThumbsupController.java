package com.hellojava.controller;

import com.hellojava.entity.Thumbsup;
import com.hellojava.service.ThumbsupService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 点赞表(Thumbsup)表控制层
 *
 * @author makejava
 * @since 2020-09-08 23:29:35
 */
@RestController
@RequestMapping("thumbsup")
public class ThumbsupController {
    /**
     * 服务对象
     */
    @Resource
    private ThumbsupService thumbsupService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Thumbsup selectOne(Integer id) {
        return this.thumbsupService.queryById(id);
    }

}