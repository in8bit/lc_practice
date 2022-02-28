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

        TreeNode root4 = new TreeNode(5,
                                        new TreeNode(4,
                                                new TreeNode(11,
                                                        new TreeNode(7),
                                                        new TreeNode(2)),
                                                null),
                                        new TreeNode(8,
                                                new TreeNode(13),
                                                new TreeNode(4,
                                                        null,
                                                        new TreeNode(1))));
        TreeNode root5 = new TreeNode(1,
                new TreeNode(-2,
                        new TreeNode(1,
                                new TreeNode(-1),
                                null),
                        new TreeNode(3)),
                new TreeNode(-3,
                        new TreeNode(-2),
                        null));

        TreeNode root6 = new TreeNode(5,
                new TreeNode(1,
                        new TreeNode(5),
                        new TreeNode(5)),
                new TreeNode(5,
                        null,
                        new TreeNode(5)));
        TreeNode root7 = new TreeNode(5,
                new TreeNode(5,
                        new TreeNode(5),
                        new TreeNode(5)),
                new TreeNode(5,
                        null,
                        new TreeNode(5)));
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

          // hasPathSum
//        boolean hasPathSum = treeMisc.hasPathSum(root4, 22);
//        System.out.println(hasPathSum);

          //univalue subtree count
        int ans = treeMisc.countUnivalSubtrees(root7);
        System.out.println(ans);

    }
}
