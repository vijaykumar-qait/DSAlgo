package CodingNinja.Trees;

import java.util.ArrayList;

public class FindPathInBST {
    /**
     * Find Path in BST
     * Send Feedback
     * Given a BST and an integer k. Find and return the path from the node with data k and root
     * (if a node with data k is present in given BST). Return null otherwise.
     * Assume that BST contains all unique elements.
     * Input Format :
     * Line 1 : Elements in level order form (separated by space)
     * (If any node does not have left or right child, take -1 in its place)
     * Line 2 : Integer k
     * Output Format :
     * Path from node k to root
     * Sample Input :
     * 8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1
     * 2
     * Sample Output :
     * 2
     * 5
     * 8
     */
    public static ArrayList<Integer> findPath(BinaryTreeNode<Integer> root, int data){
        if(root == null){
            return null;
        }

        if(root.data == data){
            ArrayList<Integer> output = new ArrayList<>();
            output.add(root.data);
            return output;
        }
        ArrayList<Integer> leftOutput = null;
        if(root.data > data){
            leftOutput = findPath(root.leftChild, data);
        }
        if(leftOutput != null){
            leftOutput.add(root.data);
            return leftOutput;
        }

        ArrayList<Integer> rightOutput = null;
        if(root.data < data){
            rightOutput = findPath(root.rightChild, data);
        }
        if(rightOutput != null){
            rightOutput.add(root.data);
            return rightOutput;
        }
        else {
            return null;
        }
    }

    public static void main(String [] args){
        BinaryTreeNode<Integer> root = BinaryTreeUsage.takeInputLevelWise();
        int data = 2;
        System.out.println();
        System.out.println(findPath(root, data).toString());
    }
}
