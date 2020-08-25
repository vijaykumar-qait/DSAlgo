package CodingNinja.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class MirrorTreeIterative {
    /**
     * Mirror a Binary Tree
     * Send Feedback
     * Mirror the given binary tree. That is, right child of every nodes should become left and
     * left should become right.
     * Alt text
     *
     * Note : You don't need to print or return the tree, just mirror it.
     * Input format :
     *
     * Line 1 : Elements in level order form (separated by space)
     *
     * (If any node does not have left or right child, take -1 in its place)
     *
     * Output format : Elements in level order form (Every level in new line)
     *
     * Sample Input 1:
     * 1 2 3 4 5 6 7 -1 -1 -1 -1 -1 -1 -1 -1
     * Sample Output 1:
     * 1
     * 3 2
     * 7 6 5 4
     * Sample Input 2:
     * 5 10 6 2 3 -1 -1 -1 -1 -1 9 -1 -1
     * Sample Output 2:
     * 5
     * 6 10
     * 3 2
     * 9
     */
    public static void mirror(BinaryTreeNode<Integer> root){
        if(root == null){
            return;
        }
        Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            BinaryTreeNode<Integer> front = queue.poll();
            BinaryTreeNode<Integer> temp = front.leftChild;
            front.leftChild = front.rightChild;
            front.rightChild = temp;

            if(front.leftChild != null){
                queue.add(front.leftChild);
            }
            if(front.rightChild != null){
                queue.add(front.rightChild);
            }
        }

        BinaryTreeUsage.printLevelWise(root);
    }

    public static void main(String [] args){
        BinaryTreeNode<Integer> root = BinaryTreeUsage.takeInputLevelWise();
        mirror(root);
    }
}
