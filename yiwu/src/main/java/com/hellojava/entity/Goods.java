package com.hellojava.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 商品表(Goods)实体类
 *
 * @author makejava
 * @since 2020-09-03 16:59:56
 */
public class Goods implements Serializable {
    private static final long serialVersionUID = 160558377049301212L;
    /**
    * 商品id
    */
    private Integer goodsId;
    /**
    * 商品名称
    */
    private String goodsName;
    /**
    * 商品简介
    */
    private String goodsInfo;
    /**
    * 商品图片
    */
    private String goodsImg;
    /**
    * 商品发布者
    */
    private Integer userId;
    /**
    * 商品发布时间
    */
    private Date goodsCreatetime;
    /**
    * 商品赞数量
    */
    private Integer goodsLikecount;
    /**
    * 商品踩数量
    */
    private Integer goodsStep;
    /**
    * 0:未交易；1:已易出；2:未发布
    */
    private Integer goodsStatus;
    /**
    * 商品分类id
    */
    private Integer categoryId;
    /**
    * 0:禁用（隐藏）；1:启用（显示）
    */
    private Integer goodsShow;
    
    private String yuliu;


    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsInfo() {
        return goodsInfo;
    }

    public void setGoodsInfo(String goodsInfo) {
        this.goodsInfo = goodsInfo;
    }

    public String getGoodsImg() {
        return goodsImg;
    }

    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getGoodsCreatetime() {
        return goodsCreatetime;
    }

    public void setGoodsCreatetime(Date goodsCreatetime) {
        this.goodsCreatetime = goodsCreatetime;
    }

    public Integer getGoodsLikecount() {
        return goodsLikecount;
    }

    public void setGoodsLikecount(Integer goodsLikecount) {
        this.goodsLikecount = goodsLikecount;
    }

    public Integer getGoodsStep() {
        return goodsStep;
    }

    public void setGoodsStep(Integer goodsStep) {
        this.goodsStep = goodsStep;
    }

    public Integer getGoodsStatus() {
        return goodsStatus;
    }

    public void setGoodsStatus(Integer goodsStatus) {
        this.goodsStatus = goodsStatus;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getGoodsShow() {
        return goodsShow;
    }

    public void setGoodsShow(Integer goodsShow) {
        this.goodsShow = goodsShow;
    }

    public String getYuliu() {
        return yuliu;
    }

    public void setYuliu(String yuliu) {
        this.yuliu = yuliu;
    }

}