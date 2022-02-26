package binaryTreePractice;

import java.util.ArrayList;

// if there is one and only one node , depth ==1
public class TreeMisc {
    private int treeDepth = -1;
    private int depthCounter = 0;


    public boolean hasPathSum(TreeNode root, int targetSum) {

        if (root == null) {
            return false;
        }
        if (root.getLeft() == null && root.getRight() == null ){
            // leaf node
            if(root.getVal() == targetSum){

                 return true;
            }
        }
        if (root.getLeft() != null){
           if(hasPathSum(root.getLeft(), targetSum - root.getVal())) {
              return true;
           }
        }
        if (root.getRight() != null){
           if(hasPathSum(root.getRight(), targetSum - root.getVal())) {
               return true;
           }
        }
        return false;
    }`

    /*
        if the left sub-tree is a mirror image of right sub-tree -> the binary tree is symmetric
     */
    public boolean isSymmetric(TreeNode root) {
        boolean isSymmetric = false;

        if (root == null) {
            return isSymmetric;
        }

        if (root.getLeft() == null && root.getRight() == null) {
            isSymmetric = true;
            return isSymmetric;
        }

        isSymmetric = isMirror(root.getLeft(), root.getRight());

        return isSymmetric;
    }

    private boolean isMirror(TreeNode node1, TreeNode node2) {
        boolean isSymmetric = false;
        if (node1 == null && node2 == null) {
            return true;
        }

        if (node1 != null && node2 != null && node1.getVal() == node2.getVal()) {
            if (isMirror(node1.getLeft(), node2.getRight())) {
                if (isMirror(node1.getRight(), node2.getLeft())) {
                    isSymmetric = true;
                }
            }
        }
        return isSymmetric;
    }


    /*
        Count maximum depth of a tree recursively
     */
    public int maxDepth(TreeNode root) {
        if (root == null) {
            treeDepth = 0;
            return treeDepth;
        }
        if (root.getLeft() == null && root.getRight() == null) {
            treeDepth = 1;
            return treeDepth;
        }
        treeDepth = getDepth(root, 1);
        return treeDepth;
    }


    /*
        private method to count the depth of the tree recursively
     */
    private int getDepth(TreeNode root, int depth) {
        int answer = depth;

        if (root.getLeft() != null) {
            depthCounter = getDepth(root.getLeft(), depth + 1);
            answer = Math.max(answer, depthCounter);
        }

        if (root.getRight() != null) {
            depthCounter = getDepth(root.getRight(), depth + 1);
            answer = Math.max(answer, depthCounter);
        }
        return answer;
    }

}
