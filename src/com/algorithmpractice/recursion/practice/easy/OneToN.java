package src.com.algorithmpractice.recursion.practice.easy;

public class OneToN {
    public static void printNNumbers(int n){
        if(n==0){
            return;

        }else{
            printNNumbers(n-1);
            System.out.println(n);

        }


    }

    public static void main(String[] args) {
        printNNumbers(5);

    }

}
