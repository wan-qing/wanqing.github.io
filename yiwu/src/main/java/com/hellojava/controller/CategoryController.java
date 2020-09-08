package com.hellojava.controller;

import com.hellojava.entity.Category;
import com.hellojava.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 分类表(Category)表控制层
 *
 * @author makejava
 * @since 2020-09-08 23:29:32
 */
@RestController
@RequestMapping("category")
public class CategoryController {
    /**
     * 服务对象
     */
    @Resource
    private CategoryService categoryService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Category selectOne(Integer id) {
        return this.categoryService.queryById(id);
    }

}