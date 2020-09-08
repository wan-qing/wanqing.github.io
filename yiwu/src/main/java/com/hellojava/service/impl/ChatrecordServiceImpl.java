package com.hellojava.service.impl;

import com.hellojava.entity.Chatrecord;
import com.hellojava.dao.ChatrecordDao;
import com.hellojava.service.ChatrecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 聊天记录表(Chatrecord)表服务实现类
 *
 * @author makejava
 * @since 2020-09-08 23:29:34
 */
@Service
public class ChatrecordServiceImpl implements ChatrecordService {
    @Resource
    private ChatrecordDao chatrecordDao;

    /**
     * 通过ID查询单条数据
     *
     * @param chatId 主键
     * @return 实例对象
     */
    @Override
    public Chatrecord queryById(Integer chatId) {
        return this.chatrecordDao.queryById(chatId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Chatrecord> queryAllByLimit(int offset, int limit) {
        return this.chatrecordDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param chatrecord 实例对象
     * @return 实例对象
     */
    @Override
    public Chatrecord insert(Chatrecord chatrecord) {
        this.chatrecordDao.insert(chatrecord);
        return chatrecord;
    }

    /**
     * 修改数据
     *
     * @param chatrecord 实例对象
     * @return 实例对象
     */
    @Override
    public Chatrecord update(Chatrecord chatrecord) {
        this.chatrecordDao.update(chatrecord);
        return this.queryById(chatrecord.getChatId());
    }

    /**
     * 通过主键删除数据
     *
     * @param chatId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer chatId) {
        return this.chatrecordDao.deleteById(chatId) > 0;
    }
}