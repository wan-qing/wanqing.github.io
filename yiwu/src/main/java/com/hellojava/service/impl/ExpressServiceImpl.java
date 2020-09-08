package com.hellojava.service.impl;

import com.hellojava.entity.Express;
import com.hellojava.dao.ExpressDao;
import com.hellojava.service.ExpressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 快递表(Express)表服务实现类
 *
 * @author makejava
 * @since 2020-09-08 23:29:34
 */
@Service
public class ExpressServiceImpl implements ExpressService {
    @Resource
    private ExpressDao expressDao;

    /**
     * 通过ID查询单条数据
     *
     * @param expressId 主键
     * @return 实例对象
     */
    @Override
    public Express queryById(Integer expressId) {
        return this.expressDao.queryById(expressId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Express> queryAllByLimit(int offset, int limit) {
        return this.expressDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param express 实例对象
     * @return 实例对象
     */
    @Override
    public Express insert(Express express) {
        this.expressDao.insert(express);
        return express;
    }

    /**
     * 修改数据
     *
     * @param express 实例对象
     * @return 实例对象
     */
    @Override
    public Express update(Express express) {
        this.expressDao.update(express);
        return this.queryById(express.getExpressId());
    }

    /**
     * 通过主键删除数据
     *
     * @param expressId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer expressId) {
        return this.expressDao.deleteById(expressId) > 0;
    }
}