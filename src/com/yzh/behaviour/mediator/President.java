package com.yzh.behaviour.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author yzh
 * @Date 2020/4/23 15:20
 * @Version 1.0
 */
public class President implements Mediator {

    private Map<String,Department> map = new HashMap<>();

    @Override
    public void register(String dname, Department d) {
        map.put(dname,d);
    }

    @Override
    public void command(String dname) {
        map.get(dname).selAction();
    }
}
