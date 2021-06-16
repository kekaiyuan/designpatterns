package com.kky.dp.strategy.src.com.kky;

/**
 * @author 柯凯元
 * @create 2021/6/13 4:34
 */

//Context上下文角色，也叫Context封装角色。
//起承上启下的作用，屏蔽高层模块对策略、算法的直接访问，封装可能存在的变化。
public class ComparatorContext<T> {
    private Comparator comparator;

    public ComparatorContext(Comparator comparator) {
        this.comparator = comparator;
    }

    public int compare(T o1, T o2){
        return comparator.compare(o1, o2);
    }

}
