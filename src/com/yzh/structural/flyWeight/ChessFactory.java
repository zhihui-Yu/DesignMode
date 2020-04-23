package com.yzh.structural.flyWeight;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author yzh
 * @Date 2020/4/23 12:34
 * @Version 1.0
 */
public class ChessFactory {
    //享元池
    private static Map<String,Chess> map = new HashMap<>();

    public static Chess getChess(String color){
        if(map.get(color)!=null){
            return map.get(color);
        }else {
            Chess chess = new ConcreteChess(color);
            map.put(color,chess );
            return chess;
        }
    }
}
