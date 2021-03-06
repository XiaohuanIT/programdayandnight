package com.nivelle.rpc.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.nivelle.rpc.service.dubboservice.HelloDubboService;

import java.net.InetAddress;

/**
 * dubbo服务提供者
 *
 * @author nivell
 * @date 2019/08/17
 */


@Service(version = "${helloDubbo.service.version}")
public class HelloDubboServiceImpl implements HelloDubboService {

    @Override
    public String sayHello(String name) {
        try {
            return "Hello, " + name + "- from:" + InetAddress.getLocalHost().getHostAddress();

        } catch (Exception e) {
            System.out.println(e);
        }
        return "bad request";
    }
}
