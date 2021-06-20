package com.kky.dp.Iterator;

public interface Iterator_<T> {
    //是否存在下一个元素
    boolean hasNext();
    //取出当前元素并指向下一个元素
    T next();
}
