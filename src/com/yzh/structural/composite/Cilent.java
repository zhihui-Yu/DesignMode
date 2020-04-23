package com.yzh.structural.composite;

/**
 * @Author yzh
 * @Date 2020/4/20 20:54
 * @Version 1.0
 */
public class Cilent {
    public static void main(String[] args) {

        AbstractFile f2,f3,f4,f5,f6;

        Folder f1 = new Folder("我的收藏");
        f2 = new ImageFile("test.png");
        f3 = new TextFile("hello.txt");
        f1.add(f2);
        f1.add(f3);


        Folder f11 = new Folder("电影");
        f4 = new VideoFile("神雕侠侣.avi");
        f5 = new VideoFile("笑傲江湖.avi");
        f11.add(f4);
        f11.add(f5);
        f1.add(f11);

        f1.killVirus();
    }

}
