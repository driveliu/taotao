package com.taotao.manager.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.manager.mapper.TbItemMapper;
import com.taotao.manager.service.ItemService;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Create by DRL on 2019/3/16.
 */
@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private TbItemMapper tbItemMapper;

    /*
     * 根据当前的页码和每页的行数进行分页查询
     * */
    @Override
    public EasyUIDataGridResult getItemList(Integer page, Integer rows){
        //设置分页信息使用PageHelper
        if (page == null) page = 1;
        if (rows == null) rows = 30;
        PageHelper.startPage(page, rows);
        //查询所有结果集
        TbItemExample example = new TbItemExample();
        List<TbItem> list = tbItemMapper.selectByExample(example);
        //使用PageHelper中的PageInfo对结果进行封装
        PageInfo pageInfo = new PageInfo(list);
        //封装到EasyUIDataGridResult并返回
        EasyUIDataGridResult result = new EasyUIDataGridResult();
        result.setTotal((int) pageInfo.getTotal());
        result.setRows(pageInfo.getList());
        return result;
        //发布dubbo广播
    }

}
