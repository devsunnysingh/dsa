package com.algorithmpractice.algos.search.linear;

public class LinearSearchAlgorithm {
    public static void main(String[] args) {
        int[] nums={22,12,-1,-45,43,23,76,878,4,332};
        int target=4;
        int ans=linearSearchAlgorithm(nums, target);
        System.out.println("Answer is -->"+ans);
    }
    public static int linearSearchAlgorithm(int[] arr, int target){
        if(arr.length==0)
            return -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i+1;
            }
        }
        return -1;
    }
}
