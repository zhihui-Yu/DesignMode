package com.yzh.singleton;

/**
 * 单例 -- 枚举
 *  jvm保证安全，无法利用反射漏洞
 * @Author yzh
 * @Date 2020/4/18 15:54
 * @Version 1.0
 */
public enum SingletonDemo5 {
    //天然单例
    INSTANCE;

    //可以自己添加操作
    public void oper(){}
}
