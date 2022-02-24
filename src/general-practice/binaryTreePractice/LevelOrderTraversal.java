package binaryTreePractice;

import javafx.scene.effect.BlendMode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class LevelOrderTraversal {

    static List<List<Integer>> finalAnswer = new ArrayList<>();
    static List<Integer> subAns = new ArrayList<>();

   static public List<List<Integer>> levelOrder(TreeNode root) {

       Queue<TreeNode> queue = new LinkedList<>();

       if (root != null) {
           queue.offer(root); // offer works like add
       }

       TreeNode cur;

       while (!queue.isEmpty()) {

           int size = queue.size();

           for (int i = 0; i < size; ++i) {        // traverse nodes in the same level
               cur = queue.poll(); // poll removes the the value from the front of the queue

               subAns.add(cur.getVal());                // visit the root

               if (cur.getLeft() != null) {
                   queue.offer(cur.getLeft());              // push left child to queue if it is not null
               }

               if (cur.getRight() != null) {
                   queue.offer(cur.getRight());             // push right child to queue if it is not null
               }

           }

           finalAnswer.add(subAns);
       }

    return finalAnswer;
    }
}
