package com.github.pagehelper;

import com.taotao.manager.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemExample;
import javafx.application.Application;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Create by DRL on 2019/3/15.
 */
public class TestPageHelper {
    @Test
    public void  testHelper() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-dao.xml");
        TbItemMapper tbItemMapper = context.getBean(TbItemMapper.class);
        PageHelper.startPage(1, 3);
        TbItemExample example = new TbItemExample();
        List<TbItem> tbItems = tbItemMapper.selectByExample(example);

        List<TbItem> tbItems1 = tbItemMapper.selectByExample(example);

        System.out.println(tbItems.size());
        System.out.println(tbItems1.size());
        for (TbItem tbItem : tbItems) {
            System.out.println(tbItem);
        }
    }
}
