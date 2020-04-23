package com.yzh.structural.facade;

/**
 * @Author yzh
 * @Date 2020/4/23 12:11
 * @Version 1.0
 */
public interface 税务局 {
    void taxCertificate();//办理税务登记证
}
class 地方税务局 implements 税务局 {

    @Override
    public void taxCertificate() {
        System.out.println("在地方税务局办理税务登记证");
    }
}
