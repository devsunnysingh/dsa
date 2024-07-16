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
    static int rev2(int n){
//        sometimes we need additional variables in the arguents of the function.
//        in that case, we make another function
        int digits=(int)(Math.log10(n))+1;
        return helper(n, digits);
    }
    private static int helper(int n, int digits){
        if(n%10==n){
            return n;
        }
        int rem=n%10;
        return rem* (int)Math.pow(10, digits - 1) + helper(n / 10, digits - 1);
    }
    public static void main(String[] args) {
//        System.out.println(reverseUsingRecursion(12345));
        reverseUsingRecursion(12345);

        System.out.println(sum);
        System.out.println(reverseUsingRecursion(12345, 4));
        System.out.println(   rev2(12345));
    }
}
