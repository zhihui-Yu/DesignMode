package com.yzh.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author yzh
 * @Date 2020/4/20 16:30
 * @Version 1.0
 */
public class StarHandler implements InvocationHandler {
    private Star realStar;

    public StarHandler(Star realStar) {
        this.realStar = realStar;
    }

    //动态生成代理类代码 调用invoke方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("面谈-签合同-付款-订票");
        if(method.getName().equals("sing")){
            method.invoke(realStar,args);
        }
        System.out.println("收尾款");
        return null;
    }
}
