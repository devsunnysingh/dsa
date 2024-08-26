package src.com.trees.binarytrees.AvlTrees;


public class AVL {

        public class AVLNode {
            int height;
            int value;
            AVLNode left;
            AVLNode right;

            public AVLNode(int value) {
                this.value = value;
            }

            public int getValue() {
                return value;
            }

            public void setValue(int value) {
                this.value = value;
            }
        }

        AVLNode root;



        public int height(AVLNode node) {
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

        private AVLNode insert(int value, AVLNode node) {
            if (node == null) {
                node = new AVLNode(value);
                return node;
            }

            if (value < node.value) {
                node.left = insert(value, node.left);
            } else if (value > node.value) {
                node.right = insert(value, node.right);
            }

            node.height = Math.max(height(node.left), height(node.right)) + 1;
            return rotate(node);
        }
        public AVLNode rotate(AVLNode node){
            if(height(node.left)-height(node.right)>1){
//                This means the node is left heavy
//                Left heavy has 2 cases:
//                LL case and LR case
//                Talking about LL Case:
//differnce of node.left.left and node.left.right are positive, the it is LL case
               if(height(node.left.left)-height(node.right.right)>0){
//                This should be LL case, which means Right Rotate
                   return rightRotate();
               }
//differnce of node.left.left and node.left.right is negative, the it is LR case
                if(height(node.left.left)-height(node.right.right)<0){
                    node.left=leftRotate(node.left);
                    return rightRotate(node);
                }

            }

            if(height(node.left)-height(node.right)<-1){
//                This one is for right heavy
//                Right heavy has 2 cases:
//                RR case and RL case
//                Talking about RR Case:
//differnce of node.right.left and node.right.right are positive, the it is RR case
                if(height(node.right.left)-height(node.right.right)<0){
//                This should be LL case, which means Right Rotate
                    return leftRotate();
                }
//differnce of node.right.left and node.right.right is positive, the it is RL case
                if(height(node.right.left)-height(node.right.right)>0){
                    node.left=rightRotate(node.right);
                    return leftRotate(node);
                }
                return node;

            }

            return node;
        }
        public AVLNode leftRotate(AVLNode c){
            AVLNode p=c.right;
            AVLNode t=p.left;
            p.left=c;
            c.right=t;
            p.height=Math.max(height(p.left),height(p.right)+1);
            c.height=Math.max(height(c.left),height(c.right)+1);
//            new node is c. So return it.
            return p;
        }
        public AVLNode rightRotate(AVLNode p){
            AVLNode c=p.left;
            AVLNode t=c.right;
            c.right=p;
            p.left=t;
            p.height=Math.max(height(p.left),height(p.right)+1);
            c.height=Math.max(height(c.left),height(c.right)+1);
//            new node is c. So return it.
            return c;
        }

        public boolean balanced() {
            return balanced(root);
        }

        private boolean balanced(AVLNode node) {
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

        private void display(AVLNode node, String details) {
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
            src.com.trees.binarytrees.BinarySearchTree tree = new src.com.trees.binarytrees.BinarySearchTree();
            int[] nums = {3, 4, 5,1, 2,  6, 8};
            tree.populate(nums);
            tree.display();
        }
    }



