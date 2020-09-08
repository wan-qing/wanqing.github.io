package com.hellojava.entity;

import java.io.Serializable;

/**
 * 角色表(Roles)实体类
 *
 * @author makejava
 * @since 2020-09-08 23:29:35
 */
public class Roles implements Serializable {
    private static final long serialVersionUID = -52542104872605484L;
    /**
    * 角色Id
    */
    private Integer roleId;
    /**
    * 角色名称
    */
    private String roleName;
    /**
    * 对应权限
    */
    private Integer jurisdiction;
    
    private String yuliu;


    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Integer getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(Integer jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    public String getYuliu() {
        return yuliu;
    }

    public void setYuliu(String yuliu) {
        this.yuliu = yuliu;
    }

}