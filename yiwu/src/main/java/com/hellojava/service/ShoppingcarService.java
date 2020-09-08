package com.hellojava.service;

import com.hellojava.entity.Shoppingcar;
import java.util.List;

/**
 * 购物车表(Shoppingcar)表服务接口
 *
 * @author makejava
 * @since 2020-09-08 23:29:35
 */
public interface ShoppingcarService {

    /**
     * 通过ID查询单条数据
     *
     * @param buyGoodsId 主键
     * @return 实例对象
     */
    Shoppingcar queryById(Integer buyGoodsId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Shoppingcar> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param shoppingcar 实例对象
     * @return 实例对象
     */
    Shoppingcar insert(Shoppingcar shoppingcar);

    /**
     * 修改数据
     *
     * @param shoppingcar 实例对象
     * @return 实例对象
     */
    Shoppingcar update(Shoppingcar shoppingcar);

    /**
     * 通过主键删除数据
     *
     * @param buyGoodsId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer buyGoodsId);

}