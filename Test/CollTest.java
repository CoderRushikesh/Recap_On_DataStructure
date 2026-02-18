package com.Test;

import com.Implementations.list.MyArrayList;


public class CollTest {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();
        System.out.println(list.isEmpty());
        
        list.add(23);
        System.out.println("Size: " + list.size()); // prints 0
        System.out.println(list.isEmpty());
    }
}