package com.yzh.structural.flyWeight;

/**
 * 享元模式 经常和工厂模式一起用
 * 场景：将完全相同或相似的对象通过享元模式共享(Map存储)
 *      线程池，连接池，String类
 * 优点：
 *  1.减少内存对象，相同对象只有一份，提高性能。
 *  2.外部对象相对独立，不影响内部状态
 * 缺点：
 *  1.模式较复杂
 *  2.共享内部类，分离外部状态，而读取外部状态运行时间长，用时间换空间。
 * @Author yzh
 * @Date 2020/4/23 12:23
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        Chess chess1 = ChessFactory.getChess("黑色");
        Chess chess2 = ChessFactory.getChess("黑色");
        System.out.println(chess1);
        System.out.println(chess2);

        System.out.println("增加外部状态处理======");
        chess1.display(new Coordinate(10,10));
        chess2.display(new Coordinate(20,20));
    }
}
