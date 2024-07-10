package src.com.algorithmpractice.recursion.binarySearch;

public class BinarySearch {
    public static int binarySearch(int[] array, int num){

        int start=0;
        int end=array.length-1;
        int mid= (end-start)/2;
        while (start<=end){
            if(array[mid]==num){
                return mid+1;
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
    public static int binarySearchWithRecursion(int[] arr,int start, int end, int num){
        if(start>end){
            return -1;
        }
        int m= (end-start)/2;
//        base condition
        if(arr[m]==num){
            return m;
        }
        if(num<arr[m]){
//            int[] arr,int start, int end, int num
            return binarySearchWithRecursion(arr,start,m-1,num);
        }

        return binarySearchWithRecursion(arr,num,m+1,num);

    }
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 10, 40 };
        int x = 10;
//        System.out.println("Position is:"+binarySearch(arr,3));
        System.out.println("Position is:"+binarySearchWithRecursion(arr,0,arr.length-1,3));
    }
}
