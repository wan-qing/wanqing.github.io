package com.hellojava.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 购物车表(Shoppingcar)实体类
 *
 * @author makejava
 * @since 2020-09-08 23:29:35
 */
public class Shoppingcar implements Serializable {
    private static final long serialVersionUID = -33471407383729795L;
    /**
    * 购物id
    */
    private Integer buyGoodsId;
    /**
    * 用户id
    */
    private Integer userId;
    /**
    * 商品id
    */
    private Integer goodsId;
    /**
    * 商品加入时间
    */
    private Date goodsAddtime;
    /**
    * 商品删除时间
    */
    private Date goodsDeletetime;
    
    private String yuliu;


    public Integer getBuyGoodsId() {
        return buyGoodsId;
    }

    public void setBuyGoodsId(Integer buyGoodsId) {
        this.buyGoodsId = buyGoodsId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Date getGoodsAddtime() {
        return goodsAddtime;
    }

    public void setGoodsAddtime(Date goodsAddtime) {
        this.goodsAddtime = goodsAddtime;
    }

    public Date getGoodsDeletetime() {
        return goodsDeletetime;
    }

    public void setGoodsDeletetime(Date goodsDeletetime) {
        this.goodsDeletetime = goodsDeletetime;
    }

    public String getYuliu() {
        return yuliu;
    }

    public void setYuliu(String yuliu) {
        this.yuliu = yuliu;
    }

}