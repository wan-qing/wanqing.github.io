package com.hellojava.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 踩赞表(Steponpraise)实体类
 *
 * @author makejava
 * @since 2020-09-03 16:59:56
 */
public class Steponpraise implements Serializable {
    private static final long serialVersionUID = 592791081159150376L;
    /**
    * 踩赞id
    */
    private Integer bottomId;
    /**
    * 用户id
    */
    private Integer userId;
    /**
    * 被踩用户id
    */
    private Integer buserId;
    /**
    * 踩赞时间
    */
    private Date bottomCreatetime;
    
    private String yuliu;


    public Integer getBottomId() {
        return bottomId;
    }

    public void setBottomId(Integer bottomId) {
        this.bottomId = bottomId;
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

    public Date getBottomCreatetime() {
        return bottomCreatetime;
    }

    public void setBottomCreatetime(Date bottomCreatetime) {
        this.bottomCreatetime = bottomCreatetime;
    }

    public String getYuliu() {
        return yuliu;
    }

    public void setYuliu(String yuliu) {
        this.yuliu = yuliu;
    }

}