package binaryTreePractice;

import java.util.ArrayList;
import java.util.List;


public class PostOrderTraversal {
    static List<Integer> postOrderList = new ArrayList<>();

    // creating a static method to make it available to the main method without instantiating this class
    // left-right-root
    static public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) {
            return postOrderList;
        }
        if (root.getLeft() != null) {
            postorderTraversal(root.getLeft());
        }

        if (root.getRight() != null) {
            postorderTraversal(root.getRight());
        }
        postOrderList.add(root.getVal());
        return postOrderList;
    }


}
