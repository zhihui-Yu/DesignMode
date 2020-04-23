package com.yzh.structural.facade;

/**
 * @Author yzh
 * @Date 2020/4/23 12:13
 * @Version 1.0
 */
public interface 银行 {
    void openAccount();//开户
}
class 中国工商银行 implements 银行{

    @Override
    public void openAccount() {
        System.out.println("在中国工商银行开户");
    }
}
