package com.kky.dp.Iterator;

/**
 * 相比数组，这个容器不用考虑边界问题，可以动态扩展
 */
class LinkedList_<T> implements Collection_<T> {
    //头结点
    Node head = null;
    //尾结点
    Node tail = null;
    //目前容器中有多少个元素
    private int size = 0;

    public void add(T object) {
        Node node = new Node(object);
        node.next = null;

        if (head == null) {
            head = node;
            tail = node;
        }

        tail.next = node;
        tail = node;
        size++;
    }

    private class Node {
        private T object;
        Node next;

        public Node(T object) {
            this.object = object;
        }
    }

    public int size() {
        return size;
    }

    @Override
    public Iterator_ iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator_<T> {

        //当前结点
        Node node = head;

        //是否存在下一个元素
        @Override
        public boolean hasNext() {
            if (node != null) {
                return true;
            }else{
                return false;
            }

        }

        //取出当前元素，并指向下一个元素
        @Override
        public T next() {
            T object = node.object;
            node = node.next;
            return object;
        }
    }
}
