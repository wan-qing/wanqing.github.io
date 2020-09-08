package com.hellojava.service.impl;

import com.hellojava.entity.Jurisdiction;
import com.hellojava.dao.JurisdictionDao;
import com.hellojava.service.JurisdictionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 权限表(Jurisdiction)表服务实现类
 *
 * @author makejava
 * @since 2020-09-08 23:29:34
 */
@Service
public class JurisdictionServiceImpl implements JurisdictionService {
    @Resource
    private JurisdictionDao jurisdictionDao;

    /**
     * 通过ID查询单条数据
     *
     * @param jurisdictionId 主键
     * @return 实例对象
     */
    @Override
    public Jurisdiction queryById(Integer jurisdictionId) {
        return this.jurisdictionDao.queryById(jurisdictionId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Jurisdiction> queryAllByLimit(int offset, int limit) {
        return this.jurisdictionDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param jurisdiction 实例对象
     * @return 实例对象
     */
    @Override
    public Jurisdiction insert(Jurisdiction jurisdiction) {
        this.jurisdictionDao.insert(jurisdiction);
        return jurisdiction;
    }

    /**
     * 修改数据
     *
     * @param jurisdiction 实例对象
     * @return 实例对象
     */
    @Override
    public Jurisdiction update(Jurisdiction jurisdiction) {
        this.jurisdictionDao.update(jurisdiction);
        return this.queryById(jurisdiction.getJurisdictionId());
    }

    /**
     * 通过主键删除数据
     *
     * @param jurisdictionId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer jurisdictionId) {
        return this.jurisdictionDao.deleteById(jurisdictionId) > 0;
    }
}