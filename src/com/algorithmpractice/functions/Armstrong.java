package com.algorithmpractice.functions;

import java.util.Arrays;
import java.util.Scanner;

public class Armstrong {
    static String isArmstrong(int n){
        int orig=n;
        int digit;
        int result=0;
        int size= String.valueOf(n).length();
        while(n!=0){
            digit=n%10;
            n=n/10;
            result+=Math.pow(digit,size);

        }
        if(result==orig){
            return("com.algorithmpractice.functions.Armstrong");
        }else {
            return ("NA");

        }


    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num;
        System.out.println("enter a number:");
        num=s.nextInt();
        System.out.println(isArmstrong(num));

    }
}
