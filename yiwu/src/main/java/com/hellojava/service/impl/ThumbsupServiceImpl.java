package com.hellojava.service.impl;

import com.hellojava.entity.Thumbsup;
import com.hellojava.dao.ThumbsupDao;
import com.hellojava.service.ThumbsupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 点赞表(Thumbsup)表服务实现类
 *
 * @author makejava
 * @since 2020-09-08 23:29:35
 */
@Service
public class ThumbsupServiceImpl implements ThumbsupService {
    @Resource
    private ThumbsupDao thumbsupDao;

    /**
     * 通过ID查询单条数据
     *
     * @param giveId 主键
     * @return 实例对象
     */
    @Override
    public Thumbsup queryById(Integer giveId) {
        return this.thumbsupDao.queryById(giveId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Thumbsup> queryAllByLimit(int offset, int limit) {
        return this.thumbsupDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param thumbsup 实例对象
     * @return 实例对象
     */
    @Override
    public Thumbsup insert(Thumbsup thumbsup) {
        this.thumbsupDao.insert(thumbsup);
        return thumbsup;
    }

    /**
     * 修改数据
     *
     * @param thumbsup 实例对象
     * @return 实例对象
     */
    @Override
    public Thumbsup update(Thumbsup thumbsup) {
        this.thumbsupDao.update(thumbsup);
        return this.queryById(thumbsup.getGiveId());
    }

    /**
     * 通过主键删除数据
     *
     * @param giveId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer giveId) {
        return this.thumbsupDao.deleteById(giveId) > 0;
    }
}