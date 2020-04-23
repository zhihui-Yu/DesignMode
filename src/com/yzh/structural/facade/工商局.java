package com.yzh.structural.facade;

/**
 * @Author yzh
 * @Date 2020/4/23 12:10
 * @Version 1.0
 */
public interface 工商局 {
    void checkName();
}
class 地方工商局 implements 工商局{

    @Override
    public void checkName() {
        System.out.println("检查名字是否有冲突");
    }
}
