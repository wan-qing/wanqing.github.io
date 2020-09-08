package com.hellojava.controller;

import com.hellojava.entity.Chatrecord;
import com.hellojava.service.ChatrecordService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 聊天记录表(Chatrecord)表控制层
 *
 * @author makejava
 * @since 2020-09-08 23:29:34
 */
@RestController
@RequestMapping("chatrecord")
public class ChatrecordController {
    /**
     * 服务对象
     */
    @Resource
    private ChatrecordService chatrecordService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Chatrecord selectOne(Integer id) {
        return this.chatrecordService.queryById(id);
    }

}