package com.yzh.structural.bridge;

/**
 * 不用桥接模式问题：
 * 1. 扩展性问题
 * 2. 违反单一原则
 * @Author yzh
 * @Date 2020/4/20 19:47
 * @Version 1.0
 */
public interface Computer {
    void sale();
}
class Desktop implements Computer{

    @Override
    public void sale() {
        System.out.println("销售台式机");
    }
}
class Laptop implements Computer{

    @Override
    public void sale() {
        System.out.println("销售笔记本");
    }
}
class Pad implements Computer{

    @Override
    public void sale() {
        System.out.println("销售平板笔记本");
    }
}
class LenovoDesktop extends Desktop{
    @Override
    public void sale() {
        System.out.println("销售联想台式机");
    }
}
class LenovoLaptop extends Laptop{
    @Override
    public void sale() {
        System.out.println("销售联想笔记本");
    }
}
class LenovoPad extends Pad{
    @Override
    public void sale() {
        System.out.println("销售联想Pad");
    }
}
class HaseeDesktop extends Desktop{
    @Override
    public void sale() {
        System.out.println("销售神舟台式机");
    }
}
class HaseeLaptop extends Laptop{
    @Override
    public void sale() {
        System.out.println("销售神舟笔记本");
    }
}
class HaseePad extends Pad{
    @Override
    public void sale() {
        System.out.println("销售神舟Pad");
    }
}
class DellDesktop extends Desktop{
    @Override
    public void sale() {
        System.out.println("销售戴尔台式机");
    }
}
class DellLaptop extends Laptop{
    @Override
    public void sale() {
        System.out.println("销售戴尔笔记本");
    }
}
class DellPad extends Pad{
    @Override
    public void sale() {
        System.out.println("销售戴尔Pad");
    }
}