package com.algorithmpractice.algos.search.linear;

public class MinNumberInArray {
    public static void main(String[] args) {
        int[] arr={10, 20, 30, 40};
        System.out.println(findMinArray(arr));

    }
    static int findMinArray(int[] a){
        int min=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<min)
                min=a[i];

        }
        return min;
    }


}
