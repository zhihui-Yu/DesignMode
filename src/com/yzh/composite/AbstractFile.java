package com.yzh.composite;

import javax.swing.plaf.basic.BasicMenuBarUI;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author yzh
 * @Date 2020/4/20 20:47
 * @Version 1.0
 */
public interface AbstractFile {
    void killVirus();//杀毒
}

/**
 * 图像文件杀毒
 */
class ImageFile implements AbstractFile{

    private String name;

    public ImageFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("--图像文件："+name+"，进行查杀");
    }
}

/**
 * 文本文件杀毒
 */
class TextFile implements AbstractFile{

    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("--文本文件："+name+"，进行查杀");
    }
}

/**
 * 视频文件杀毒
 */
class VideoFile implements AbstractFile{

    private String name;

    public VideoFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("--视频文件："+name+"，进行查杀");
    }
}
//文件件
class Folder implements AbstractFile{

    private String name;
    //定义容器，用来存放本容器构建下的子节点
    private List<AbstractFile> list = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(AbstractFile file){
        list.add(file);
    }
    public void  remove(AbstractFile file){
        list.remove(file);
    }
    public AbstractFile getChild(int index){
        return list.get(index);
    }

    @Override
    public void killVirus() {
        System.out.println("--文件夹："+ name+",进行查杀");

        //天然递归
        for (AbstractFile file : list) {
            file.killVirus();
        }
    }
}