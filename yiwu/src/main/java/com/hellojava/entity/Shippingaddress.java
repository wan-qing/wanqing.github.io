package com.hellojava.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 收货地址表(Shippingaddress)实体类
 *
 * @author makejava
 * @since 2020-09-08 23:29:35
 */
public class Shippingaddress implements Serializable {
    private static final long serialVersionUID = -14116587044786796L;
    /**
    * 地址id
    */
    private Integer addressId;
    /**
    * 用户id
    */
    private Integer userId;
    /**
    * 地址状态
    */
    private Integer addressState;
    /**
    * 收货人所在省
    */
    private String addrProvince;
    /**
    * 收货人所在城市
    */
    private String addrCity;
    /**
    * 收货人所在区县
    */
    private String addrArea;
    /**
    * 详细地址
    */
    private String addrDetail;
    /**
    * 收货人姓名
    */
    private String userName;
    /**
    * 收货人电话号码
    */
    private String userCellphone;
    /**
    * 地址创建时间
    */
    private Date addresscreate;
    
    private String yuliu;


    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getAddressState() {
        return addressState;
    }

    public void setAddressState(Integer addressState) {
        this.addressState = addressState;
    }

    public String getAddrProvince() {
        return addrProvince;
    }

    public void setAddrProvince(String addrProvince) {
        this.addrProvince = addrProvince;
    }

    public String getAddrCity() {
        return addrCity;
    }

    public void setAddrCity(String addrCity) {
        this.addrCity = addrCity;
    }

    public String getAddrArea() {
        return addrArea;
    }

    public void setAddrArea(String addrArea) {
        this.addrArea = addrArea;
    }

    public String getAddrDetail() {
        return addrDetail;
    }

    public void setAddrDetail(String addrDetail) {
        this.addrDetail = addrDetail;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserCellphone() {
        return userCellphone;
    }

    public void setUserCellphone(String userCellphone) {
        this.userCellphone = userCellphone;
    }

    public Date getAddresscreate() {
        return addresscreate;
    }

    public void setAddresscreate(Date addresscreate) {
        this.addresscreate = addresscreate;
    }

    public String getYuliu() {
        return yuliu;
    }

    public void setYuliu(String yuliu) {
        this.yuliu = yuliu;
    }

}