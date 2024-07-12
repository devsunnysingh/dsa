package src.com.algorithmpractice.recursion.practice.easy;

public class SumOfNNumbers {
    public static int sumUsingRecursion(int n) {
        if(n==1){
            return 1;
        }

       return n+sumUsingRecursion(n - 1);
    }
    public static void main(String[] args) {
        System.out.println(sumUsingRecursion(5));
    }
}
