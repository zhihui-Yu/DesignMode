package com.yzh.adapter;


/**
 * 适配器模式
 * Client 类相当于电脑  Target相当于USB接口，Adapter相当于适配器,Adaptee为ps/z接口
 * 客户端利用适配器将目标接口适配到合理的接口中处理
 * @Author yzh
 * @Date 2020/4/20 15:14
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args) {
        Client c = new Client();
        Adaptee a = new Adaptee();
        Target t = new Adapter(a);
        t.handleReq();
    }
    public void test1(Target target){
        target.handleReq();
    }
}
