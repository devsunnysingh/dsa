package src.com.algorithmpractice.algos.search.binary;

public class SortedArrayInfiniteNumbers {
    private static int findingRange(int[] arr, int target){
        //        starting with a box of size 2
        int start=0;
        int end=1;
        if(target<arr[end]){
            int temp=end+1;
//            End should be double-->
            end=end+(end-start+1)*2;//+1 to get the index of the array
            start=temp;
        }
        return searchInfiniteArray(arr,target,start,end);
    }
    private static int searchInfiniteArray(int[] arr, int target, int start, int end){
        int mid=start+(end-start)/2;
        while(start<=end){
            mid=start+(end-start)/2;
            if(target==mid){
                return mid;
            }
            else if(target>mid){
                start=mid+1;
            }
            else if(target<mid){
                end=mid-1;
            }

        }

        return 0;
    }

    public static void main(String[] args) {


    }
}
