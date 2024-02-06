package com.algorithmpractice.algos.search.linear;

import com.sun.jdi.connect.Connector;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr={2,3,4,9,8,76,5,4,34,3,322,-21,5,-343};
        int startRange=2;
        int endRange=7;
        int target=9;
        System.out.println(searchInRange(arr,startRange,endRange,target));

    }
    static int searchInRange(int[] arr,int startRange, int endRange, int target){
        for(int index=startRange; index<=endRange; index++){
            if(arr[index]==target){
                return index+1;
            }
        }

        return -1;
    }
}
