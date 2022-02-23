package com.kky.dp.chainofresponsibility;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * 责任链
 *
 * @author 柯凯元
 * @date 2022-02-23 17:37
 */
public class ChainOfResponsibility implements MethodInterface {
    private List<MethodInterface> chain = new ArrayList<MethodInterface>(){{
        add(new Method1());
        add(new Method2());
        add(new Method3());
    }};

    public void addMethod(MethodInterface method){
        chain.add(method);
    }

    public void removeMethod(MethodInterface method){
        chain.remove(method);
    }

    @Override
    public boolean method() {
        return false;
    }
}
