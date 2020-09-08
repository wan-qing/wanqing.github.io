package com.hellojava.service;

import com.hellojava.entity.Chatrecord;
import java.util.List;

/**
 * 聊天记录表(Chatrecord)表服务接口
 *
 * @author makejava
 * @since 2020-09-08 23:29:34
 */
public interface ChatrecordService {

    /**
     * 通过ID查询单条数据
     *
     * @param chatId 主键
     * @return 实例对象
     */
    Chatrecord queryById(Integer chatId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Chatrecord> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param chatrecord 实例对象
     * @return 实例对象
     */
    Chatrecord insert(Chatrecord chatrecord);

    /**
     * 修改数据
     *
     * @param chatrecord 实例对象
     * @return 实例对象
     */
    Chatrecord update(Chatrecord chatrecord);

    /**
     * 通过主键删除数据
     *
     * @param chatId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer chatId);

}