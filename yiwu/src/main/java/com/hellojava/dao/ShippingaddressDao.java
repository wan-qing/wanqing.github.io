package com.hellojava.dao;

import com.hellojava.entity.Shippingaddress;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 收货地址表(Shippingaddress)表数据库访问层
 *
 * @author makejava
 * @since 2020-09-03 17:04:11
 */
public interface ShippingaddressDao {

    /**
     * 通过ID查询单条数据
     *
     * @param addressId 主键
     * @return 实例对象
     */
    Shippingaddress queryById(Integer addressId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Shippingaddress> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param shippingaddress 实例对象
     * @return 对象列表
     */
    List<Shippingaddress> queryAll(Shippingaddress shippingaddress);

    /**
     * 新增数据
     *
     * @param shippingaddress 实例对象
     * @return 影响行数
     */
    int insert(Shippingaddress shippingaddress);

    /**
     * 修改数据
     *
     * @param shippingaddress 实例对象
     * @return 影响行数
     */
    int update(Shippingaddress shippingaddress);

    /**
     * 通过主键删除数据
     *
     * @param addressId 主键
     * @return 影响行数
     */
    int deleteById(Integer addressId);

}