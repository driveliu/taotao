package com.taotao.common.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * easyui datagrid 返回的数据封装的pojo
 * Create by DRL on 2019/3/16.
 */
public class EasyUIDataGridResult implements Serializable {
    private Integer total;
    private List rows;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List getRows() {
        return rows;
    }

    public void setRows(List rows) {
        this.rows = rows;
    }
}
