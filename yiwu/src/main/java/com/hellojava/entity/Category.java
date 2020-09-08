package com.hellojava.entity;

import java.io.Serializable;

/**
 * 分类表(Category)实体类
 *
 * @author makejava
 * @since 2020-09-08 23:29:25
 */
public class Category implements Serializable {
    private static final long serialVersionUID = 488899691448389843L;
    /**
    * 分类id
    */
    private Integer categoryId;
    /**
    * 分类名字
    */
    private String categoryName;
    /**
    * 0:禁用；1:启用
    */
    private Integer categoryState;
    
    private String yuliu;


    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getCategoryState() {
        return categoryState;
    }

    public void setCategoryState(Integer categoryState) {
        this.categoryState = categoryState;
    }

    public String getYuliu() {
        return yuliu;
    }

    public void setYuliu(String yuliu) {
        this.yuliu = yuliu;
    }

}