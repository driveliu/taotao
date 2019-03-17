package com.taotao.manager.controller;

import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.manager.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 商品相关控制层
 * Create by DRL on 2019/3/16.
 */
@Controller
public class ItemController {
    @Autowired
    private ItemService itemService;

    @RequestMapping (value = "/item/list")
    @ResponseBody
    public EasyUIDataGridResult getItemList(Integer page, Integer rows){
        //注入service层
        //接收dubbo广播
        //调用service层方法
        //返回
        return itemService.getItemList(page, rows);
    }
}
