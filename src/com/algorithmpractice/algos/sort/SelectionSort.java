package src.com.algorithmpractice.algos.sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={4,5,1,2,3};
        selectionSort(arr);
    }
    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
//            find max in the remaining array and swap with correct index;
            int lastPos= arr.length-i-1;
            int maxIndex=getMaxIndex(arr,0,lastPos);
            arraySwap(arr,maxIndex,lastPos);

        }
        System.out.println(Arrays.toString(arr));

    }
    static void arraySwap(int[] arr, int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    private static int getMaxIndex(int[] arr,int start, int end){
        int max=start;
        for (int i = start; i <=end ; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

}
