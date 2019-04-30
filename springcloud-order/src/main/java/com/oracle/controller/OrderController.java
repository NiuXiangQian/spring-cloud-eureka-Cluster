package com.oracle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Description: 订单的控制器
 * @Author: admin
 * @CreateDate: 2019/4/29 16:42
 * @UpdateUser: admin
 * @UpdateDate: 2019/4/29 16:42
 * @UpdateRemark:
 * @Version: 1.0
 **/
@RestController
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/getOrder")
    public String getOrder() {
        String memberUrl = "http://app-oracle-member/getMember";
        String result = restTemplate.getForObject(memberUrl, String.class);

        System.out.println("result = " + result);


        return result;
    }

}
