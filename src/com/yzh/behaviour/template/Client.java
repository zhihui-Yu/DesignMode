package com.yzh.behaviour.template;

/**
 * 模板方法模式：定义一套骨架，将具体实现延迟到子类实现
 * 案例：
 *  1.spring中JDBCTemplate
 *  2.Servlet doGet doPost
 *  3.Junit 单元测试
 * @Author yzh
 * @Date 2020/4/23 18:54
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        BlankTemplate blankTemplate = new DrawMoney();
        blankTemplate.process();

        //匿名内部类
        BlankTemplate bt = new BlankTemplate() {
            @Override
            public void transact() {
                System.out.println("来看看而已");
            }
        };
        bt.process();
    }
}

class DrawMoney extends BlankTemplate {

    @Override
    public void transact() {
        System.out.println("取钱");
    }
}
