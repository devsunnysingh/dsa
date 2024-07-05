# Recursion
Calling the same function again and again

```
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

    static void printNumber5(int n) {
        System.out.println(n);
    }


    public static void main(String[] args) {
        printNumber(1);
}

}
```
## Program flow
Important points
1. While the function is not finished in executing, it will stay in the stack.
2. When a function is finished executing, it will be removed from the stack. And the flow of the program will be returned 
to the function that called it.



How function calls work in languages like Java, C, C++, etc.
Explaination:
First main() function is called

So, main will go in the first in the stack, and then printNumber will go in the second in the stack, and then
printNumber2 will go in the third in the stack, and then printNumber3 will go in the fourth in the stack, and then
printNumber4 will go in the fifth in the stack, and then printNumber5 will go in the sixth in the stack, and then it
will return to printNumber4, and then printNumber3, and then printNumber2, and then printNumber, and then it will return
to main.

So the main function will come out of the stack at last.
Order of coming out of the stack is:
1. First printNumber5 comes out of the stack. 
2. Then printNumber4 comes out of the stack. 
3. Then printNumber3 comes out of the stack. 
4. Then printNumber2 comes out of the stack. 
5. Then printNumber comes out of the stack. 
6. Then main comes out of the stack.

# Important concept of Recursion
1. Function calling itself is called Recursion.
2. Base condition: It is a condition that stops the recursion. Or, it is a condition where it stops calling the function again.

# Why Recursion is important?
1. Helps us in solving bigger complex problems in a simpler way.
2. **We can convert recursion problems to iteration problems and vice versa. This is helpful in solving problems.**
3. Space complexity is not constant because of recursive calls.
4. Helps in breaking down bigger problems into smaller problems.


## Vizualization of recursion --> **VVVV. Important**


