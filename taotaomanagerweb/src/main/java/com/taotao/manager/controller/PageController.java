package com.taotao.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Create by DRL on 2019/3/10.
 */
@Controller
public class PageController {
    @RequestMapping(value = "/")
    public String showIndex() {
        return "index";
    }

    @RequestMapping(value = "{page}")
    public String showPage(@PathVariable String page) {
        return page;
    }
}
