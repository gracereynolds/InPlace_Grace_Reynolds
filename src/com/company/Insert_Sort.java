package com.company;

public class Insert_Sort {
    public static void sort(int[] arr) {
        int temp;
        for(int i = 1; i < arr.length; i++) {
            temp = arr[i];
            for(int j = i-1; j >= 0; j--) {
                if(temp < arr[j]) {
                    swap(arr, j, j+1);
                }
            }
        }
    }

    public static String toString(int[] arr) {
        String str = "";
        for(int i = 0; i < arr.length; i++) {
            str += arr[i];
            if(i < arr.length - 1) {
                str += ", ";
            }
        }
        return str;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
