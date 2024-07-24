package src.com.algorithmpractice.recursion.arrays;

public class isSortedArray {
    static int i=0;
    public static boolean isSorted(int[] arr, int index){
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && isSorted(arr, index + 1);


    }
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(isSorted(array,0));
    }
}
