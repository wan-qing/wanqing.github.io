package com.hellojava.service.impl;

import com.hellojava.entity.Evaluate;
import com.hellojava.dao.EvaluateDao;
import com.hellojava.service.EvaluateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 评价表(Evaluate)表服务实现类
 *
 * @author makejava
 * @since 2020-09-08 23:29:34
 */
@Service
public class EvaluateServiceImpl implements EvaluateService {
    @Autowired
    private EvaluateDao evaluateDao;

    /**
     * 通过ID查询单条数据
     *
     * @param evaluateId 主键
     * @return 实例对象
     */
    @Override
    public Evaluate queryById(Integer evaluateId) {
        return this.evaluateDao.queryById(evaluateId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Evaluate> queryAllByLimit(int offset, int limit) {
        return this.evaluateDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param evaluate 实例对象
     * @return 实例对象
     */
    @Override
    public Evaluate insert(Evaluate evaluate) {
        this.evaluateDao.insert(evaluate);
        return evaluate;
    }

    /**
     * 修改数据
     *
     * @param evaluate 实例对象
     * @return 实例对象
     */
    @Override
    public Evaluate update(Evaluate evaluate) {
        this.evaluateDao.update(evaluate);
        return this.queryById(evaluate.getEvaluateId());
    }

    /**
     * 通过主键删除数据
     *
     * @param evaluateId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer evaluateId) {
        return this.evaluateDao.deleteById(evaluateId) > 0;
    }
}