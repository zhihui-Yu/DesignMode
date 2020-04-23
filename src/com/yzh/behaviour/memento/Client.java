package com.yzh.behaviour.memento;

/**
 * 备忘录模式： 保存某个对象的某个状态  利用恢复
 * 案例：
 *  1.棋类游戏中的，悔棋
 *  2.普通软件中的，撤销操作
 *  3.数据库软件中的，事务管理中的，回滚操作
 *  4.Photoshop软件中的，历史记录
 * @Author yzh
 * @Date 2020/4/23 19:53
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        CareTaker taker = new CareTaker();

        Emp emp = new Emp("xxx",18,8000);
        System.out.println("第一次对象"+emp);

        taker.setMemento(emp.memento());//做一次备份

        emp.setAge(22);
        emp.setEname("xxz");
        emp.setSalary(5000);
        System.out.println("第二次数据"+emp);

        emp.recovery(taker.getMemento());//恢复
        System.out.println("回复后数据"+emp);

    }
}
