package com.hellojava.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 聊天记录表(Chatrecord)实体类
 *
 * @author makejava
 * @since 2020-09-08 23:29:34
 */
public class Chatrecord implements Serializable {
    private static final long serialVersionUID = 459090204670922786L;
    /**
    * 聊天id
    */
    private Integer chatId;
    /**
    * 发送者id
    */
    private Integer sendId;
    /**
    * 接收者id
    */
    private Integer copyId;
    /**
    * 发送内容
    */
    private String sendinfo;
    /**
    * 发送时间
    */
    private Date sendtime;
    
    private String yuliu;


    public Integer getChatId() {
        return chatId;
    }

    public void setChatId(Integer chatId) {
        this.chatId = chatId;
    }

    public Integer getSendId() {
        return sendId;
    }

    public void setSendId(Integer sendId) {
        this.sendId = sendId;
    }

    public Integer getCopyId() {
        return copyId;
    }

    public void setCopyId(Integer copyId) {
        this.copyId = copyId;
    }

    public String getSendinfo() {
        return sendinfo;
    }

    public void setSendinfo(String sendinfo) {
        this.sendinfo = sendinfo;
    }

    public Date getSendtime() {
        return sendtime;
    }

    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }

    public String getYuliu() {
        return yuliu;
    }

    public void setYuliu(String yuliu) {
        this.yuliu = yuliu;
    }

}