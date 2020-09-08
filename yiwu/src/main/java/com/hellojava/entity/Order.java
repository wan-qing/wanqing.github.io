package com.hellojava.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 订单表(Order)实体类
 *
 * @author makejava
 * @since 2020-09-08 23:29:34
 */
public class Order implements Serializable {
    private static final long serialVersionUID = -16497208581376593L;
    /**
    * 订单id
    */
    private Integer orderId;
    /**
    * 商品名字
    */
    private String title;
    /**
    * 商品分组id
    */
    private Integer orderGroup;
    /**
    * 创建时间
    */
    private Date addTime;
    /**
    * 物品信息-简介（副文本）
    */
    private String info;
    /**
    * 商品图片
    */
    private String img;
    /**
    * 发起人
    */
    private Integer createPeople;
    /**
    * 交换人
    */
    private Integer buyPeople;
    /**
    * 0:未交易；1:已发起请求；2:已同意请求；3:拒绝请求；4:已发货；5:确认收货
    */
    private Object state;
    /**
    * 发起请求时间
    */
    private Date buyTime;
    /**
    * 请求确认时间
    */
    private Date sureTime;
    /**
    * 结束时间
    */
    private Date endTime;
    /**
    * 发起人收货地址id
    */
    private Integer createAddressid;
    /**
    * 交换人收货id
    */
    private Integer buyAddressid;
    /**
    * 预留
    */
    private String yuliu;


    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getOrderGroup() {
        return orderGroup;
    }

    public void setOrderGroup(Integer orderGroup) {
        this.orderGroup = orderGroup;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Integer getCreatePeople() {
        return createPeople;
    }

    public void setCreatePeople(Integer createPeople) {
        this.createPeople = createPeople;
    }

    public Integer getBuyPeople() {
        return buyPeople;
    }

    public void setBuyPeople(Integer buyPeople) {
        this.buyPeople = buyPeople;
    }

    public Object getState() {
        return state;
    }

    public void setState(Object state) {
        this.state = state;
    }

    public Date getBuyTime() {
        return buyTime;
    }

    public void setBuyTime(Date buyTime) {
        this.buyTime = buyTime;
    }

    public Date getSureTime() {
        return sureTime;
    }

    public void setSureTime(Date sureTime) {
        this.sureTime = sureTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getCreateAddressid() {
        return createAddressid;
    }

    public void setCreateAddressid(Integer createAddressid) {
        this.createAddressid = createAddressid;
    }

    public Integer getBuyAddressid() {
        return buyAddressid;
    }

    public void setBuyAddressid(Integer buyAddressid) {
        this.buyAddressid = buyAddressid;
    }

    public String getYuliu() {
        return yuliu;
    }

    public void setYuliu(String yuliu) {
        this.yuliu = yuliu;
    }

}