package src.com.trees.binarytrees;


public class BinarySearchTree {
    public class Node {
        int height;
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }

    private Node root;

    public BinarySearchTree() {}

    public int height(Node node) {
        if (node == null) {
            return 0;
        }
        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(int value) {
        root = insert(value, root);
    }

    private Node insert(int value, Node node) {
        if (node == null) {
            node = new Node(value);
            return node;
        }

        if (value < node.value) {
            node.left = insert(value, node.left);
        } else if (value > node.value) {
            node.right = insert(value, node.right);
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return node;
    }

    public boolean balanced() {
        return balanced(root);
    }

    private boolean balanced(Node node) {
        if (node == null) {
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1
                && balanced(node.left)
                && balanced(node.right);
    }

    public void populate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            insert(nums[i]);
        }
    }

    public void display() {
        display(root, "Root node: ");
    }

    private void display(Node node, String details) {
        if (node == null) {
            return;
        }
        System.out.println(details + node.value);
        display(node.left, "Left child of " + node.getValue() + " : ");
        display(node.right, "Right child of " + node.getValue() + " : ");
    }
//    traversal methods (VVI)               Use case
//    Three types:
//    Pre order traversal, N->l->R
//    In order traversal, L-> N-> R  --> Helps in sorting BST
//    Post order traversal, L->R->N ---> used to Delete a binary trees
//


    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        int[] nums = {3, 4, 5,1, 2,  6, 8};
        tree.populate(nums);
        tree.display();
    }
}
