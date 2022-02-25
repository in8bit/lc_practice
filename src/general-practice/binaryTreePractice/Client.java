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

        TreeNode root2 = new TreeNode(1, null, new TreeNode(2));
        TreeNode root3 = new TreeNode(1,
                                    new TreeNode(2,
                                            new TreeNode(3),
                                            new TreeNode(4)),
                                    new TreeNode(2,
                                            new TreeNode(4),
                                            new TreeNode(3)));
//
//        // pre-order traversal
//        List<Integer> preOrderedList = PreOrderTraversal.preorderTraversal(root);
//        // post-order traversal
//        List<Integer> postOrderedList = PostOrderTraversal.postorderTraversal(root);
//        // in-order traversal
//        List<Integer> inOrderedList = InOrderTraversal.inorderTraversal(root);
//        // level order traversal
//        List<List<Integer>> levelOrderTraversalList = LevelOrderTraversal.levelOrder(root);
//
        TreeMisc treeMisc = new TreeMisc();
//        // Maximum depth of a tree
//        int ans = treeMisc.maxDepth(root2);
//        System.out.println(ans);

//        // isSymmetric
//        boolean ans = treeMisc.isSymmetric(root3);
//        System.out.println(ans);
    }
}
