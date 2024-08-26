package src.com.trees.binarytrees;
    import java.util.Scanner;

public class BinaryTreeClass {
    private Node root;

    //insert elements
    public void populate(Scanner s){
        System.out.println("Enter the Root node :");
        int value= s.nextInt();
        root = new Node(value);
        populate(s, root);
    }
    public void populate(Scanner scanner, Node node){
        System.out.println("Do you want to enter to the left of node "+node.getValue());
        boolean left=scanner.nextBoolean();
        if(left){
            System.out.println("Enter the value of the  left of : "+node.getValue());
            int value=scanner.nextInt();
            node.setLeft(new Node(value));
            populate(scanner,node.getLeft());
        }
        System.out.println("Do you want to insert right of "+node.getValue());
        boolean right=scanner.nextBoolean();
        if(right){
            System.out.println("Enter the value of the right of :"+node.getValue());
            int value=scanner.nextInt();
            node.setRight(new Node(value));
            populate(scanner, node.getRight());
        }
    }
    public void display() {
        display(root, "");  // Pass the class-level root variable
    }

    public void display(Node node, String indent) {
        if (node == null) {
            return;
        }

        System.out.println(indent + node.getValue());
        display(node.getLeft(), indent + "\t");
        display(node.getRight(), indent + "\t");
    }

    public void prettyDisplay(){
        prettyDisplay(root,0);
    }
    public void prettyDisplay(Node node, int level){
        if(node==null){
            return;
        }
        prettyDisplay(node.getRight(), level + 1);
        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------>" + node.getValue());
        } else {
            System.out.println(node.getValue());
        }
        prettyDisplay(node.getLeft(), level+1);
    }
    public void preOrder(){
        preOrder(root);
    }
    //    traversal methods (VVI)               Use case
//    Three types:
//    Pre order traversal, N->l->R

//
    public void preOrder(Node node){
        if(node==null){
            return;
        }
        System.out.println(node.getValue());
        preOrder(node.getLeft());
        preOrder(node.getRight());

    }
    //    In order traversal, L-> N-> R  --> Helps in sorting BST
    public void inOrder(){
        inOrder(root);
    }
    public void inOrder(Node node){
        if(node==null){
            return;
        }
        inOrder(node.getLeft());
        System.out.println(node.getValue());
        inOrder(node.getRight());
    }

    //    Post order traversal, L->R->N ---> used to Delete a binary trees
    public void postOrder(){
        inOrder(root);
    }
    public void postOrder(Node node){
        if(node.getLeft()==null){
            return;
        }
        inOrder(node.getLeft());
        System.out.println(node.getValue());
        inOrder(node.getRight());
    }





}
