package CodingNinja.Trees;

import org.omg.CORBA.INTERNAL;

class Pair<K, V>{
    K first;
    V second;
}

public class IsBSTImproved {
    /**
     * Check if a Binary Tree is BST
     * Send Feedback
     * Given a binary tree with N number of nodes, check if that input tree is BST (Binary Search Tree) or not. If yes, return true, return false otherwise.
     * Duplicate elements should be in right subtree.
     * Input format :
     * Line 1 : Nodes in level order form (separated by space). If any node does not have left or right child, take -1 in its place
     * Output format :
     * true or false
     * Constraints :
     * 1 <= N <= 10^5
     * Sample Input 1 :
     * 3 1 5 -1 2 -1 -1 -1 -1
     * Sample Output 1 :
     * true
     * Sample Input 2 :
     * 5 2 10 0 1 -1 15 -1 -1 -1 -1 -1 -1
     * Sample Output 2 :
     * false
     */

    public static Pair<Boolean, Pair<Integer, Integer>> isBSTHelper(BinaryTreeNode<Integer> root) {
        if(root == null){
            Pair<Boolean, Pair<Integer, Integer>> output = new Pair<>();
            output.first = true;
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            Pair<Integer, Integer> second = new Pair<>();
            second.first = min;
            second.second = max;
            output.second = second;
            return output;
        }

        Pair<Boolean, Pair<Integer, Integer>> leftOutput = isBSTHelper(root.leftChild);
        Pair<Boolean, Pair<Integer, Integer>> rightOutput = isBSTHelper(root.rightChild);

        int min = Math.min(root.data, Math.min(leftOutput.second.first, rightOutput.second.first));
        int max = Math.max(root.data, Math.max(leftOutput.second.second, rightOutput.second.second));

        boolean isBST = (root.data > leftOutput.second.second) && (root.data <= rightOutput.second.first)
                        && (leftOutput.first) && (rightOutput.first);

        Pair<Boolean, Pair<Integer, Integer>> output = new Pair<>();
        output.first = isBST;
        Pair<Integer, Integer> second = new Pair<>();
        second.first = min;
        second.second = max;
        output.second = second;
        return output;
    }

    public static boolean isBST(BinaryTreeNode<Integer> root) {
        return isBSTHelper(root).first;
    }

    public static void main(String args[]){
        BinaryTreeNode<Integer> root = BinaryTreeUsage.takeInputLevelWise();
        System.out.println();
        System.out.println(isBST(root));
    }
}
