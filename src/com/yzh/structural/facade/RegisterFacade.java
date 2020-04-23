package com.yzh.structural.facade;

/**
 * @Author yzh
 * @Date 2020/4/23 12:16
 * @Version 1.0
 */
public class RegisterFacade {
    public void register() {
        工商局 a = new 地方工商局();
        a.checkName();
        质监局 b = new 地方质监局();
        b.orgCodeCertificate();
        税务局 c = new 地方税务局();
        c.taxCertificate();
        银行 d = new 中国工商银行();
        d.openAccount();
    }
}
