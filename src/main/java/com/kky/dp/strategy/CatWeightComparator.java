package com.kky.dp.strategy;

/**
 * @author 柯凯元
 * @create 2021/6/3 15:38
 */
//具体策略角色，将猫根据体重升序排序
public class CatWeightComparator extends Comparator<Cat> {

    @Override
    public int compare(Cat o1, Cat o2) {
        if (o1.weight > o2.weight) {
            return 1;
        } else if (o1.weight < o2.weight) {
            return -1;
        } else {
            return 0;
        }
    }
}
