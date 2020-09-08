package com.hellojava.controller;

import com.hellojava.entity.Shippingaddress;
import com.hellojava.service.ShippingaddressService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 收货地址表(Shippingaddress)表控制层
 *
 * @author makejava
 * @since 2020-09-08 23:29:35
 */
@RestController
@RequestMapping("shippingaddress")
public class ShippingaddressController {
    /**
     * 服务对象
     */
    @Resource
    private ShippingaddressService shippingaddressService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Shippingaddress selectOne(Integer id) {
        return this.shippingaddressService.queryById(id);
    }

}