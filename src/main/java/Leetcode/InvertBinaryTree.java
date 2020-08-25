package Leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return root;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode front = queue.poll();
            TreeNode temp = front.left;
            front.left = front.right;
            front.right = temp;
            if(front.left != null){
                queue.add(front.left);
            }
            if(front.right != null){
                queue.add(front.right);
            }
        }
        return root;
    }
}
