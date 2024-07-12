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
//sometimes we need additional parameters in the arguments of the function.
//  int that case, make another fiunction and pass the parameter as the argument of the function.
    public static int reverseUsingRecursion(int n, int base){
        if (n == 0) {
            return 0;
        }
    int rem = 0;
        rem=n % 10;
        rem=(int)(rem * Math.pow(10, base)) + reverseUsingRecursion(n / 10, base - 1);
        return rem;

    }
    public static void main(String[] args) {
//        System.out.println(reverseUsingRecursion(12345));
        reverseUsingRecursion(12345);
        System.out.println(sum);
        System.out.println(reverseUsingRecursion(12345, 4));
    }
}
