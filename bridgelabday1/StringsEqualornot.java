package com.bridgelabday1;
import java.util.Scanner;
public class StringsEqualornot {
    public static void main(String[] args) {
        String s1, s2;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first name");
        s1 = sc.nextLine();
        System.out.println("enter second name");
        s2 = sc.nextLine();
        if (s1 == s2)
        {
            System.out.println("string is equal");
        }else{
            System.out.println("string is not equal");
        }

    }
}


