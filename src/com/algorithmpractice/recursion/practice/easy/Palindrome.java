package src.com.algorithmpractice.recursion.practice.easy;

public class Palindrome {
    public static boolean isPalindrome(int n){
        int digit=(int)(Math.log10(n))+1;
        int revNumber=helper(n, digit);
        if(n== revNumber) {
            return true;
        }
        return false;
    }
    public static int helper(int n,int digit){
        if (n % 10 == n) {
            return n;
        }
        return (n%10)*(int)(Math.pow(10,digit-1))+helper(n/10,digit-1);

    }
    public static void main(String[] args) {


        System.out.println(isPalindrome(123454321));
        System.out.println(isPalindrome(124322));
    }
}
