package com.kky.dp.strategy;

import com.kky.ComparatorContext;

/**
 * @author 柯凯元
 * @create 2021/6/3 14:43
 */
//根据不同的策略进行排序
public class Sorter {

    public void sort(Object[] arr, ComparatorContext comparatorContext) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                minPos = comparatorContext.compare(arr[j], arr[minPos]) == -1 ? j : minPos;
            }
            swap(arr, i, minPos);
        }
    }

    private void swap(Object[] arr, int i, int j) {
        Object temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
