package com.hellojava.dao;

import com.hellojava.entity.Jurisdiction;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 权限表(Jurisdiction)表数据库访问层
 *
 * @author makejava
 * @since 2020-09-08 23:29:34
 */
@Mapper
public interface JurisdictionDao {

    /**
     * 通过ID查询单条数据
     *
     * @param jurisdictionId 主键
     * @return 实例对象
     */
    Jurisdiction queryById(Integer jurisdictionId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Jurisdiction> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param jurisdiction 实例对象
     * @return 对象列表
     */
    List<Jurisdiction> queryAll(Jurisdiction jurisdiction);

    /**
     * 新增数据
     *
     * @param jurisdiction 实例对象
     * @return 影响行数
     */
    int insert(Jurisdiction jurisdiction);

    /**
     * 修改数据
     *
     * @param jurisdiction 实例对象
     * @return 影响行数
     */
    int update(Jurisdiction jurisdiction);

    /**
     * 通过主键删除数据
     *
     * @param jurisdictionId 主键
     * @return 影响行数
     */
    int deleteById(Integer jurisdictionId);

}