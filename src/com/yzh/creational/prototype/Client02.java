package com.yzh.creational.prototype;

/**
 * 创建对象时间对比
 * new 越耗时  克隆效率就越高
 * @Author yzh
 * @Date 2020/4/20 14:15
 * @Version 1.0
 */
public class Client02 {

    private static long start;
    private static long end;
    private static int size = 1000;

    public static void main(String[] args) throws Exception {
        testNew();
        testClone();
    }

    private static void testNew(){
        start = System.currentTimeMillis();
        for (int i = 0; i < size; i++ ) {
            Laptop t = new Laptop();
        }
        end = System.currentTimeMillis();
        System.out.println("new 的方式耗时："+(end-start));
    }

    private static void testClone()throws Exception{
        start = System.currentTimeMillis();
        Laptop t = new Laptop();
        for (int i = 0; i < size; i++ ) {
            Laptop temp = (Laptop) t.clone();
        }
        end = System.currentTimeMillis();
        System.out.println("clone 的方式耗时："+(end-start));
    }
}
class Laptop implements Cloneable{
    public Laptop(){
        try {
            Thread.sleep(10);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
