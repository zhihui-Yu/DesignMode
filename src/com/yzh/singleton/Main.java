package com.yzh.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.util.concurrent.CountDownLatch;

/**
 * 反序列和反射对枚举不起作用
 *
 * @Author yzh
 * @Date 2020/4/18 15:56
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        efficiency();
    }

    //测试五种方法的效率 懒汉最慢
    private static void efficiency(){
        int count = 10;
        final CountDownLatch latch = new CountDownLatch(count);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10 ; i++ ) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 10000000; i++) {
                        //SingletonDemo4.getInstance();
                        SingletonDemo5 s = SingletonDemo5.INSTANCE;
                    }
                    latch.countDown();
                }
            }).start();
        }
        try {
            latch.await();//main线程阻塞，直到计数器变为0
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("总耗时"+(end-start));
    }

    //利用序列化创建新实例
    //解法：在类中添加 readResolve方法，直接返回实例
    //原因： 让反序列化时返回该方法返回的对象(反序列化自动调用)
    private static void serializable(){
        SingletonDemo1 instance = SingletonDemo1.getInstance();
        try {
            FileOutputStream fos = new FileOutputStream("d:/a.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(instance);
            oos.close();
            fos.close();
            System.out.println(instance);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:/a.txt"));
            SingletonDemo1 s1 = (SingletonDemo1) ois.readObject();
            System.out.println(s1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //利用反射创建新的对象
    //解法： 在私有构造类中判断是否已经创建实例，创建了则抛出异常
    private static void reflect() {
        try {
            Class<SingletonDemo1> clz = (Class<SingletonDemo1>) Class.forName("com.yzh.singleton.SingletonDemo1");
            Constructor<SingletonDemo1> c = clz.getDeclaredConstructor(null);
            //跳过检查
            c.setAccessible(true);
            System.out.println(c.newInstance() == c.newInstance());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void isSingleton(){
        SingletonDemo1 s1 = SingletonDemo1.getInstance();
        SingletonDemo2 s2 = SingletonDemo2.getInstance();
        SingletonDemo3 s3 = SingletonDemo3.getInstance();
        SingletonDemo4 s4 = SingletonDemo4.getInstance();
        System.out.println(s1==SingletonDemo1.getInstance());
        System.out.println(s2==SingletonDemo2.getInstance());
        System.out.println(s3==SingletonDemo3.getInstance());
        System.out.println(s4==SingletonDemo4.getInstance());
        System.out.println(SingletonDemo5.INSTANCE == SingletonDemo5.INSTANCE);
    }
}
