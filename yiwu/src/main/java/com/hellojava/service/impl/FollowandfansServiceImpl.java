package com.hellojava.service.impl;

import com.hellojava.entity.Followandfans;
import com.hellojava.dao.FollowandfansDao;
import com.hellojava.service.FollowandfansService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 关注与粉丝表(Followandfans)表服务实现类
 *
 * @author makejava
 * @since 2020-09-08 23:29:34
 */
@Service
public class FollowandfansServiceImpl implements FollowandfansService {
    @Resource
    private FollowandfansDao followandfansDao;

    /**
     * 通过ID查询单条数据
     *
     * @param fafId 主键
     * @return 实例对象
     */
    @Override
    public Followandfans queryById(Integer fafId) {
        return this.followandfansDao.queryById(fafId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Followandfans> queryAllByLimit(int offset, int limit) {
        return this.followandfansDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param followandfans 实例对象
     * @return 实例对象
     */
    @Override
    public Followandfans insert(Followandfans followandfans) {
        this.followandfansDao.insert(followandfans);
        return followandfans;
    }

    /**
     * 修改数据
     *
     * @param followandfans 实例对象
     * @return 实例对象
     */
    @Override
    public Followandfans update(Followandfans followandfans) {
        this.followandfansDao.update(followandfans);
        return this.queryById(followandfans.getFafId());
    }

    /**
     * 通过主键删除数据
     *
     * @param fafId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer fafId) {
        return this.followandfansDao.deleteById(fafId) > 0;
    }
}