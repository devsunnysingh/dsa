package src.com.algorithmpractice.algos.search.binary;

public class SerachPeakInMountainArray {
//    pehle mid nikaal
    private static int peakIndexInMountainArray(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }
            else if(arr[mid]>arr[mid+1]){
                end=mid;
            }
        }
        return start;
    }
    public static void main(String[] args) {
//                 0,1,2,3,4,5,6,7
        int[] arr={1,2,3,5,6,4,3,2};
        System.out.println(peakIndexInMountainArray(arr));



    }
}
