package src.com.algorithmpractice.algos.sort;

import java.util.Arrays;

/*Idea behind it
We are sorting the array partially
Example: First sort till pass number 0, that is first 2,
then sort till index 1, that is first 3,
then sort till index 2, that is first 4,
and goes on...
For every index:
put the index element at the correct index of LHS.
So, at first pass: i=0,
first two will be sorted,
at i=1
this will be sorted with the third array.
 SO basically things on the LHS keeps getting sorted.
 */
//{5,3,4,1,2}
//{3,5,4,1,2}
/*
* Advantage of this sort:
* Adapative: Steps gets reduced if the array is sorted.
* */
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={5,3,4,1,2};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
    }
    public static void insertionSort(int[] arr){
        for(int pass=0;pass< arr.length-1;pass++){
            for(int j=pass+1;j>0;j--){
//when arr[j]<arr[j-1], then break the loop,
// because you dont have to check anything else as it is sorted
                if(arr[j]<arr[j-1]){
                    arrSwap(arr,j,j-1);
                }else{
                    break;
                }
            }
        }

    }

    private static void arrSwap(int[] arr, int a, int b) {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

}
