# Binary Search Tree (BST)

A **Binary Search Tree (BST)** is a special type of binary tree where each node has the following properties:

1. The value of the left child is less than the value of its parent node.
2. The value of the right child is greater than the value of its parent node.
3. The left and right subtrees are also binary search trees.

This structure makes searching, insertion, and deletion operations efficient (average time complexity: O(log n)).

---

## Key Properties of a BST

- **Left Subtree**: Contains nodes with values less than the parent node.
- **Right Subtree**: Contains nodes with values greater than the parent node.
- **Unique Values**: No duplicate values (in most cases).

---

## Why Use a Binary Search Tree?

- **Efficient Searching**: Average-case O(log n) time complexity for search operations.
- **Efficient Insertion/Deletion**: Average-case O(log n) for insertion and deletion.
- **Ordered Data**: BSTs keep elements in a sorted order, enabling in-order traversal to retrieve elements in ascending order.

---

## Basic Operations in a BST

### 1. **Search**

The search operation finds if a value exists in the BST. It starts at the root and moves left or right based on comparisons:

- If the target value is less than the current node, go to the left subtree.
- If the target value is greater than the current node, go to the right subtree.
- If the target value equals the current node, return the node.

#### Example Code (Recursive Search):

```java
public TreeNode searchInBST(TreeNode root, int val) {
    if (root == null || root.val == val)
        return root;
    if (val < root.val)
        return searchInBST(root.left, val);
    else
        return searchInBST(root.right, val);
}
```

### 2. **Insertion**

The insertion operation adds a new value to the BST while maintaining its properties.

- Traverse the tree until the correct position is found (left for smaller values, right for larger values).
- Insert the new node as a leaf node.

#### Example Code:

```java
public TreeNode insertIntoBST(TreeNode root, int val) {
    if (root == null) {
        return new TreeNode(val);
    }
    if (val < root.val) {
        root.left = insertIntoBST(root.left, val);
    } else {
        root.right = insertIntoBST(root.right, val);
    }
    return root;
}
```

### 3. **Deletion**

The deletion operation removes a node from the BST. There are three cases:

- **Case 1**: Node to be deleted has no children (leaf node). Simply remove the node.
- **Case 2**: Node to be deleted has one child. Replace the node with its child.
- **Case 3**: Node to be deleted has two children. Replace the node with its in-order successor (smallest node in the right subtree) or in-order predecessor (largest node in the left subtree).

#### Example Code:

```java
public TreeNode deleteNode(TreeNode root, int key) {
    if (root == null) return null;

    if (key < root.val) {
        root.left = deleteNode(root.left, key);
    } else if (key > root.val) {
        root.right = deleteNode(root.right, key);
    } else {
        if (root.left == null) return root.right;
        if (root.right == null) return root.left;

        TreeNode successor = findMin(root.right);
        root.val = successor.val;
        root.right = deleteNode(root.right, successor.val);
    }
    return root;
}

private TreeNode findMin(TreeNode root) {
    while (root.left != null) root = root.left;
    return root;
}
```

### 4. **Traversal**

Traversal refers to visiting all nodes in a specific order:

- **In-order Traversal**: Left, Root, Right (produces a sorted order in BST).
- **Pre-order Traversal**: Root, Left, Right.
- **Post-order Traversal**: Left, Right, Root.

#### Example Code (In-order Traversal):

```java
public void inOrderTraversal(TreeNode root) {
    if (root == null) return;
    inOrderTraversal(root.left);
    System.out.print(root.val + " ");
    inOrderTraversal(root.right);
}
```

---

## Time Complexity

| Operation | Average Case | Worst Case (Skewed Tree) |
| --------- | ------------ | ------------------------ |
| Search    | O(log n)     | O(n)                     |
| Insertion | O(log n)     | O(n)                     |
| Deletion  | O(log n)     | O(n)                     |
| Traversal | O(n)         | O(n)                     |

---

## Example Binary Search Tree

Consider the following BST:

```
      10
     /  \
    5    15
   / \     \
  2   7     20
```

### Operations on the Tree

- **Search** for `7`: Start at `10`, go left to `5`, then right to `7`. Found.
- **Insert** `12`: Start at `10`, go right to `15`, then left to insert `12`.
- **Delete** `5`: Replace `5` with its in-order successor (`7`).

---

## Tips for Revising

1. **Draw the Tree**: Always visualize the BST to understand operations clearly.
2. **Practice Recursive and Iterative Approaches**.
3. **Understand Edge Cases**: Empty tree, single node, skewed tree, etc.
4. **Solve Problems**: Practice problems on platforms like LeetCode, GeeksforGeeks, or HackerRank.

---

## Summary

A Binary Search Tree is a powerful data structure that provides efficient operations for searching, insertion, and deletion. With proper practice, it becomes a foundational concept for understanding more advanced data structures like AVL Trees, Red-Black Trees, and B-Trees.

Happy Learning! 🎉
