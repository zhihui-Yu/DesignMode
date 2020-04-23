package com.yzh.structural.facade;

/**
 * @Author yzh
 * @Date 2020/4/23 12:14
 * @Version 1.0
 */
public interface 质监局 {
    void orgCodeCertificate();//办理组织机构代码证
}
class 地方质监局 implements 质监局{

    @Override
    public void orgCodeCertificate() {
        System.out.println("在地方质监局办理组织机构代码证");
    }
}
