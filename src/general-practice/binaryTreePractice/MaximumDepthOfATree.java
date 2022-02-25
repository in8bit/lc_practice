package binaryTreePractice;

public class MaximumDepthOfATree {
    int treeDepth = -1;
    int count =0;

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

    private int getDepth(TreeNode root, int depth){
        int answer = depth;

        if (root.getLeft() != null){
            count = getDepth(root.getLeft(), depth +1);
            answer = Math.max(answer, count);
        }

        if (root.getRight() !=null){
           count = getDepth(root.getRight(), depth +1);
            answer = Math.max(answer, count);
        }

        return answer;
    }

}
