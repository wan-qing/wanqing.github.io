package com.hellojava.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 点赞表(Thumbsup)实体类
 *
 * @author makejava
 * @since 2020-09-08 23:29:35
 */
public class Thumbsup implements Serializable {
    private static final long serialVersionUID = -64889082980604022L;
    /**
    * 点赞id
    */
    private Integer giveId;
    /**
    * 点赞用户id
    */
    private Integer userId;
    /**
    * 被赞用户id
    */
    private Integer buserId;
    /**
    * 点赞时间
    */
    private Date topCreatetime;
    
    private String yuliu;


    public Integer getGiveId() {
        return giveId;
    }

    public void setGiveId(Integer giveId) {
        this.giveId = giveId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getBuserId() {
        return buserId;
    }

    public void setBuserId(Integer buserId) {
        this.buserId = buserId;
    }

    public Date getTopCreatetime() {
        return topCreatetime;
    }

    public void setTopCreatetime(Date topCreatetime) {
        this.topCreatetime = topCreatetime;
    }

    public String getYuliu() {
        return yuliu;
    }

    public void setYuliu(String yuliu) {
        this.yuliu = yuliu;
    }

}