package src.com.algorithmpractice.recursion.practice.easy;

public class NtoOne {
    public static void printNNumbers(int n){
        if(n==0){
            return;

        }else{
            System.out.println(n);
            printNNumbers(n-1);
        }



    }
    public static void main(String[] args) {
        printNNumbers(5);

    }
}
