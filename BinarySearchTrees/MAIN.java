package BST;

public class MAIN {
    public static void main(String [] args) {
        int matrix[ ] = {40, 15, 25, 50, 20, 10, 70, 55, 45, 5 };

        BSTree tree = new BSTree( );
        for (int i=0; i<matrix.length; i++) tree.addItem(matrix[i]);
        tree.inOrderTraversal( );
        tree.preOrderTraversal( );
        tree.postOrderTreaversal( );
    }
}
