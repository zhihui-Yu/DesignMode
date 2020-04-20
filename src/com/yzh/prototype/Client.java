package com.yzh.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * 原型模式  -- 克隆一个对象比重新创建一个对象消耗低
 * @Author yzh
 * @Date 2020/4/20 13:44
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) throws Exception{

        Date date = new Date(12312312131L);

        Sheep s1 = new Sheep("多利",date);

        //浅克隆 Date对象指的是同一地址，date值变化则两个s对象都会变
        //解决：在clone方法中添加date的clone
        Sheep s2 = (Sheep) s1.clone();
        System.out.println("未修改时间");
        System.out.println(s1);
        System.out.println(s2);

        System.out.println("s2修改时间");
        date.setTime(22222222222L);
        System.out.println(s1);
        System.out.println(s2);

        //序列化 和 反序列化 实现深克隆
        //序列化
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(s1);
        byte[] bytes = bos.toByteArray();

        //反
        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        ObjectInputStream    ois = new ObjectInputStream(bis);

        Sheep s3 = (Sheep) ois.readObject();
        date.setTime(3333244444L);
        System.out.println("s3修改时间");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

    }
}
