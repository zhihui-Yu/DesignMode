package com.yzh.behaviour.iterator;

import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author yzh
 * @Date 2020/4/23 14:49
 * @Version 1.0
 */
public class ConcreteMyAggregate {
    private List<Object> list = new ArrayList<>();

    public ConcreteMyAggregate() {
    }
    public void addObject(Object obj){
        this.list.add(obj);
    }
    public void removeObject(Object obj){
        this.list.remove(obj);
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    //返回迭代器
    public MyIterator createIterator () {
        return new ConcreteIterator();
    }

    private class ConcreteIterator implements MyIterator {

        private int cursor;//定义游标 记录遍历的位置

        @Override
        public void first() {
            cursor = 0;
        }

        @Override
        public void next() {
            if(cursor < list.size()) {
                cursor++;
            }
        }

        @Override
        public boolean hasNext() {
            if (list.size() > cursor) {
                return true;
            }
            return false;
        }

        @Override
        public boolean isFirst() {
            return cursor == 0 ;
        }

        @Override
        public boolean isLast() {
            return cursor == (list.size() -1) ;
        }

        @Override
        public Object getCurrentObj() {
            return list.get(cursor);
        }
    }
}
