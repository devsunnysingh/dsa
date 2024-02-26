package src.com.algorithmpractice.algos.search.binary;

public class Leetcode744 {
    private static char smallestGreaterThantarget(char[] letters, char target){
        int start=0;
        int end= letters.length-1;
        // int mid=0;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>letters[mid]){
                // end=mid-1;
                start=mid+1;
            }
            else{
                end=mid-1;
                // start=mid+1;
            }
        }
        return letters[start%letters.length];

    }
    public static void main(String[] args) {
        char[] arr={'c','f','j'};
        char[] arr1={'a','b','c','r','s','t','t'};
        char target='t';
        System.out.println(smallestGreaterThantarget(arr1,target));
    }
}
