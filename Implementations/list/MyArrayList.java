package com.Implementations.list;

import com.Interface.list;

public class MyArrayList<E> implements list<E> {
    private Object[] elements;
    private int size;

    public MyArrayList() {
        elements = new Object[10];
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }
}
