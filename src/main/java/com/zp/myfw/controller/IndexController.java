package com.zp.myfw.controller;

import com.zp.fw.annotation.MyParameter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.zp.fw.utils.ZpUtil;

/**
 * @Author zhoupeng
 * @Date 2020-04-29 9:27
 */
@RestController
public class IndexController {
    @RequestMapping("/index")
    @MyParameter
    public String index(){
        ZpUtil.showMsg("index test");
        return "index test";
    }
}
