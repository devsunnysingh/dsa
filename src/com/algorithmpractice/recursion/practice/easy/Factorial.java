package src.com.algorithmpractice.recursion.practice.easy;

public class Factorial {
    public static int factorial(int n){
        int fact=1;
        if(n==0 || n==1){
            return fact;
        }
        fact=n*factorial(n-1);
        return fact;


    }
    public static void main(String[] args) {
        System.out.println(factorial(5));


    }
}
