package com.hellojava.service;

import com.hellojava.entity.Roles;
import java.util.List;

/**
 * 角色表(Roles)表服务接口
 *
 * @author makejava
 * @since 2020-09-03 17:01:12
 */
public interface RolesService {

    /**
     * 通过ID查询单条数据
     *
     * @param roleId 主键
     * @return 实例对象
     */
    Roles queryById(Integer roleId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Roles> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param roles 实例对象
     * @return 实例对象
     */
    Roles insert(Roles roles);

    /**
     * 修改数据
     *
     * @param roles 实例对象
     * @return 实例对象
     */
    Roles update(Roles roles);

    /**
     * 通过主键删除数据
     *
     * @param roleId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer roleId);

}