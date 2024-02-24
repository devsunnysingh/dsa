package com.algorithmpractice.algos.search.binary;

import static com.algorithmpractice.algos.search.binary.BinarySearch.binarySearch;

public class OrderAgnosticBinarySearch  {
    private static int checkOrder(int[] arr){
        int len=arr.length-1;
        if(arr[0]>arr[len]){
//            System.out.println(1);
            return 1;//desc
        }else{
//            System.out.println(0);
            return 0;//asc
        }
    }
    private static String search(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        if(checkOrder(arr)==1){
            while(start<=end){
                int mid=start+(end-start)/2;
                System.out.println(mid);
                if(target==arr[mid]){
                    System.out.println("Mid-->"+mid);
                    return "position "+mid;
                }else if(target>arr[mid]){
                    end=mid-1;System.out.println("End-->"+end);
                }else if (target<arr[mid]){
                    start=mid+1;
                    System.out.println("Start-->"+start);
                }
            }
        }else if(checkOrder(arr)==1){
            while(start<=end){
                int mid=start+(end-start)/2;
                if(target==arr[mid]){
                    return "position "+mid;
                }else if(target>arr[mid]){
                    start=mid+1;
                }else if (target<arr[mid]){
                    end=mid-1;
                }
            }
        }
        return "not found";
    }

    public static void main(String[] args) {
//        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int[] arr2 = {99, 80, 75, 22, 11, 10, 5, 2, -3};
        int target1=2;
//        int target2=-3;
//        int target4=15;
//        int target5=45;
        System.out.println(search(arr2,target1));
    }
}
