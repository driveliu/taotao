package com.taotao.manager.controller;

import com.taotao.manager.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Create by DRL on 2019/3/10.
 */
@Controller
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping(value = "/test/queryNow")
    @ResponseBody
    public String queryNow(){
        return testService.queryNow();
    }
}
