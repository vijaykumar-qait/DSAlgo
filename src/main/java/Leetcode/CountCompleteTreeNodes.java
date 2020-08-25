package Leetcode;

public class CountCompleteTreeNodes {
    /**
     * 222. Count Complete Tree Nodes
     * Medium
     *
     * 2279
     *
     * 215
     *
     * Add to List
     *
     * Share
     * Given a complete binary tree, count the number of nodes.
     *
     * Note:
     *
     * Definition of a complete binary tree from Wikipedia:
     * In a complete binary tree every level, except possibly the last, is completely filled, and all nodes in the last level are as far left as possible. It can have between 1 and 2h nodes inclusive at the last level h.
     *
     * Example:
     *
     * Input:
     *     1
     *    / \
     *   2   3
     *  / \  /
     * 4  5 6
     *
     * Output: 6
     */

    public int countNodes(TreeNode root) {
        if(root == null){
            return 0;
        }

        int sum = 1;
        if(root.left != null){
            sum += countNodes(root.left);
        }
        if(root.right != null){
            sum += countNodes(root.right);
        }
        return sum;
    }
}
