package com.yzh.structural.facade;

/**
 * 外观模式：提供一个门面做所有操作，客户端只需要调用门面就好
 * 案列：
 *   JDBC封装 如Commons中提供的DBUtils类
 * @Author yzh
 * @Date 2020/4/23 12:08
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        new RegisterFacade().register();
    }
}
