package com.hellojava.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 快递表(Express)实体类
 *
 * @author makejava
 * @since 2020-09-03 16:59:56
 */
public class Express implements Serializable {
    private static final long serialVersionUID = -69697382700476183L;
    /**
    * 快递id
    */
    private Integer expressId;
    /**
    * 收货地址id
    */
    private Integer addressId;
    /**
    * 0:京东物流;1顺丰;2:跨越速运;3:百世汇通;4:宅急送;5:中通快递;6:申通快递;7:圆通快递;8:韵达快递;9:国通快递
    */
    private Integer expressCompany;
    /**
    * 快递单号
    */
    private String courierNumber;
    /**
    * 发起人发货时间
    */
    private Date sponsorDeliveryTime;
    /**
    * 确认请求人发货时间
    */
    private Date confirmerRequesttime;
    /**
    * 发起人确认收货时间
    */
    private Date receivingtimeOfInitiator;
    /**
    * 确认请求人收货时间
    */
    private Date confirmationRequestReceivingTime;
    
    private String yuliu;


    public Integer getExpressId() {
        return expressId;
    }

    public void setExpressId(Integer expressId) {
        this.expressId = expressId;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public Integer getExpressCompany() {
        return expressCompany;
    }

    public void setExpressCompany(Integer expressCompany) {
        this.expressCompany = expressCompany;
    }

    public String getCourierNumber() {
        return courierNumber;
    }

    public void setCourierNumber(String courierNumber) {
        this.courierNumber = courierNumber;
    }

    public Date getSponsorDeliveryTime() {
        return sponsorDeliveryTime;
    }

    public void setSponsorDeliveryTime(Date sponsorDeliveryTime) {
        this.sponsorDeliveryTime = sponsorDeliveryTime;
    }

    public Date getConfirmerRequesttime() {
        return confirmerRequesttime;
    }

    public void setConfirmerRequesttime(Date confirmerRequesttime) {
        this.confirmerRequesttime = confirmerRequesttime;
    }

    public Date getReceivingtimeOfInitiator() {
        return receivingtimeOfInitiator;
    }

    public void setReceivingtimeOfInitiator(Date receivingtimeOfInitiator) {
        this.receivingtimeOfInitiator = receivingtimeOfInitiator;
    }

    public Date getConfirmationRequestReceivingTime() {
        return confirmationRequestReceivingTime;
    }

    public void setConfirmationRequestReceivingTime(Date confirmationRequestReceivingTime) {
        this.confirmationRequestReceivingTime = confirmationRequestReceivingTime;
    }

    public String getYuliu() {
        return yuliu;
    }

    public void setYuliu(String yuliu) {
        this.yuliu = yuliu;
    }

}