package com.hellojava.dao;

import com.hellojava.entity.Steponpraise;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 踩赞表(Steponpraise)表数据库访问层
 *
 * @author makejava
 * @since 2020-09-08 23:29:35
 */
@Mapper
public interface SteponpraiseDao {

    /**
     * 通过ID查询单条数据
     *
     * @param bottomId 主键
     * @return 实例对象
     */
    Steponpraise queryById(Integer bottomId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Steponpraise> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param steponpraise 实例对象
     * @return 对象列表
     */
    List<Steponpraise> queryAll(Steponpraise steponpraise);

    /**
     * 新增数据
     *
     * @param steponpraise 实例对象
     * @return 影响行数
     */
    int insert(Steponpraise steponpraise);

    /**
     * 修改数据
     *
     * @param steponpraise 实例对象
     * @return 影响行数
     */
    int update(Steponpraise steponpraise);

    /**
     * 通过主键删除数据
     *
     * @param bottomId 主键
     * @return 影响行数
     */
    int deleteById(Integer bottomId);

}