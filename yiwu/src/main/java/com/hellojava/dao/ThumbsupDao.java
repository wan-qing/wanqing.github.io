package com.hellojava.dao;

import com.hellojava.entity.Thumbsup;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 点赞表(Thumbsup)表数据库访问层
 *
 * @author makejava
 * @since 2020-09-08 23:29:35
 */
@Mapper
public interface ThumbsupDao {

    /**
     * 通过ID查询单条数据
     *
     * @param giveId 主键
     * @return 实例对象
     */
    Thumbsup queryById(Integer giveId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Thumbsup> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param thumbsup 实例对象
     * @return 对象列表
     */
    List<Thumbsup> queryAll(Thumbsup thumbsup);

    /**
     * 新增数据
     *
     * @param thumbsup 实例对象
     * @return 影响行数
     */
    int insert(Thumbsup thumbsup);

    /**
     * 修改数据
     *
     * @param thumbsup 实例对象
     * @return 影响行数
     */
    int update(Thumbsup thumbsup);

    /**
     * 通过主键删除数据
     *
     * @param giveId 主键
     * @return 影响行数
     */
    int deleteById(Integer giveId);

}