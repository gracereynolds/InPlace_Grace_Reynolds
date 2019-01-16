package com.company;

public class Main {

    public static void main(String[] args) {
        String[] test1 = {"grace", "is", "the", "best"};
        double[] test2 = {4.2, 7.1, 8.5, 3.9};
        int[] test3 = {3, 2, 0, 1};
        long time;
        System.out.println("Before: " + Bubble_Sort.toString(test1));
        time = System.nanoTime();
        Bubble_Sort.sort(test1);
        time = System.nanoTime() - time;
        System.out.println("After: " + Bubble_Sort.toString(test1));
        System.out.println("Time taken: " + time);
        System.out.println("Before: " + Select_Sort.toString(test2));
        time = System.nanoTime();
        Select_Sort.sort(test2);
        time = System.nanoTime() - time;
        System.out.println("After: " + Select_Sort.toString(test2));
        System.out.println("Time taken: " + time);
        System.out.println("Before: " + Insert_Sort.toString(test3));
        time = System.nanoTime();
        Insert_Sort.sort(test3);
        time = System.nanoTime() - time;
        System.out.println("After: " + Insert_Sort.toString(test3));
        System.out.println("Time taken: " + time);
    }
}
