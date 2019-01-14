package com.company;

public class Bubble_Sort {
    public static void sort(String[] arr) {
        boolean sorted = false;
        int s;
        while (!sorted) {
            s = 0;
            for(int i = 0; i < arr.length - 1; i++) {
                if(arr[i].compareTo(arr[i+1]) < 0) {
                    swap(arr, i, i+1);
                    s++;
                }
            }
            if(s == 0) {
                sorted = true;
            }
        }
    }

    public static String toString(String[] arr) {
        String str = "";
        for(int i = 0; i < arr.length; i++) {
            str += arr[i];
            if(i < arr.length - 1) {
                str += ", ";
            }
        }
        return str;
    }

    private static void swap(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
