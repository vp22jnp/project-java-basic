package com.bridgelabday3;

public class largestElementofArray {
    public static void main(String[] args) {
        int[]arr=new int[]{1,2,3,4,5};
        System.out.println("elements of array");
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max)
                max = arr[i];
        }
        System.out.println("Largest element present in given array: " + max);
    }
}