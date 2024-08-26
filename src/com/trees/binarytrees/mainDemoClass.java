package src.com.trees.binarytrees;

import java.util.Scanner;

public class mainDemoClass {
    public static void main(String[] args) {
//        binarytreeDemo();
        BSTDemo();
    }
    public static void binarytreeDemo(){
        Scanner scanner=new Scanner(System.in);
        BinaryTreeClass tree=new BinaryTreeClass();
        tree.populate(scanner);
        tree.display();
        tree.prettyDisplay();
    }
    public static  void BSTDemo(){
        BinarySearchTree tree=new BinarySearchTree();
        int[] nums={1,2,3,4,5,6, 8};
        tree.populate(nums);
        tree.display();
    }

}
