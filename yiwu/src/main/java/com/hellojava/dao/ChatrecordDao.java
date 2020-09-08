package com.hellojava.dao;

import com.hellojava.entity.Chatrecord;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 聊天记录表(Chatrecord)表数据库访问层
 *
 * @author makejava
 * @since 2020-09-08 23:29:34
 */
@Mapper
public interface ChatrecordDao {

    /**
     * 通过ID查询单条数据
     *
     * @param chatId 主键
     * @return 实例对象
     */
    Chatrecord queryById(Integer chatId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Chatrecord> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param chatrecord 实例对象
     * @return 对象列表
     */
    List<Chatrecord> queryAll(Chatrecord chatrecord);

    /**
     * 新增数据
     *
     * @param chatrecord 实例对象
     * @return 影响行数
     */
    int insert(Chatrecord chatrecord);

    /**
     * 修改数据
     *
     * @param chatrecord 实例对象
     * @return 影响行数
     */
    int update(Chatrecord chatrecord);

    /**
     * 通过主键删除数据
     *
     * @param chatId 主键
     * @return 影响行数
     */
    int deleteById(Integer chatId);

}