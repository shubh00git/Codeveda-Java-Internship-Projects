/**
 * Represents a single node in the Binary Search Tree.
 * Each node holds an integer value and references to its left and right children.
 */
public class TreeNode {
    int data; // The data value of the node
    TreeNode left; // Pointer to the left child node
    TreeNode right; // Pointer to the right child node

    // Constructor to create a new node with a given value
    public TreeNode(int data) {
        this.data = data;
        this.left = null; // A new node initially has no children
        this.right = null;
    }
}