package src.com.algorithmpractice.recursion.arrays;

import java.util.ArrayList;

public class LinearSearch {
    static ArrayList<Integer> posArray = new ArrayList<>();
    static void linearSearch(int[] arr, int value, int pos){
        if(arr[pos] == value) {
            posArray.add(pos+1);
        }
        if(pos>= arr.length - 1) {
            return;
        }
        linearSearch(arr, value, pos + 1);
    }


    public static void main(String[] args) {
        int[] array = {1, 3, 3, 5, 6, 7, 8, 9};
        linearSearch(array, 3,0);
        System.out.println(posArray);
    }
}
