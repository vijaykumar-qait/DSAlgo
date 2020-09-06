package CodingNinja.Trees;

import java.util.ArrayList;

public class LongestLeafToRootPath {
    /**
     * Longest Leaf to root path
     * Send Feedback
     * Given a binary tree, return the longest path from leaf to root. Longest means, a path which contain maximum number of nodes from leaf to root.
     * Input format :
     *
     * Elements in level order form (separated by space)
     *
     * (If any node does not have left or right child, take -1 in its place)
     *
     * Line 1 : Binary Tree 1 (separated by space)
     *
     * Sample Input 1 :
     *  5 6 10 2 3 -1 -1 -1 -1 -1 9 -1 -1
     * Sample Output 1 :
     * 9
     * 3
     * 6
     * 5
     */

    public static ArrayList<Integer> longestRootToLeafPath(BinaryTreeNode<Integer> root){
        // Write your code here
        if(root == null){
            return new ArrayList<>();
        }

        ArrayList<Integer> opt1 = new ArrayList<>();
        ArrayList<Integer> opt2 = new ArrayList<>();

        if(root.leftChild != null){
            opt1 = longestRootToLeafPath(root.leftChild);
        }

        if(root.rightChild != null)
        {
            opt2 = longestRootToLeafPath(root.rightChild);
        }

        if(opt1.size() == 0 && opt2.size() == 0){
            opt1.add(root.data);
            return opt1;
        }
        else if(opt1.size() > opt2.size()){
            opt1.add(root.data);
            return opt1;
        }
        else {
            opt2.add(root.data);
            return opt2;
        }
    }

    public static void main(String [] args){
        BinaryTreeNode<Integer> root = BinaryTreeUsage.takeInputLevelWise();
        System.out.println(longestRootToLeafPath(root).toString());
    }
}
