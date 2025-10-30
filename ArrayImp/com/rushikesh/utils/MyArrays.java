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
    public static int binarySearch(MyArray arr, int key) {
        return java.util.Arrays.binarySearch(arr.toIntArray(), key);
    }

    public static int binarySearch(MyArray arr, int fromIndex, int toIndex, int key) {
        return java.util.Arrays.binarySearch(arr.toIntArray(), fromIndex, toIndex, key);
    }

    // Comparison 
    public static boolean equals(MyArray a, MyArray b) {
        return java.util.Arrays.equals(a.toIntArray(), b.toIntArray());
    }

    public static int mismatch(MyArray a, MyArray b) {
        return java.util.Arrays.mismatch(a.toIntArray(), b.toIntArray());
    }

    public static int compare(MyArray a, MyArray b) {
        return java.util.Arrays.compare(a.toIntArray(), b.toIntArray());
    }

    //  Filling
    public static void fill(MyArray arr, int value) {
        int[] temp = arr.toIntArray();
        java.util.Arrays.fill(temp, value);
        arr.setFromArray(temp);
    }

    public static void fill(MyArray arr, int fromIndex, int toIndex, int value) {
        int[] temp = arr.toIntArray();
        java.util.Arrays.fill(temp, fromIndex, toIndex, value);
        arr.setFromArray(temp);
    }

    
    }

