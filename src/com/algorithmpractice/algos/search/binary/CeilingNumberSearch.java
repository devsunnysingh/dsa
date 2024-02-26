package src.com.algorithmpractice.algos.search.binary;
public class CeilingNumberSearch{
    private static int ceilingSearch(int[] array, int target){
        int start=0;
        int end=array.length-1;
        int mid=0;
        if(target>array[end]){
            return -1;
        }
        while(start<=end){
            mid=start+(end-start)/2;
            if(target==array[mid]){
                return mid;
            }
            else if(target>array[mid]){
                start=mid+1;
            }
            else if(target<array[mid]){
                end=mid-1;
            }
        }
        return array[mid+1];



    }

    public static void main(String[] args) {
        int[] arr={1,3,4,5,7,8,9,11,25,30,33,40};
        int target=31;
        System.out.println(ceilingSearch(arr, target));
    }

}