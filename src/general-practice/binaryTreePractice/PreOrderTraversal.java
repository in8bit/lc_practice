package binaryTreePractice;

import java.util.ArrayList;
import java.util.List;

public class PreOrderTraversal {
    static List<Integer> preOrderList = new ArrayList<>();

    // creating a static method to make it available to the main method without instantiating this class
    // root-left-right
    static public List<Integer> preorderTraversal(TreeNode root) {

        //if null return
        if (root == null) {
            return preOrderList;
        }
        // add the root value to the list
        preOrderList.add(root.getVal());

        //traverse left first
        if (root.getLeft() != null) {
            preorderTraversal(root.getLeft());
        }

        //traverse right then
        if (root.getRight() != null) {
            preorderTraversal(root.getRight());
        }

        return preOrderList;
    }
}
