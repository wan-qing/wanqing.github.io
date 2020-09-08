package com.hellojava.service;

import com.hellojava.entity.Objecttrace;
import java.util.List;

/**
 * 物迹表(Objecttrace)表服务接口
 *
 * @author makejava
 * @since 2020-09-08 23:29:34
 */
public interface ObjecttraceService {

    /**
     * 通过ID查询单条数据
     *
     * @param traceId 主键
     * @return 实例对象
     */
    Objecttrace queryById(Integer traceId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Objecttrace> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param objecttrace 实例对象
     * @return 实例对象
     */
    Objecttrace insert(Objecttrace objecttrace);

    /**
     * 修改数据
     *
     * @param objecttrace 实例对象
     * @return 实例对象
     */
    Objecttrace update(Objecttrace objecttrace);

    /**
     * 通过主键删除数据
     *
     * @param traceId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer traceId);

}