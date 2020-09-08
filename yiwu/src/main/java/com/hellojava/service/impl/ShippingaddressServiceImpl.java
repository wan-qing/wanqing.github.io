package com.hellojava.service.impl;

import com.hellojava.entity.Shippingaddress;
import com.hellojava.dao.ShippingaddressDao;
import com.hellojava.service.ShippingaddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 收货地址表(Shippingaddress)表服务实现类
 *
 * @author makejava
 * @since 2020-09-08 23:29:35
 */
@Service
public class ShippingaddressServiceImpl implements ShippingaddressService {
    @Resource
    private ShippingaddressDao shippingaddressDao;

    /**
     * 通过ID查询单条数据
     *
     * @param addressId 主键
     * @return 实例对象
     */
    @Override
    public Shippingaddress queryById(Integer addressId) {
        return this.shippingaddressDao.queryById(addressId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Shippingaddress> queryAllByLimit(int offset, int limit) {
        return this.shippingaddressDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param shippingaddress 实例对象
     * @return 实例对象
     */
    @Override
    public Shippingaddress insert(Shippingaddress shippingaddress) {
        this.shippingaddressDao.insert(shippingaddress);
        return shippingaddress;
    }

    /**
     * 修改数据
     *
     * @param shippingaddress 实例对象
     * @return 实例对象
     */
    @Override
    public Shippingaddress update(Shippingaddress shippingaddress) {
        this.shippingaddressDao.update(shippingaddress);
        return this.queryById(shippingaddress.getAddressId());
    }

    /**
     * 通过主键删除数据
     *
     * @param addressId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer addressId) {
        return this.shippingaddressDao.deleteById(addressId) > 0;
    }
}