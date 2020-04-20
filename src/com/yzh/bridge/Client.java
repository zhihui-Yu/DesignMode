package com.yzh.bridge;

/**
 * 使用桥接模式解决多维度问题
 * @Author yzh
 * @Date 2020/4/20 20:03
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        //销售联想笔记本
        Computer2 c = new Laptop2(new Lenovo());
        c.sale();

    }
}
