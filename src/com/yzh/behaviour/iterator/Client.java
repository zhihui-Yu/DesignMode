package com.yzh.behaviour.iterator;

/**
 * 迭代器模式
 * 案列：
 * 1. JDK内置
 * @Author yzh
 * @Date 2020/4/23 14:59
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        ConcreteMyAggregate cma = new ConcreteMyAggregate();

        cma.addObject("aa");
        cma.addObject("bb");
        cma.addObject("cc");

        MyIterator it = cma.createIterator();
        while (it.hasNext()) {
            System.out.println(it.getCurrentObj());
            it.next();
        }

    }
}
