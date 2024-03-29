package src.com.algorithmpractice.algos.sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={3,1,5,4,2};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr){

//        run the steps n-1 times
        for (int i=0;i<arr.length;i++){
            System.out.println("Value of I="+i);
//            swapped=false;
//        for each step, max item will come at the last respective index
            for(int j=1;j<arr.length-i;j++){
//      swap if the item is smaller than previous item
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
//                    swapped=true;
                }
                System.out.println("J="+j);
                System.out.println(Arrays.toString(arr));

            }
            System.out.println("Internal for over");
//            if you did not swap for a particular vcalue of i, it means array is sorted hence stop the program


        }
    }
}
