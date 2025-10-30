package com.rushikesh.utils;

import com.rushikesh.datastructures.MyArray;
public final class MyArrays {

    private MyArrays() {
        // Prevent instantiation
    }

    // Sorting
    public static void sort(MyArray arr) {
        int[] temp = arr.toIntArray();
        java.util.Arrays.sort(temp);
        arr.setFromArray(temp);
    }

    public static void sort(MyArray arr, int fromIndex, int toIndex) {
        int[] temp = arr.toIntArray();
        java.util.Arrays.sort(temp, fromIndex, toIndex);
        arr.setFromArray(temp);
    }

    //  Searching
   

    
    }

