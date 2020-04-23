package com.yzh.behaviour.iterator;

import java.io.ObjectInputStream;

/**
 * 自定义迭代器接口
 * @Author yzh
 * @Date 2020/4/23 14:46
 * @Version 1.0
 */
public interface MyIterator {
    void first();//将游标指向第一个元素
    void next();//将游标指向下一个元素
    boolean hasNext();//判断下一个元素是否存在
    boolean isFirst();//判断是否是第一个元素
    boolean isLast();//判断是否最后一个元素
    Object getCurrentObj();//获取当前元素
}
