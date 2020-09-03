package com.hellojava.entity;

import java.io.Serializable;

/**
 * 角色表(Roles)实体类
 *
 * @author makejava
 * @since 2020-09-03 16:59:56
 */
public class Roles implements Serializable {
    private static final long serialVersionUID = -86695220399848121L;
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