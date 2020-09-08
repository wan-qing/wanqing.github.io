package com.hellojava.service;

import com.hellojava.entity.Evaluate;
import java.util.List;

/**
 * 评价表(Evaluate)表服务接口
 *
 * @author makejava
 * @since 2020-09-08 23:29:34
 */
public interface EvaluateService {

    /**
     * 通过ID查询单条数据
     *
     * @param evaluateId 主键
     * @return 实例对象
     */
    Evaluate queryById(Integer evaluateId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Evaluate> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param evaluate 实例对象
     * @return 实例对象
     */
    Evaluate insert(Evaluate evaluate);

    /**
     * 修改数据
     *
     * @param evaluate 实例对象
     * @return 实例对象
     */
    Evaluate update(Evaluate evaluate);

    /**
     * 通过主键删除数据
     *
     * @param evaluateId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer evaluateId);

}