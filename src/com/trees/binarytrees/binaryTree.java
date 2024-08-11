package src.com.trees.binarytrees;

import java.util.Scanner;

public class binaryTree {

    static Scanner s=new Scanner(System.in);
    public binaryTree() {
    }
    private Node node;
    //insert elements
    public static void populate(Scanner s){
        System.out.println("Enter the Root node value:");
        int value= s.nextInt();
        Node root = new Node(value);
        populate(s, root);
    }
    private static void populate(Scanner s, Node n){
        System.out.println("Do you want to enter to the left of node "+n.getValue());
        boolean left=s.nextBoolean();
        if(left){
            System.out.println("Enter the value: ");
            n.setLeft(new Node(n.getValue()));
        }
//        start from 1:14:02
    }

}
