package com.hellojava.service.impl;

import com.hellojava.entity.Objecttrace;
import com.hellojava.dao.ObjecttraceDao;
import com.hellojava.service.ObjecttraceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 物迹表(Objecttrace)表服务实现类
 *
 * @author makejava
 * @since 2020-09-08 23:29:34
 */
@Service
public class ObjecttraceServiceImpl implements ObjecttraceService {
    @Resource
    private ObjecttraceDao objecttraceDao;

    /**
     * 通过ID查询单条数据
     *
     * @param traceId 主键
     * @return 实例对象
     */
    @Override
    public Objecttrace queryById(Integer traceId) {
        return this.objecttraceDao.queryById(traceId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Objecttrace> queryAllByLimit(int offset, int limit) {
        return this.objecttraceDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param objecttrace 实例对象
     * @return 实例对象
     */
    @Override
    public Objecttrace insert(Objecttrace objecttrace) {
        this.objecttraceDao.insert(objecttrace);
        return objecttrace;
    }

    /**
     * 修改数据
     *
     * @param objecttrace 实例对象
     * @return 实例对象
     */
    @Override
    public Objecttrace update(Objecttrace objecttrace) {
        this.objecttraceDao.update(objecttrace);
        return this.queryById(objecttrace.getTraceId());
    }

    /**
     * 通过主键删除数据
     *
     * @param traceId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer traceId) {
        return this.objecttraceDao.deleteById(traceId) > 0;
    }
}