package binaryTreePractice;

public class TreeNode {
    //data
    private int val;
    private TreeNode left;
    private TreeNode right;

    //constructors
    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public void printTreeNode(TreeNode node){
        System.out.println("val : " + node.getVal() + " " +
                            "Left Val: "+ node.getLeft().getVal() + " " +
                            "Right Val: "+ node.getRight().getVal());
    }
}