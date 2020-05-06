package com.zp.myfw.controller;

import com.zp.fw.annotation.MyParameter;
import com.zp.fw.annotation.ZpApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.zp.fw.utils.ZpUtil;

/**
 * @Author zhoupeng
 * @Date 2020-04-29 9:27
 */
@RestController
//@MyParameter放在controller上后AOP不起作用，原因应该是AOP是针对方法的代理
//@MyParameter(includeResultData = false)
@ZpApplication
public class IndexController {
    @RequestMapping("/index")
    @MyParameter(includeResultData = true)
    public String index(){
        ZpUtil.showMsg("index test");
        return "index test";
    }
}
