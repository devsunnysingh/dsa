//package src.com.algorithmpractice.algos.search.binary;
//
//public class FindInMountainArray {
//    private static int search(int[] arr, int target){
//        int start=0;
//        int end=arr.length;
//        while (start<end){
//            int mid=start+(end-start)/2;
//            if(target>arr[mid]){
//                start=mid+1;
//            }else if(target<arr[mid]){
//                end=mid;
//
//            }else{
//                return mid;
//            }
//        }
//        return -1;
//    }
//    public static void main(String[] args) {
////                 0,1,2,3,4,5,6
//        int[] arr={1,2,3,4,5,3,1};
//        System.out.println(search(arr,3));
//
//    }
//}
