package com.yzh.structural.bridge;

/**
 * @Author yzh
 * @Date 2020/4/20 20:00
 * @Version 1.0
 */
public class Computer2 {
    protected Brand brand;
    public Computer2(Brand brand){
        this.brand = brand;
    }

    public void sale(){
        brand.sale();
    }
}
class Desktop2 extends Computer2{

    public Desktop2(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("销售台式机");
    }
}
class Laptop2 extends Computer2{

    public Laptop2(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("销售笔记本");
    }
}
