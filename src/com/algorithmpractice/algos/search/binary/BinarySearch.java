package com.algorithmpractice.algos.search.binary;

public class BinarySearch {

    public static void main(String[] args) {
        int[] array={ 2, 3, 4, 10, 40 };
        int target=10;
        System.out.println("Element is present at position-->"+binarySearch(array,target));

    }
//    return the index
//    return -1 if not found
    public static int binarySearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start)+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }else if(target>arr[mid]){
                start=mid+1;
            }else if(target<arr[mid]){
                end=mid-1;
            }else{
                return mid+1;
            }

        }
        return -1;
//        return mid+1;
    }
}
