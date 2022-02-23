package binaryTreePractice;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        // creating a tree
        TreeNode root = new TreeNode(6,
                                    new TreeNode(8,
                                                    new TreeNode(3),
                                                    new TreeNode(2,
                                                                new TreeNode(1),
                                                                new TreeNode(0))
                                    ), new TreeNode(9, null, new TreeNode(10, new TreeNode(11), null)));
        // pre-order traversal
        List<Integer> preOrderedList = PreOrderTraversal.preorderTraversal(root);
        // post-order traversal
        List<Integer> postOrderedList = PostOrderTraversal.postorderTraversal(root);
        // in-order traversal
        List<Integer> inOrderedList = InOrderTraversal.inorderTraversal(root);

        for (int i=0; i<inOrderedList.size(); i++){
            System.out.println(inOrderedList.get(i));
        }

    }
}
