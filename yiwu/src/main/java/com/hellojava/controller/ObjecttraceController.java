package com.hellojava.controller;

import com.hellojava.entity.Objecttrace;
import com.hellojava.service.ObjecttraceService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 物迹表(Objecttrace)表控制层
 *
 * @author makejava
 * @since 2020-09-08 23:29:34
 */
@RestController
@RequestMapping("objecttrace")
public class ObjecttraceController {
    /**
     * 服务对象
     */
    @Resource
    private ObjecttraceService objecttraceService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Objecttrace selectOne(Integer id) {
        return this.objecttraceService.queryById(id);
    }

}