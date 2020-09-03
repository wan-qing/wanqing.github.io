package com.hellojava.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 关注与粉丝表(Followandfans)实体类
 *
 * @author makejava
 * @since 2020-09-03 16:59:56
 */
public class Followandfans implements Serializable {
    private static final long serialVersionUID = -79900808515890982L;
    /**
    * 关&粉id
    */
    private Integer fafId;
    /**
    * 关注者id
    */
    private Integer followId;
    /**
    * 粉丝id
    */
    private Integer fansId;
    /**
    * 关注时间
    */
    private Date followtime;
    
    private String yuliu;


    public Integer getFafId() {
        return fafId;
    }

    public void setFafId(Integer fafId) {
        this.fafId = fafId;
    }

    public Integer getFollowId() {
        return followId;
    }

    public void setFollowId(Integer followId) {
        this.followId = followId;
    }

    public Integer getFansId() {
        return fansId;
    }

    public void setFansId(Integer fansId) {
        this.fansId = fansId;
    }

    public Date getFollowtime() {
        return followtime;
    }

    public void setFollowtime(Date followtime) {
        this.followtime = followtime;
    }

    public String getYuliu() {
        return yuliu;
    }

    public void setYuliu(String yuliu) {
        this.yuliu = yuliu;
    }

}