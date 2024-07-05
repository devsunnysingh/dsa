package src.com.algorithmpractice.recursion;

public class NumberExample {
    //    write a number that takes in a number and prints it
//    print first 5 number
    static void printNumber(int n){
        System.out.println(n);
        printNumber2(2);
    }
    static void printNumber2(int n) {
        System.out.println(n);
        printNumber3(3);
    }
    static void printNumber3(int n) {
        System.out.println(n);
        printNumber4(4);
    }

    static void printNumber4(int n) {
        System.out.println(n);
        printNumber5(5);
    }
//function body here change here
    static void printNumber5(int n) {
        System.out.println(n);
    }


    public static void main(String[] args) {
        printNumber(1);
    }

}
