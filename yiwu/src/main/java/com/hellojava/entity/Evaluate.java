package com.hellojava.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 评价表(Evaluate)实体类
 *
 * @author makejava
 * @since 2020-09-03 16:59:56
 */
public class Evaluate implements Serializable {
    private static final long serialVersionUID = -39261823662537143L;
    /**
    * 评价id
    */
    private Integer evaluateId;
    /**
    * 用户id
    */
    private Integer userId;
    /**
    * 商品id
    */
    private Integer goodsId;
    /**
    * 评价内容
    */
    private String evaluateContent;
    /**
    * 评价时间
    */
    private Date evaluateTime;
    
    private String yuliu;


    public Integer getEvaluateId() {
        return evaluateId;
    }

    public void setEvaluateId(Integer evaluateId) {
        this.evaluateId = evaluateId;
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

    public String getEvaluateContent() {
        return evaluateContent;
    }

    public void setEvaluateContent(String evaluateContent) {
        this.evaluateContent = evaluateContent;
    }

    public Date getEvaluateTime() {
        return evaluateTime;
    }

    public void setEvaluateTime(Date evaluateTime) {
        this.evaluateTime = evaluateTime;
    }

    public String getYuliu() {
        return yuliu;
    }

    public void setYuliu(String yuliu) {
        this.yuliu = yuliu;
    }

}