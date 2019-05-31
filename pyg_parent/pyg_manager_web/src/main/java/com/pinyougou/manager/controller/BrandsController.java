package com.pinyougou.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.sellergoods.BrandService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/brand")
public class BrandsController {

    @Reference
    private BrandService service;

    @RequestMapping("/findAll")
    public List findAll(){
        return service.findAll();
    }
}
