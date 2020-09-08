package com.hellojava.dao;

import com.hellojava.entity.Evaluate;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 评价表(Evaluate)表数据库访问层
 *
 * @author makejava
 * @since 2020-09-08 23:29:34
 */
@Mapper
public interface EvaluateDao {

    /**
     * 通过ID查询单条数据
     *
     * @param evaluateId 主键
     * @return 实例对象
     */
    Evaluate queryById(Integer evaluateId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Evaluate> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param evaluate 实例对象
     * @return 对象列表
     */
    List<Evaluate> queryAll(Evaluate evaluate);

    /**
     * 新增数据
     *
     * @param evaluate 实例对象
     * @return 影响行数
     */
    int insert(Evaluate evaluate);

    /**
     * 修改数据
     *
     * @param evaluate 实例对象
     * @return 影响行数
     */
    int update(Evaluate evaluate);

    /**
     * 通过主键删除数据
     *
     * @param evaluateId 主键
     * @return 影响行数
     */
    int deleteById(Integer evaluateId);

}