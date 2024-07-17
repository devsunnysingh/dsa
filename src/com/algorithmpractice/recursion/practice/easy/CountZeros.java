package src.com.algorithmpractice.recursion.practice.easy;

public class CountZeros {
    static int sum=0;
    public static int countZeros(int n){
        if (n == 0) {
            return 0;
        }

        int lastDigit=n%10;
        if (lastDigit == 0) {
            return 1 + countZeros(n / 10);
        }else {
            return countZeros(n / 10);
        }

    }
    public static void main(String[] args) {

        System.out.println(countZeros(1234));
        System.out.println(countZeros(123400));
    }
}
