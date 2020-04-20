package com.yzh.bridge;

/**
 * @Author yzh
 * @Date 2020/4/20 19:58
 * @Version 1.0
 */
public interface Brand {
    void sale();
}
class Lenovo implements Brand{

    @Override
    public void sale() {
        System.out.println("销售联想电脑");
    }
}
class Dell implements Brand{

    @Override
    public void sale() {
        System.out.println("销售戴尔电脑");
    }
}
