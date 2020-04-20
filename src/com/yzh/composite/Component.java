package com.yzh.composite;

/**
 * 组合模型案列--使整个对象都执行同样的操作
 * 抽象组件
 * @Author yzh
 * @Date 2020/4/20 20:42
 * @Version 1.0
 */
public interface Component {
    void operation();
}
//叶子组件
interface Leaf extends Component{
}
//容器组件
interface Composite extends Component{
    void add(Component component);
    void remove(Component component);
    Component getChild(int index);
}
