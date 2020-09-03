package com.hellojava.dao;

import com.hellojava.entity.Followandfans;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 关注与粉丝表(Followandfans)表数据库访问层
 *
 * @author makejava
 * @since 2020-09-03 17:04:11
 */
public interface FollowandfansDao {

    /**
     * 通过ID查询单条数据
     *
     * @param fafId 主键
     * @return 实例对象
     */
    Followandfans queryById(Integer fafId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Followandfans> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param followandfans 实例对象
     * @return 对象列表
     */
    List<Followandfans> queryAll(Followandfans followandfans);

    /**
     * 新增数据
     *
     * @param followandfans 实例对象
     * @return 影响行数
     */
    int insert(Followandfans followandfans);

    /**
     * 修改数据
     *
     * @param followandfans 实例对象
     * @return 影响行数
     */
    int update(Followandfans followandfans);

    /**
     * 通过主键删除数据
     *
     * @param fafId 主键
     * @return 影响行数
     */
    int deleteById(Integer fafId);

}