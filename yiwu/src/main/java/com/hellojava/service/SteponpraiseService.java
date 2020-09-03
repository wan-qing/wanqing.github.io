package com.hellojava.service;

import com.hellojava.entity.Steponpraise;
import java.util.List;

/**
 * 踩赞表(Steponpraise)表服务接口
 *
 * @author makejava
 * @since 2020-09-03 17:01:12
 */
public interface SteponpraiseService {

    /**
     * 通过ID查询单条数据
     *
     * @param bottomId 主键
     * @return 实例对象
     */
    Steponpraise queryById(Integer bottomId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Steponpraise> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param steponpraise 实例对象
     * @return 实例对象
     */
    Steponpraise insert(Steponpraise steponpraise);

    /**
     * 修改数据
     *
     * @param steponpraise 实例对象
     * @return 实例对象
     */
    Steponpraise update(Steponpraise steponpraise);

    /**
     * 通过主键删除数据
     *
     * @param bottomId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer bottomId);

}