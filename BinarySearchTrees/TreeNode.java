package BST;

public class TreeNode {
    // Instance fields (data members)
    private TreeNode left;
    private int item;
    private TreeNode right;
    // Methods

    public TreeNode(){}
    public TreeNode(int item){
        this.item = item;
        left = null;
        right = null;
    }

    public int getNodeData(){ //The usual getData and setData methods
        return item;
    }
    public void setNodeData(int item){ //
        this.item = item;
    }
    public TreeNode getLeftNode(){
        return left;
    }
    public TreeNode getRightNode( ){
        return right;
    }
    public boolean isLeaf(){
        return (left == null && right == null);
    }
    public void setLeftNode(TreeNode left){
        this.left = left;
    }
    public void setRightNode(TreeNode right){
        this.right = right;
    }
}
