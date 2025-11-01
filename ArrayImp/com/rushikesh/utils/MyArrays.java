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
    // i have implemented the binary search but it will work when the arrays is sorted so before using this method use the sort method 
    public static int binarySearch(MyArray arr, int key) {
        System.out.println("please sort the Array first using sort method  / if you have sorted then ignore it ");
    int[] data = arr.toIntArray();
    int low = 0;
    int high = data.length - 1;

    while (low <= high) {
        int mid = low + (high - low) / 2;

        if (data[mid] == key) return mid;
        else if (data[mid] < key) low = mid + 1;
        else high = mid - 1;
    }

    return -1; // Not found
}


  public static int binarySearch(MyArray arr, int fromIndex, int toIndex, int key) {
    int[] data = arr.toIntArray();

    if (fromIndex < 0 || toIndex > data.length || fromIndex > toIndex)
        throw new IllegalArgumentException("Invalid range");

    int low = fromIndex;
    int high = toIndex - 1;

    while (low <= high) {
        int mid = low + (high - low) / 2;

        if (data[mid] == key) return mid;
        else if (data[mid] < key) low = mid + 1;
        else high = mid - 1;
    }

    return -1;
}


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

