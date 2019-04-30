package com.oracle.controller.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: 会员的控制器
 * @Author: admin
 * @CreateDate: 2019/4/29 16:41
 * @UpdateUser: admin
 * @UpdateDate: 2019/4/29 16:41
 * @UpdateRemark:
 * @Version: 1.0
 **/
@RestController
public class MemberController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/getMember")
    public String getMember() {

        return "this is 牛逼" + port;
    }
}
