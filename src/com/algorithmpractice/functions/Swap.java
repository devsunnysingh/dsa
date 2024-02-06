package com.algorithmpractice.functions;

public class Swap {
//    public static void swap(int a, int b){
//        int temp;
//        temp=b;
//        b=a;
//        a=temp;
//        System.out.println("a="+a+" and b="+b);
//    }
    public static void swapWithoutTemp(int b, int c){
        if(b>c){
            System.out.println("Value before swap:"+b+" and "+c);
            c=b+c;//5=3+2
            b=c-b;//2=5-3
            c=c-b;//3
            System.out.println("Value after swap:"+b+" and "+c);
        } else if(b<c){
            System.out.println("Value before swap:"+b+" and "+c);
            b=b+c;//7=2+5
            c=b-c;//7-5
            b=b-c;//3
            System.out.println("Value after swap:"+b+" and "+c);
        }

    }
    public static void main(String args[]){
//     swap(2,3);
     swapWithoutTemp(3,2);
     swapWithoutTemp(2,5);

    }

}
