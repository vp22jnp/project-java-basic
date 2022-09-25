package com.bridgelabday2;

public class sumOfnaturalnumber {
    public static void main(String[] args) {
        int num = 5, i = 1, sum = 0;
        while(i <= num)
        {
            sum = sum +i;
            i++;
        }
        System.out.println("Sum of First 100 Natural Numbers is = " + sum);
    }
}

