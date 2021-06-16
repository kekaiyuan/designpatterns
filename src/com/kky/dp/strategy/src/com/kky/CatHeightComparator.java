package com.kky.dp.strategy.src.com.kky;

/**
 * @author 柯凯元
 * @create 2021/6/3 15:38
 */
//具体策略角色，将猫根据身高降序排序
public class CatHeightComparator extends Comparator<Cat> {

    @Override
    public int compare(Cat o1, Cat o2) {
        if (o1.height > o2.height) {
            return -1;
        } else if (o1.height < o2.height) {
            return 1;
        } else {
            return 0;
        }
    }
}
