package com.kky.dp.iterator;


/**
 * 相比数组，这个容器不用考虑边界问题，可以动态扩展
 */
class ArrayList_<T> implements Collection_<T> {
    T[] objects = (T[]) new Object[10];
    //数组中第一个空余的位置，等同于数组的长度
    private int index = 0;

    public void add(T object) {
        //如果数组已满
        if (index == objects.length) {
            //拓展一个两倍长度数组
            T[] newObjects = (T[]) new Object[objects.length * 2];
            //把原数组数据复制到新数组中
            System.arraycopy(objects, 0, newObjects, 0, objects.length);
            //返回新数组
            objects = newObjects;
        }

        objects[index] = object;
        index++;
    }

    public int size() {
        return index;
    }

    @Override
    public Iterator_<T> iterator() {
        return new ArrayListIterator();
    }

    private class ArrayListIterator<T> implements Iterator_<T> {

        //当前元素下标
        private int currentIndex = 0;

        //是否存在下一个元素
        @Override
        public boolean hasNext() {
            if (currentIndex >= index) {
                return false;
            } else {
                return true;
            }
        }

        //取出当前元素，并指向下一个元素
        @Override
        public T next() {
            T object = (T) objects[currentIndex];
            currentIndex++;
            return object;
        }
    }

}