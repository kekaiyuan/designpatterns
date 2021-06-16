package com.kky.dp.strategy;

/**
 * @author 柯凯元
 * @create 2021/6/3 15:38
 */
//具体策略角色，将狗按照食量升序排序
public class DogComparator extends Comparator<Dog> {

    @Override
    public int compare(Dog o1, Dog o2) {
        if (o1.food > o2.food) {
            return 1;
        } else if (o1.food < o2.food) {
            return -1;
        } else {
            return 0;
        }
    }

}
