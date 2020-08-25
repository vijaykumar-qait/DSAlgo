package CodingNinja.Trees;

import java.util.LinkedList;
import java.util.List;

public class PostOrderTraversal {
    /**
     * Postorder Binary Tree
     * Send Feedback
     * Given a binary tree, print the postorder traversal of given tree.
     * Post-order traversal is: LeftChild RightChild Root
     * Input format :
     * Elements in level order form (separated by space)
     * (If any node does not have left or right child, take -1 in its place)
     * Output Format :
     * Post-order traversal, elements separated by space
     * Sample Input :
     * 8 3 10 1 6 -1 14 -1 -1 4 7 13 -1 -1 -1 -1 -1 -1 -1
     * Sample Output :
     * 1 4 7 6 3 13 14 10 8
     */
    public static void postOrder(BinaryTreeNode<Integer> root) {
        if(root == null){
            return;
        }
        if(root.leftChild != null){
            postOrder(root.leftChild);
        }
        if(root.rightChild != null){
            postOrder(root.rightChild);
        }
        System.out.print(root.data + " ");

    }
    public static void main(String [] args){
        List<Integer> list = new LinkedList<>();
        list.add(1);
    }
}
