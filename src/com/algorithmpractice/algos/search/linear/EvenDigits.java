package com.algorithmpractice.algos.search.linear;

import org.w3c.dom.ls.LSOutput;

public class EvenDigits {
    public static int countEvenNumbers(int[] arr){
        int count=0;
        for(int index=0;index<arr.length;index++){
            if(isEven(arr[index])){
                count=count+1;
            }

        }
        return count;
    }
    public static boolean isEven(int number){
        int length=0;
        while(number>0){
            number=number/10;
            length=length+1;

        }
        System.out.println("Length is "+length);
        if(length%2==0){
            return true;
        }
        else {
            return  false;
        }
    }

    public static void main(String[] args) {
        int[] numbers={123,32,34532,3,44};
        System.out.println(countEvenNumbers(numbers));
    }

}
