package com.hellojava.service.impl;

import com.hellojava.entity.Steponpraise;
import com.hellojava.dao.SteponpraiseDao;
import com.hellojava.service.SteponpraiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 踩赞表(Steponpraise)表服务实现类
 *
 * @author makejava
 * @since 2020-09-08 23:29:35
 */
@Service
public class SteponpraiseServiceImpl implements SteponpraiseService {
    @Resource
    private SteponpraiseDao steponpraiseDao;

    /**
     * 通过ID查询单条数据
     *
     * @param bottomId 主键
     * @return 实例对象
     */
    @Override
    public Steponpraise queryById(Integer bottomId) {
        return this.steponpraiseDao.queryById(bottomId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Steponpraise> queryAllByLimit(int offset, int limit) {
        return this.steponpraiseDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param steponpraise 实例对象
     * @return 实例对象
     */
    @Override
    public Steponpraise insert(Steponpraise steponpraise) {
        this.steponpraiseDao.insert(steponpraise);
        return steponpraise;
    }

    /**
     * 修改数据
     *
     * @param steponpraise 实例对象
     * @return 实例对象
     */
    @Override
    public Steponpraise update(Steponpraise steponpraise) {
        this.steponpraiseDao.update(steponpraise);
        return this.queryById(steponpraise.getBottomId());
    }

    /**
     * 通过主键删除数据
     *
     * @param bottomId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer bottomId) {
        return this.steponpraiseDao.deleteById(bottomId) > 0;
    }
}