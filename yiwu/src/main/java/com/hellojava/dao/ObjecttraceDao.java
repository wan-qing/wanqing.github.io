package com.hellojava.dao;

import com.hellojava.entity.Objecttrace;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 物迹表(Objecttrace)表数据库访问层
 *
 * @author makejava
 * @since 2020-09-08 23:29:34
 */
@Mapper
public interface ObjecttraceDao {

    /**
     * 通过ID查询单条数据
     *
     * @param traceId 主键
     * @return 实例对象
     */
    Objecttrace queryById(Integer traceId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Objecttrace> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param objecttrace 实例对象
     * @return 对象列表
     */
    List<Objecttrace> queryAll(Objecttrace objecttrace);

    /**
     * 新增数据
     *
     * @param objecttrace 实例对象
     * @return 影响行数
     */
    int insert(Objecttrace objecttrace);

    /**
     * 修改数据
     *
     * @param objecttrace 实例对象
     * @return 影响行数
     */
    int update(Objecttrace objecttrace);

    /**
     * 通过主键删除数据
     *
     * @param traceId 主键
     * @return 影响行数
     */
    int deleteById(Integer traceId);

}