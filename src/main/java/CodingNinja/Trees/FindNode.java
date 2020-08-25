package CodingNinja.Trees;

import org.omg.CORBA.INTERNAL;

public class FindNode {
    /**
     * Find Node
     * Send Feedback
     * Given a binary tree and an integer x, check if node with data x is present in the input binary tree or not.
     * Return true or false.
     * Input format :
     * Line 1 : Elements in level order form (separated by space)
     * (If any node does not have left or right child, take -1 in its place)
     * Line 2 : Integer x
     * Output Format :
     * true or false
     * Sample Input :
     * 8 3 10 1 6 -1 14 -1 -1 4 7 13 -1 -1 -1 -1 -1 -1 -1
     * 7
     * Sample Output :
     * true
     */

    public static boolean isNodePresent(BinaryTreeNode<Integer> root,int x){
        if(root == null){
            return false;
        }

        if(root.data == x){
            return true;
        }

        if(root.leftChild != null){
            if(isNodePresent(root.leftChild, x)){
                return true;
            }
        }

        if(root.rightChild != null){
            if(isNodePresent(root.rightChild, x)){
                return true;
            }
        }
        return false;
    }

    public static void main(String [] args){
        BinaryTreeNode<Integer> root = BinaryTreeUsage.takeInputLevelWise();
        int x = 7;
        System.out.println(isNodePresent(root,x));
    }
}
