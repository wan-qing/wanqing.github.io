package com.hellojava.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 物迹表(Objecttrace)实体类
 *
 * @author makejava
 * @since 2020-09-03 16:59:56
 */
public class Objecttrace implements Serializable {
    private static final long serialVersionUID = -45891050682041868L;
    /**
    * 物迹id
    */
    private Integer traceId;
    /**
    * 用户id
    */
    private Integer userId;
    /**
    * 商品id
    */
    private Integer goodsId;
    /**
    * 浏览时间
    */
    private Date browseTime;
    
    private String yuliu;


    public Integer getTraceId() {
        return traceId;
    }

    public void setTraceId(Integer traceId) {
        this.traceId = traceId;
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

    public Date getBrowseTime() {
        return browseTime;
    }

    public void setBrowseTime(Date browseTime) {
        this.browseTime = browseTime;
    }

    public String getYuliu() {
        return yuliu;
    }

    public void setYuliu(String yuliu) {
        this.yuliu = yuliu;
    }

}