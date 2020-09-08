package com.hellojava.service.impl;

import com.hellojava.entity.Shoppingcar;
import com.hellojava.dao.ShoppingcarDao;
import com.hellojava.service.ShoppingcarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 购物车表(Shoppingcar)表服务实现类
 *
 * @author makejava
 * @since 2020-09-08 23:29:35
 */
@Service
public class ShoppingcarServiceImpl implements ShoppingcarService {
    @Resource
    private ShoppingcarDao shoppingcarDao;

    /**
     * 通过ID查询单条数据
     *
     * @param buyGoodsId 主键
     * @return 实例对象
     */
    @Override
    public Shoppingcar queryById(Integer buyGoodsId) {
        return this.shoppingcarDao.queryById(buyGoodsId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Shoppingcar> queryAllByLimit(int offset, int limit) {
        return this.shoppingcarDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param shoppingcar 实例对象
     * @return 实例对象
     */
    @Override
    public Shoppingcar insert(Shoppingcar shoppingcar) {
        this.shoppingcarDao.insert(shoppingcar);
        return shoppingcar;
    }

    /**
     * 修改数据
     *
     * @param shoppingcar 实例对象
     * @return 实例对象
     */
    @Override
    public Shoppingcar update(Shoppingcar shoppingcar) {
        this.shoppingcarDao.update(shoppingcar);
        return this.queryById(shoppingcar.getBuyGoodsId());
    }

    /**
     * 通过主键删除数据
     *
     * @param buyGoodsId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer buyGoodsId) {
        return this.shoppingcarDao.deleteById(buyGoodsId) > 0;
    }
}