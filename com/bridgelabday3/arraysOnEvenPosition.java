package com.bridgelabday3;

public class arraysOnEvenPosition {
    public static void main(String[] args) {
        System.out.println("enetr numbers present on even position");
        int[] arr = new int[]{1, 2, 3, 4, 5};
        for (int i = 1; i < arr.length; i = i + 2) {
            System.out.println(arr[i]);

        }
    }
}

