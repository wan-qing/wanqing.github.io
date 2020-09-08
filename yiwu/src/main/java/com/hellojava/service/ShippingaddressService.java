package com.hellojava.service;

import com.hellojava.entity.Shippingaddress;
import java.util.List;

/**
 * 收货地址表(Shippingaddress)表服务接口
 *
 * @author makejava
 * @since 2020-09-08 23:29:35
 */
public interface ShippingaddressService {

    /**
     * 通过ID查询单条数据
     *
     * @param addressId 主键
     * @return 实例对象
     */
    Shippingaddress queryById(Integer addressId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Shippingaddress> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param shippingaddress 实例对象
     * @return 实例对象
     */
    Shippingaddress insert(Shippingaddress shippingaddress);

    /**
     * 修改数据
     *
     * @param shippingaddress 实例对象
     * @return 实例对象
     */
    Shippingaddress update(Shippingaddress shippingaddress);

    /**
     * 通过主键删除数据
     *
     * @param addressId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer addressId);

}