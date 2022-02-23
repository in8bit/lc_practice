package binaryTreePractice;

import java.util.ArrayList;
import java.util.List;

public class InOrderTraversal {
    static List<Integer> inorderList = new ArrayList<>();
    // static to not need instantiation of the class
    // left-root-right
    static public List<Integer> inorderTraversal(TreeNode root) {

        if (root == null) {
            return inorderList;
        }

        if (root.getLeft() != null) {
            inorderTraversal(root.getLeft());
        }
        inorderList.add(root.getVal());
        if (root.getRight() != null) {
            inorderTraversal(root.getRight());
        }
        return inorderList;
    }
}
