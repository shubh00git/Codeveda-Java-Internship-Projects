public class BinarySearchTree {
    // The root of the BST. Initially, the tree is empty.
    private TreeNode root;

    public BinarySearchTree() {
        this.root = null;
    }

    // --- 1. INSERTION ---

    /**
     * Public method to insert a value into the BST.
     * This is the method that users will call.
     */
    public void insert(int data) {
        root = insertRec(root, data); // Calls the recursive helper method
    }

    /**
     * A recursive helper method to insert a new value into the tree.
     * @param current The current node in the traversal.
     * @param data The value to be inserted.
     * @return The root of the (potentially modified) subtree.
     */
    private TreeNode insertRec(TreeNode current, int data) {
        // If the tree (or subtree) is empty, create a new node and return it as the new root.
        if (current == null) {
            return new TreeNode(data);
        }

        // If the data is smaller, go to the left subtree.
        if (data < current.data) {
            current.left = insertRec(current.left, data);
        // If the data is larger, go to the right subtree.
        } else if (data > current.data) {
            current.right = insertRec(current.right, data);
        }

        // If data is equal to current.data, do nothing (no duplicates allowed).
        return current;
    }

    // --- 2. TRAVERSALS ---

    /**
     * Public method to perform an in-order traversal (Left, Root, Right).
     * This traversal visits nodes in ascending order.
     */
    public void inOrder() {
        System.out.print("In-order Traversal: ");
        inOrderRec(root);
        System.out.println();
    }

    private void inOrderRec(TreeNode current) {
        if (current != null) {
            inOrderRec(current.left);
            System.out.print(current.data + " ");
            inOrderRec(current.right);
        }
    }

    /**
     * Public method to perform a pre-order traversal (Root, Left, Right).
     */
    public void preOrder() {
        System.out.print("Pre-order Traversal: ");
        preOrderRec(root);
        System.out.println();
    }

    private void preOrderRec(TreeNode current) {
        if (current != null) {
            System.out.print(current.data + " ");
            preOrderRec(current.left);
            preOrderRec(current.right);
        }
    }

    /**
     * Public method to perform a post-order traversal (Left, Right, Root).
     */
    public void postOrder() {
        System.out.print("Post-order Traversal: ");
        postOrderRec(root);
        System.out.println();
    }

    private void postOrderRec(TreeNode current) {
        if (current != null) {
            postOrderRec(current.left);
            postOrderRec(current.right);
            System.out.print(current.data + " ");
        }
    }
}