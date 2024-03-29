package src.com.algorithmpractice.algos.search.binary;
//https://leetcode.com/problems/find-in-mountain-array/description/
//[1,2,3,4,5,3,1]
// 0,1,2,3,4,5,6
//find teh peak
//waha se ascen mei search karlo
//and desc mei search karlo

public class FindInMountainArray {
    private static void search(int[] array, int start, int end, int target){
        int peak=findPeak(array);
      int asc=ascSearch(array,start,peak,target);
      int desc=descSearch(array,peak,end,target);
        System.out.println("Asc->"+asc);
        System.out.println("dESc->"+desc);

    }

    private static int ascSearch(int[] array, int start, int end, int target) {
//        System.out.println("Ascending");
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>array[mid]){
//                System.out.println("position 1"+end);
                start=mid+1;
            }else if(target<array[mid]){
//                System.out.println("position 2"+start);
                end=mid-1;
            }else if (array[mid]==target){
//                System.out.println("position mid"+mid);
                return mid;
            }

        }
        return -1;

    }
    private static int descSearch(int[] array, int start, int end, int target){
//        System.out.println("Descending");
        while(start<=end){
//            System.out.println("Hello");
            int mid=start+(end-start)/2;
            if(target<array[mid]){
                start=mid+1;
            }else if(target>array[mid]){
                end=mid-1;
            }else if (array[mid]==target){
                return mid;
            }
        }
        return -1;
    }



    private static int findPeak(int[] arr){
//        Yeh wala function sahi hai

//                 0,1,2,3,4,5,6
//      int[] arr={1,2,3,6,5,3,1};
        int start=0;
        int end=arr.length;
        int peak=0;
        while(start<end){
            peak=start+(end-start)/2;
            if(arr[peak]>arr[peak+1]){
                end=peak;
            }else if(arr[peak]<arr[peak+1]){
                start=peak+1;
            }
        }
        return peak;
    }


    public static void main(String[] args) {
//                 0,1,2, 3,4,5,6,7
        int[] arr={1,2,3,10,9,5,3,1};
        int target=3;
//        System.out.println(search(arr,0,arr.length,target));
        System.out.println("This is answer");
        search(arr,0,arr.length,target);


    }
}
