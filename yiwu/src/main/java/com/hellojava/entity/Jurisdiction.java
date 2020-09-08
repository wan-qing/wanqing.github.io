package com.hellojava.entity;

import java.io.Serializable;

/**
 * 权限表(Jurisdiction)实体类
 *
 * @author makejava
 * @since 2020-09-08 23:29:34
 */
public class Jurisdiction implements Serializable {
    private static final long serialVersionUID = 193928754658421111L;
    /**
    * 权限id
    */
    private Integer jurisdictionId;
    /**
    * 方法名
    */
    private String functionname;
    
    private String yuliu;


    public Integer getJurisdictionId() {
        return jurisdictionId;
    }

    public void setJurisdictionId(Integer jurisdictionId) {
        this.jurisdictionId = jurisdictionId;
    }

    public String getFunctionname() {
        return functionname;
    }

    public void setFunctionname(String functionname) {
        this.functionname = functionname;
    }

    public String getYuliu() {
        return yuliu;
    }

    public void setYuliu(String yuliu) {
        this.yuliu = yuliu;
    }

}