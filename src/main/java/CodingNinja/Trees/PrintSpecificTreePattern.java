package CodingNinja.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class PrintSpecificTreePattern {
    /**
     *Print Specific Tree Pattern
     * Send Feedback
     * Given a "complete" binary tree , print the following pattern using its all nodes.
     * root element
     * first element of second level
     * last element of  of second level
     * first element of the of the third level
     * last element of the third level
     * second element of the third level
     * second from last element of the third level
     * ..... So on.
     * Example :
     * For tree :
     * Alt text
     *
     * The pattern should be:
     * 1 2 3 4 7 5 6 8 15 9 14 10 13 11 12
     * Input Format
     * Line 1: Nodes in level order form (separated by space). If any node does not have left or right child, take -1 in its place
     * Output Format
     * Required pattern
     * Constraint
     * Given binary tree is complete
     * 1 <= Number of Nodes <= 10^6
     * 1 <= value of each node <= 10^8
     * Sample Input 1
     * 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1
     * Sample Output 1
     * 1 2 3 4 7 5 6 8 15 9 14 10 13 11 12
     */

    static void printSpecificPattern(BinaryTreeNode<Integer> node)
    {
        if (node == null)
            return;

        // Let us print root and next level first
        System.out.print(node.data);

        //  Since it is perfect Binary Tree, right is not checked
        if (node.leftChild != null)
            System.out.print(" " + node.leftChild.data + " " + node.rightChild.data);

        // Do anything more if there are nodes at next level in
        // given perfect Binary Tree
        if (node.leftChild.leftChild == null)
            return;

        // Create a queue and enqueue left and right children of root
        Queue<BinaryTreeNode<Integer>> q = new LinkedList<>();
        q.add(node.leftChild);
        q.add(node.rightChild);

        // We process two nodes at a time, so we need two variables
        // to store two front items of queue
        BinaryTreeNode<Integer> first = null, second = null;

        // traversal loop
        while (!q.isEmpty())
        {
            // Pop two items from queue
            first = q.peek();
            q.poll();
            second = q.peek();
            q.poll();

            // Print children of first and second in reverse order
            System.out.print(" " + first.leftChild.data + " " +second.rightChild.data);
            System.out.print(" " + first.rightChild.data + " " +second.leftChild.data);

            // If first and second have grandchildren, enqueue them
            // in reverse order
            if (first.leftChild != null)
            {
                q.add(first.leftChild);
                q.add(second.rightChild);
                q.add(first.rightChild);
                q.add(second.leftChild);
            }
        }
    }

    public static void main(String [] args){
        BinaryTreeNode<Integer> root = BinaryTreeUsage.takeInputLevelWise();
        printSpecificPattern(root);
    }
}
