# Binary Trees in Java

## Introduction
A **Binary Tree** is a hierarchical data structure in which each node has at most two child nodes: **left** and **right**. Binary trees are widely used in applications like searching, sorting, and expression evaluation.

## Types of Binary Trees
1. **Full Binary Tree**: Every node has either 0 or 2 children.
2. **Complete Binary Tree**: All levels are completely filled except possibly the last level.
3. **Perfect Binary Tree**: All interior nodes have two children, and all leaves are at the same level.
4. **Balanced Binary Tree**: The height difference between left and right subtrees is at most one.
5. **Degenerate (Skewed) Tree**: Every parent node has only one child.

## Binary Tree Representation in Java
A binary tree is implemented using nodes that contain a **data field** and **references** to left and right children.

### **1. Node Structure**
```java
class Node {
    int data;
    Node left, right;

    public Node(int value) {
        data = value;
        left = right = null;
    }
}
```

### **2. Binary Tree Implementation**
```java
class BinaryTree {
    Node root;

    // Constructor
    BinaryTree() {
        root = null;
    }

    // Inorder Traversal (Left -> Root -> Right)
    void inorderTraversal(Node node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.data + " ");
            inorderTraversal(node.right);
        }
    }

    // Preorder Traversal (Root -> Left -> Right)
    void preorderTraversal(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorderTraversal(node.left);
            preorderTraversal(node.right);
        }
    }

    // Postorder Traversal (Left -> Right -> Root)
    void postorderTraversal(Node node) {
        if (node != null) {
            postorderTraversal(node.left);
            postorderTraversal(node.right);
            System.out.print(node.data + " ");
        }
    }

    // Main method to test the tree
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Inorder Traversal: ");
        tree.inorderTraversal(tree.root);
        
        System.out.println("\nPreorder Traversal: ");
        tree.preorderTraversal(tree.root);
        
        System.out.println("\nPostorder Traversal: ");
        tree.postorderTraversal(tree.root);
    }
}
```

## Binary Tree Traversal Methods
Traversal methods define how nodes are visited in a tree.
1. **Inorder (Left, Root, Right)**: Used for sorting in BST.
2. **Preorder (Root, Left, Right)**: Used for tree copying and expression trees.
3. **Postorder (Left, Right, Root)**: Used for deleting trees and expression trees.

### Example Output
```
Inorder Traversal:
4 2 5 1 3
Preorder Traversal:
1 2 4 5 3
Postorder Traversal:
4 5 2 3 1
```

## Applications of Binary Trees
- **Binary Search Trees (BSTs)** for fast searching.
- **Expression Trees** for evaluating expressions.
- **Huffman Trees** for data compression.
- **Decision Trees** for AI and machine learning.

## Conclusion
Binary Trees are a fundamental data structure that forms the basis of more complex tree-based structures like BSTs, AVL Trees, and Heaps. Understanding their implementation in Java is crucial for solving various programming problems efficiently.

