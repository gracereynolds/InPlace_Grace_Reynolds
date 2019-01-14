package com.company;

public class Select_Sort {
    public static void sort(double[] arr) {
        int min;
        for(int i = 0; i < arr.length - 1; i++) {
            min = NextMin(arr, i);
            if (i != min) {
                swap(arr, i, min);
            }
        }
    }

    public static String toString(double[] arr) {
        String str = "";
        for(int i = 0; i < arr.length; i++) {
            str += arr[i];
            if(i < arr.length - 1) {
                str += ", ";
            }
        }
        return str;
    }

    private static void swap(double[] arr, int i, int j) {
        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static int NextMin(double[] arr, int ind) {
        int temp = ind;
        for (int i = ind + 1; i < arr.length; i++) {
            if(arr[i] < arr[temp]) {
                temp = i;
            }
        }
        return temp;
    }
}
