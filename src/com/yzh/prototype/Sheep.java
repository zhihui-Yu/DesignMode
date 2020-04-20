package com.yzh.prototype;

import javax.xml.crypto.Data;
import java.io.Serializable;
import java.util.Date;

/**
 * @Author yzh
 * @Date 2020/4/20 13:40
 * @Version 1.0
 */
public class Sheep implements Cloneable, Serializable {
    private String  name;
    private Date birthday;

    @Override
    protected Object clone() throws CloneNotSupportedException {

        return super.clone();
        //添加如下代码实现深复值
       /*
        Object obj = super.clone();
        Sheep s = (Sheep) obj;
        s.birthday = (Date)this.birthday.clone();
        return obj;
        */
    }

    public Sheep(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
