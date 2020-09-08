package com.hellojava.service;

import com.hellojava.entity.Followandfans;
import java.util.List;

/**
 * 关注与粉丝表(Followandfans)表服务接口
 *
 * @author makejava
 * @since 2020-09-08 23:29:34
 */
public interface FollowandfansService {

    /**
     * 通过ID查询单条数据
     *
     * @param fafId 主键
     * @return 实例对象
     */
    Followandfans queryById(Integer fafId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Followandfans> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param followandfans 实例对象
     * @return 实例对象
     */
    Followandfans insert(Followandfans followandfans);

    /**
     * 修改数据
     *
     * @param followandfans 实例对象
     * @return 实例对象
     */
    Followandfans update(Followandfans followandfans);

    /**
     * 通过主键删除数据
     *
     * @param fafId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer fafId);

}