package com.algorithmpractice.algos.search.linear;

import java.util.Arrays;

public class Search2DArray {
    public static void main(String[] args) {
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        int target=5;
        int[] ans=search(myNumbers,target);

        System.out.println(Arrays.toString(ans));

    }
    static int[] search(int[][] arr,int target){
        int position=0;
        for(int row=0;row<arr.length;row++){
            for(int column=0;column<arr[row].length;column++){
                    if(target==arr[row][column])
                        return new int[]{row,column};
//                        return "Element is present at row "+row+" and column "+column;
            }
        }
        return new int[]{-1,-1};
//        return "NULL";
    }
}
