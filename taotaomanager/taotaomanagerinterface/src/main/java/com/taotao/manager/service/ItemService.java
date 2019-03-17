package com.taotao.manager.service;

import com.taotao.common.pojo.EasyUIDataGridResult;

/**
 * Create by DRL on 2019/3/16.
 */
public interface ItemService {
    /*
    * 根据当前的页码和每页的行数进行分页查的接口
    * */
    public EasyUIDataGridResult getItemList(Integer page, Integer rows);
}
