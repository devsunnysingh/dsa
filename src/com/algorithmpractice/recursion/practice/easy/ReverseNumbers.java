package src.com.algorithmpractice.recursion.practice.easy;

public class ReverseNumbers {
    static int sum=0;
    public static void reverseUsingRecursion(int n){
        if(n == 0) {
            return ;
        }
        int rem=n % 10;
        sum= (sum * 10) + rem;
        reverseUsingRecursion(n/ 10);
    }
    public static void main(String[] args) {
//        System.out.println(reverseUsingRecursion(12345));
        reverseUsingRecursion(12345);
        System.out.println(sum);
    }
}
