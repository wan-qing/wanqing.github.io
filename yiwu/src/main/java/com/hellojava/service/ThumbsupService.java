package com.hellojava.service;

import com.hellojava.entity.Thumbsup;
import java.util.List;

/**
 * 点赞表(Thumbsup)表服务接口
 *
 * @author makejava
 * @since 2020-09-03 17:01:12
 */
public interface ThumbsupService {

    /**
     * 通过ID查询单条数据
     *
     * @param giveId 主键
     * @return 实例对象
     */
    Thumbsup queryById(Integer giveId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Thumbsup> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param thumbsup 实例对象
     * @return 实例对象
     */
    Thumbsup insert(Thumbsup thumbsup);

    /**
     * 修改数据
     *
     * @param thumbsup 实例对象
     * @return 实例对象
     */
    Thumbsup update(Thumbsup thumbsup);

    /**
     * 通过主键删除数据
     *
     * @param giveId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer giveId);

}