package com.yzh.behaviour.memento;

/**
 * @Author yzh
 * @Date 2020/4/23 19:56
 * @Version 1.0
 */
public class Emp {
    private String ename;
    private int age;
    private double salary;

    @Override
    public String toString() {
        return "Emp{" +
                "ename='" + ename + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    //备份
    public EmpMemento memento() {
        return new EmpMemento(this);
    }

    //恢复
    public void recovery(EmpMemento memento) {
        this.age = memento.getAge();
        this.ename = memento.getEname();
        this.salary = memento.getSalary();
    }

    public Emp() {
    }

    public Emp(String ename, int age, double salary) {
        this.ename = ename;
        this.age = age;
        this.salary = salary;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
