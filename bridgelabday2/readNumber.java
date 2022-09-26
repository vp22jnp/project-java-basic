package com.bridgelabday2;
import java.util.Scanner;
public class readNumber {
    public static void main (String [] args){
        int num1,length;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        num1= sc.nextInt();
        if(num1==0) {
            System.out.println("empty");
        }else if(num1==4){
            System.out.println("four");
        }else{
            System.out.println("no");
        }
    }
}

