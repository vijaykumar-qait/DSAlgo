package CodingNinja.Trees;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class PrintDiagonal {
    /**
     * Print diagonal
     * Send Feedback
     * Given a binary tree, print all the diagonal elements in a binary tree belonging to same line with slope equal to -1.
     * For eg.
     * Alt text
     *
     * Input format :
     * Elements in level order form (separated by space)
     * (If any node does not have left or right child, take -1 in its place)
     * Output Format :
     * Elements are printed diagonally,(separated by space). Each diagonal level in new line.
     * Sample Input 1:
     * 8 3 10 1 6 -1 14 -1 -1 4 7 13 -1 -1 -1 -1 -1 -1 -1
     * Sample Output 1:
     * 8 10 14
     * 3 6 7 13
     * 1 4
     */

    public static void diagonalPrint(BinaryTreeNode<Integer> root, int d, HashMap<Integer, Vector<Integer>> diagonalPath){
        //base case
        if(root == null){
            return;
        }

        Vector<Integer> k = diagonalPath.get(d);
        if(k==null){
            k = new Vector<>();
            k.add(root.data);
        }
        else {
            k.add(root.data);
        }
        diagonalPath.put(d, k);

        diagonalPrint(root.leftChild, d+1, diagonalPath);
        diagonalPrint(root.rightChild, d, diagonalPath);
    }

    public static void PrintDiagonal(BinaryTreeNode<Integer> root){
        // Write your code here.
        HashMap<Integer,Vector<Integer>> diagonalPrint = new HashMap<>();
        diagonalPrint(root, 0, diagonalPrint);

        System.out.println("Diagonal Traversal of Binnary Tree");
        for (Map.Entry<Integer, Vector<Integer>> entry : diagonalPrint.entrySet())
        {
            Vector<Integer> print = entry.getValue();
            for(int i=0; i<print.size(); i++){
                System.out.print(print.get(i)+ " ");
            }
            System.out.println();
        }
    }

    public static void main(String [] args){
        BinaryTreeNode<Integer> root = BinaryTreeUsage.takeInputLevelWise();
        System.out.println();
        PrintDiagonal(root);
    }
}
