package com.bridgelabday3;

public class smallestElementinarray {
    public static void main(String[] args) {
        int[] arr = new int[]{75, 850, 15, 20, 25};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }

        System.out.println("smallest number of array" +min);
    }
}



