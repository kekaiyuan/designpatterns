package com.kky.dp.strategy.src.com.kky;

import com.kky.*;

import java.util.Arrays;

/**
 * @author 柯凯元
 * @create 2021/6/3 14:42
 */
public class Test {

    public static void main(String[] args) {

        ComparatorContext comparatorContext = null;
        Sorter sorter = new Sorter();
        //创建Cat数组
        Cat[] cats = {new Cat(5, 5), new Cat(3, 3), new Cat(1, 1)};
        //创建Dog数组
        Dog[] dogs = {new Dog(5), new Dog(3), new Dog(1)};

        //将猫根据体重升序排序

        comparatorContext = new ComparatorContext(new CatWeightComparator());
        sorter.sort(cats, comparatorContext);
        System.out.println("将猫根据体重升序排序\n" + Arrays.toString(cats));

        //将猫根据身高降序排序

        comparatorContext = new ComparatorContext(new CatHeightComparator());
        sorter.sort(cats, comparatorContext);
        System.out.println("将猫根据身高降序排序\n" + Arrays.toString(cats));

        //将狗按照食量升序排序

        comparatorContext = new ComparatorContext(new DogComparator());
        sorter.sort(dogs, comparatorContext);
        System.out.println("将狗按照食量升序排序\n" + Arrays.toString(dogs));
    }

}
