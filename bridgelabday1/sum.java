package com.bridgelabday1;
import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        int num1,num2,sum;
        Scanner sc= new Scanner(System.in) ;
        System.out.println("enter first number");
        num1= sc.nextInt();
        System.out.println("enter second number");
        num2= sc.nextInt();
        sum= num1+num2;
        System.out.println("sum of two numbers" +sum);
    }


}
