public class Main {
    public static void main(String[] args) {
        System.out.println("--- Binary Search Tree Implementation ---");

        // Create a new Binary Search Tree
        BinarySearchTree bst = new BinarySearchTree();

        // Insert nodes into the tree
        System.out.println("Inserting values: 50, 30, 70, 20, 40, 60, 80");
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);

        System.out.println("\nTree construction complete.\n");

        // Perform and print the different traversals
        bst.inOrder();    
        bst.preOrder();   
        bst.postOrder();  
    }
}