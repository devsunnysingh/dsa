# My practice of Algorithms
Common terms in binary Trees:
- **Node**: A basic unit of a binary tree containing data and references to child nodes.
- **Root**: The topmost node of a binary tree, from which all nodes originate.
- **Leaf (or Terminal) Node**: A node with no children.
- **Internal Node**: A node with at least one child.
- **Parent Node**: A node that has one or more child nodes.
- **Child Node**: A node that is a descendant of another node (its parent).
- **Left Child**: The left subtree of a node.
- **Right Child**: The right subtree of a node.
- **Subtree**: A tree consisting of a node and all its descendants.
- **Depth**: The number of edges from the root node to a given node.
- **Height**: The number of edges on the longest path from a given node to a leaf node.
- **Level**: The level of a node is the number of edges from the root node to that node.
- **Degree**: The number of children a node has.


## Binary trees
1. Complete Binary tree- 
   - All the levels which we have are filled, apart from the last level. 
   - Last level is full from left to right.
2. Full Binary Tree/ STrict Binary tree:
   - Each node has either zero or two children.
3. Perfect Binary trees:
   - All the internal node have 2 children.
   - All the leaf nodes are on the same level.
4. Height Balanced Trees: Average height is O(log n)
5. Skewed Bbinary trees: every node has only one child. Max height is O(N).
6. Ordered Binary trees: Every node here follows some property/feature. Example: binary Search Tress.

## Properties which are important for interview;
1. Perfect BT, height=h, then 
   - total nodes: 2^(h+1) + 1.
   - Total number of leaf node: 2^h
   - Suppose, we have n number of leaves, the number of levels: Log N + 1 
2. If we have strict BT, and we have N leaf nodes:
   - Then umber of internal nodes: N-1
   - Number of leaf nodeS: no. of internal nodes + 1

//    traversal methods (VVI)               Use case
//    Three types:
//    Pre order traversal, N->l->R
//    In order traversal, L-> N-> R  --> Helps in sorting BST
//    Post order traversal, L->R->N ---> used to Delete a binary trees
//


## Heaps

1. Introduction to Heaps
   Heap is a special tree-based data structure that satisfies the heap property. However, it is stored as an array.
   Min-Heap: The key at the root must be the minimum among all keys in the heap, and the same property must be recursively true for all subtrees.
   Max-Heap: The key at the root must be the maximum among all keys in the heap, and the same property must be recursively true for all subtrees.
2. Properties of Heaps
   Complete Binary Tree: Heaps are complete binary trees, meaning all levels are completely filled except possibly for the last level, which is filled from left to right.
   Heap Height: The height of a heap is O(log n) where n is the number of nodes in the heap.
3. Operations on Heaps
   Insertion

Insert the new element at the end of the heap (bottom rightmost position).
Compare the inserted element with its parent and bubble up (swap) until the heap property is restored.
Time Complexity: O(log n)
Deletion (Remove Root)

Replace the root with the last element in the heap.
Remove the last element.
Compare the new root with its children and bubble down (swap) until the heap property is restored.
Time Complexity: O(log n)
Peek (Get Root)

Return the root element of the heap without removing it.
Time Complexity: O(1)
4. Implementation of a Heap in Java
   Java provides a built-in PriorityQueue class that implements a min-heap by default.