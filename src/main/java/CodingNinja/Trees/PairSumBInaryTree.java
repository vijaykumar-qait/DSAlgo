package CodingNinja.Trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class PairSumBInaryTree {
    /**
     * Pair sum BInary Tree
     * Send Feedback
     * Given a binary tree and an integer S, print all the pair of nodes whose sum equals S.
     * Assume binary tree contains all unique elements.
     * Note : In a pair, print the smaller element first. Order of different pair doesn't matter.
     * Input format :
     * Line 1 : Elements in level order form (separated by space)
     * (If any node does not have left or right child, take -1 in its place)
     * Line 2 : Integer S
     * Output Format :
     * Each pair in different line (pair elements separated by space)
     * Constraints :
     * 1 <= N <= 1000
     * Sample Input 1:
     * 5 10 6 2 3 -1 -1 -1 -1 -1 9 -1 -1
     * 15
     * Sample Output 1:
     * 5 10
     * 6 9
     */

    public static void nodesSumToS(BinaryTreeNode<Integer> root, int sum) {
        // Write your code here
        if(root == null){
            return;
        }
        Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);
        ArrayList<Integer> list = new ArrayList<>();

        while(!queue.isEmpty()){
            BinaryTreeNode<Integer> front = queue.poll();
            list.add(front.data);
            if(front.leftChild != null){
                queue.add(front.leftChild);
            }
            if(front.rightChild != null){
                queue.add(front.rightChild);
            }
        }

        Collections.sort(list);
        for(int i=0, j=list.size()-1; i<j; ){
            if(list.get(i) + list.get(j) > sum){
                j--;
            }
            else if(list.get(i)+list.get(j) < sum){
                i++;
            }
            else{
                System.out.println(list.get(i) + " " + list.get(j));
                i++;
                j--;
            }
        }
    }

    public static void main(String [] args){
        BinaryTreeNode<Integer> root = BinaryTreeUsage.takeInputLevelWise();
        int data = 15;
        nodesSumToS(root,data);
    }
}
