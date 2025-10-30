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
    } // internal implemtation is remaining 

    public static int binarySearch(MyArray arr, int fromIndex, int toIndex, int key) {
        return java.util.Arrays.binarySearch(arr.toIntArray(), fromIndex, toIndex, key);
    } // imp remaining 

    // Comparison 
    public static boolean equals(MyArray a, MyArray b) {
        return java.util.Arrays.equals(a.toIntArray(), b.toIntArray());
    } // imp remaining 

    public static int mismatch(MyArray a, MyArray b) {
        return java.util.Arrays.mismatch(a.toIntArray(), b.toIntArray());
    } // imp remaining 

    public static int compare(MyArray a, MyArray b) {
        return java.util.Arrays.compare(a.toIntArray(), b.toIntArray());
    } // imp remaining 

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

    //  Copying
    public static MyArray copyOf(MyArray original, int newLength) {
        int[] temp = java.util.Arrays.copyOf(original.toIntArray(), newLength);
        MyArray copy = new MyArray(newLength);
        copy.setFromArray(temp);
        return copy;
    }

    public static MyArray copyOfRange(MyArray original, int from, int to) {
        int[] temp = java.util.Arrays.copyOfRange(original.toIntArray(), from, to);
        MyArray copy = new MyArray(temp.length);
        copy.setFromArray(temp);
        return copy;
    }
    
   //  toString method is created for conversion 
    public static String toString(MyArray arr) {
        return java.util.Arrays.toString(arr.toIntArray());
    }
        // imp remaining 
   


    //  Index search
    public static int indexOf(MyArray arr, int value) {
        int[] temp = arr.toIntArray();
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == value) return i;
        }
        return -1;
    }
  //  Max and Min
    public static int max(MyArray arr) {
        int[] temp = arr.toIntArray();
        int max = temp[0];
        for (int val : temp) {
            if (val > max) max = val;
        }
        return max;
    }

    public static int min(MyArray arr) {
        int[] temp = arr.toIntArray();
        int min = temp[0];
        for (int val : temp) {
            if (val < min) min = val;
        }
        return min;
    }


    }

