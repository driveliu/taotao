package com.taotao.manager.service.impl;

import com.taotao.manager.mapper.TestMapper;
import com.taotao.manager.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Create by DRL on 2019/3/10.
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public String queryNow() {
        return testMapper.queryNow();
    }
}
