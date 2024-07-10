package src.com.algorithmpractice.recursion.binarySearch;

public class BinarySearch {
    public static int binarySearch(int[] array, int num){

        int start=0;
        int end=array.length-1;
        int mid= (end-start)/2;
        while (start<=end){
            if(array[mid]==num){
                return mid;
            }
            else if(array[mid]>num){
                mid=mid-1;
            }
            else {
                mid=mid+1;
            }
        }
        return -1;


    }
    public static int binarySearchWithRecursion(int[] arr,int start, int end, int target){
        if(start>end){
            return -1;
        }
        int m= (end+start)/2;
//        base condition
        if(arr[m]==target){
            return m;
        }
        if(target<arr[m]){
//            int[] arr,int start, int end, int target
            return binarySearchWithRecursion(arr,start,m-1,target);
        }

        return binarySearchWithRecursion(arr,m+1, end,target);

    }
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 10, 40 };
        int x = 10;
        System.out.println("Position is:"+binarySearch(arr,3));
        System.out.println("Position is:"+binarySearchWithRecursion(arr,0,arr.length-1,3));
    }
}
