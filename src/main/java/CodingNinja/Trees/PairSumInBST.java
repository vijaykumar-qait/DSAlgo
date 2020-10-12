package CodingNinja.Trees;

import java.util.LinkedList;
import java.util.Stack;

public class PairSumInBST {

    /**
     *Pair sum in a BST
     * Send Feedback
     * Given a binary search tree and an integer S, find pair of nodes in the BST which sum to S
     * . You can use extra space only O(log n).
     * Assume BST contains all unique elements.
     * Note: In a pair, print the smaller element first.
     * Input format:
     *
     * Line 1: Elements in the level order form (separated by space)
     *
     * (If any node does not have left or right child, take -1 in its place)
     *
     * Line 2: S
     *
     * Output format: Each pair in a different line (pair elements separated by space)
     *
     * Sample Input :
     * 8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1
     * 12
     * Sample Output
     * 2 10
     * 5 7
     */

    public static void printNodesSumToS(BinaryTreeNode<Integer> root, int s) {
        Stack<BinaryTreeNode<Integer>> inoder = new Stack<>();
        Stack<BinaryTreeNode<Integer>> reverseInorder = new Stack<>();


        boolean done1 = false, done2 = false;
        int val1 = 0, val2 = 0;
        BinaryTreeNode<Integer> inorderTree = root;
        BinaryTreeNode<Integer> reverseInorderTree = root;

        // The loop will break when we either find a pair or one of the two
        // traversals is complete
        while (true) {
            // Find next node in normal Inorder
            // traversal. See following post
            // https:// www.geeksforgeeks.org/inorder-tree-traversal-without-recursion/
            while (done1 == false) {
                if (inorderTree != null) {
                    inoder.push(inorderTree);
                    inorderTree = inorderTree.leftChild;
                }
                else {
                    if (inoder.isEmpty())
                        done1 = true;
                    else {
                        inorderTree = inoder.pop();
                        val1 = inorderTree.data;
                        inorderTree = inorderTree.rightChild;
                        done1 = true;
                    }
                }
            }

            // Find next node in REVERSE Inorder traversal. The only
            // difference between above and below loop is, in below loop
            // right subtree is traversed before left subtree
            while (done2 == false) {
                if (reverseInorderTree != null) {
                    reverseInorder.push(reverseInorderTree);
                    reverseInorderTree = reverseInorderTree.rightChild;
                }
                else {
                    if (reverseInorder.isEmpty())
                        done2 = true;
                    else {
                        reverseInorderTree = reverseInorder.pop();
                        val2 = reverseInorderTree.data;
                        reverseInorderTree = reverseInorderTree.leftChild;
                        done2 = true;
                    }
                }
            }

            // If we find a pair, then print the pair and return. The first
            // condition makes sure that two same values are not added
            if ((val1 != val2) && (val1 + val2) == s) {
                System.out.println(val1 + " " + val2);
                return;
            }

            // If sum of current values is smaller,
            // then move to next node in
            // normal inorder traversal
            else if ((val1 + val2) < s)
                done1 = false;

                // If sum of current values is greater,
                // then move to next node in
                // reverse inorder traversal
            else if ((val1 + val2) > s)
                done2 = false;

            // If any of the inorder traversals is
            // over, then there is no pair
            // so return false
            if (val1 >= val2)
                break;
        }

    }

    public static void main(String [] args){
        BinaryTreeNode<Integer> root = BinaryTreeUsage.takeInputLevelWise();
        int sum = 12;
        printNodesSumToS(root, sum);
    }
}
