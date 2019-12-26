package com.nivelle.base.designpatterns.proxy;

import com.nivelle.base.pojo.User;

public class RealObject implements CompanyUser {

    public boolean doHardWork(User user) {

        System.out.println("真实对象做艰难的工作");

        return true;

    }

    public boolean doEasyWork(User user) {
        System.out.println("真实对象做简单的工作");

        return true;
    }
}
