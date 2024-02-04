package BST;

import com.sun.source.tree.Tree;

public class BSTree {

    private TreeNode root;

    public BSTree(){
        root = null;
    }
    public boolean isEmpty( ){
        return (root == null);
    }

    public void addItem(int data){ // This method is a public interface that allows adding an item to the Binary Search Tree
        root = insertNode(data,root); // Calls the private insertNode method to handle the recursive insertion of the item
    }
    private TreeNode insertNode(int data, TreeNode node){ // This is a private recursive method responsible for inserting a new node
        if(node == null) // If the current node is null, create a new node with the given data
            node = new TreeNode(data);
        else if(data > node.getNodeData())// If the given data is greater than the data in the current node, insert it in the right subtree
            node.setRightNode(insertNode(data,node.getRightNode()));// Recursively call insertNode on the RIGHT subtree and update the right child of the current node
        else // If the given data is less than or equal to the data in the current node
            node.setLeftNode(insertNode(data, node.getLeftNode())); // Recursively call insertNode on the LEFT subtree, and update the left child
        return node; // Return the updated node after the insertion
    }

    public void inOrderTraversal(){  // ΕΝΔΟΔΙΑΤΕΤΑΓΜΕΝΗ ΔΙΑΣΧΙΣΗ
        System.out.println("INORDER TRAVERSAL: ");
        inOrder(root); // Calls the private inOrder method, starting the traversal from the root of the tree
    }
    private void inOrder(TreeNode root) {//LNR
        if (root == null)
            return;
        inOrder(root.getLeftNode());  // Recursively traverse the left subtree (L).
        System.out.println(root.getNodeData());  // Print the data of the current node (N).
        inOrder(root.getRightNode());   // Recursively traverse the right subtree (R).
    }


    public void preOrderTraversal( ){ // ΠΡΟΔΙΑΤΕΤΑΓΜΕΝΗ ΔΙΑΣΧΙΣΗ
        System.out.println("PREORDER TRAVERSAL");
        preOrder(root); // Calls the private preOrder method, starting the traversal from the root of the tree
    }

    private void preOrder(TreeNode root) {//LNR
        if (root == null)
            return;
        System.out.println(root.getNodeData()); // Print the data of the current node (N).
        preOrder(root.getLeftNode()); // Recursively traverse the left subtree (L).
        preOrder(root.getRightNode()); // Recursively traverse the right subtree (R).
    }

    public void postOrderTreaversal( ) { // ΜΕΤΑΔΙΑΤΕΤΑΓΜΕΝΗ ΔΙΑΣΧΙΣΗ
        System.out.println("PREORDER TRAVERSAL");
        postOrder(root); // Calls the private postOrder method, starting the traversal from the root of the tree
    }
    private void postOrder(TreeNode root) {//LNR
        if (root == null)
            return;
        postOrder(root.getLeftNode()); // Recursively traverse the left subtree (L).
        postOrder(root.getRightNode()); // Recursively traverse the right subtree (R).
        System.out.println(root.getNodeData()); // Print the data of the current node (N).
    }

}
