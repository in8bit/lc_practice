package binaryTreePractice;

public class MaximumDepthOfATree {
    int treeDepth = -1;
    public int maxDepth(TreeNode root) {
        if (root == null){
            treeDepth =0;
            return treeDepth;
        }
        if (root.getLeft() == null && root.getRight() ==null){
            treeDepth =1;
            return treeDepth;
        }
        treeDepth = getDepth(root, 1);
        return treeDepth;
    }
    public int getDepth(TreeNode root, int depth){
        int answer = -1;


        return answer;
    }

}
