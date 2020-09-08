package com.hellojava.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 用户表(User)实体类
 *
 * @author makejava
 * @since 2020-09-08 23:29:35
 */
public class User implements Serializable {
    private static final long serialVersionUID = 134438132250052836L;
    /**
    * 用户id
    */
    private Integer userId;
    /**
    * 用户名
    */
    private String userName;
    /**
    * md5()加密
    */
    private String userPwd;
    /**
    * 用户昵称
    */
    private String userNickname;
    /**
    * 用户简介
    */
    private String userProfile;
    /**
    * 用户创建时间
    */
    private Date userCreatetime;
    /**
    * 用户最后一次登录时间
    */
    private Date userLogin;
    /**
    * 关注人数数量
    */
    private Integer followCount;
    /**
    * 粉丝数量
    */
    private Integer fanCount;
    /**
    * 发布物品数量
    */
    private Integer publishItemcount;
    /**
    * 订单已成交数量
    */
    private Integer orderDealcount;
    /**
    * 订单数量
    */
    private Integer orderCount;
    /**
    * 用户信誉
    */
    private Object userReputation;
    
    private String yuliu;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    public String getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(String userProfile) {
        this.userProfile = userProfile;
    }

    public Date getUserCreatetime() {
        return userCreatetime;
    }

    public void setUserCreatetime(Date userCreatetime) {
        this.userCreatetime = userCreatetime;
    }

    public Date getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(Date userLogin) {
        this.userLogin = userLogin;
    }

    public Integer getFollowCount() {
        return followCount;
    }

    public void setFollowCount(Integer followCount) {
        this.followCount = followCount;
    }

    public Integer getFanCount() {
        return fanCount;
    }

    public void setFanCount(Integer fanCount) {
        this.fanCount = fanCount;
    }

    public Integer getPublishItemcount() {
        return publishItemcount;
    }

    public void setPublishItemcount(Integer publishItemcount) {
        this.publishItemcount = publishItemcount;
    }

    public Integer getOrderDealcount() {
        return orderDealcount;
    }

    public void setOrderDealcount(Integer orderDealcount) {
        this.orderDealcount = orderDealcount;
    }

    public Integer getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }

    public Object getUserReputation() {
        return userReputation;
    }

    public void setUserReputation(Object userReputation) {
        this.userReputation = userReputation;
    }

    public String getYuliu() {
        return yuliu;
    }

    public void setYuliu(String yuliu) {
        this.yuliu = yuliu;
    }

}