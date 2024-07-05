package src.com.algorithmpractice.recursion;

public class NumberExample_withRecursion {
    //    write a number that takes in a number and prints it
//    print first 5 number
    static void printNumber(int n){
        if(n==5){
            return;
        }
        System.out.println(n);
        printNumber(n+1);

    }


    static void printNumber5(int n) {
        System.out.println(n);
    }


    public static void main(String[] args) {
        printNumber(1);
    }

}
