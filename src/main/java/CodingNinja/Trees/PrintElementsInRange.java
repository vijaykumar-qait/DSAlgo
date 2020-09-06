package CodingNinja.Trees;

public class PrintElementsInRange {
    /**
     *Code: Print Elements in Range
     * Send Feedback
     * Given a Binary Search Tree and two integers k1 and k2, find and print the elements which are in range k1 and k2 (both inclusive).
     * Print the elements in increasing order.
     * Input format :
     * Line 1 : Elements in level order form (separated by space)
     * (If any node does not have left or right child, take -1 in its place)
     * Line 2 : Two Integers k1 and k2
     * Output Format :
     * Required elements (separated by space)
     * Sample Input :
     * 8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1
     * 6 10
     * Sample Output :
     * 6 7 8 10
     */

    public static void printNodeFromK1ToK2(BinaryTreeNode<Integer> root,int k1,int k2){
        if(root == null){
            return;
        }

        if((root.leftChild != null && root.leftChild.data>=k1) || (root.leftChild != null &&root.leftChild.rightChild != null && root.leftChild.rightChild.data <=k1)){
            printNodeFromK1ToK2(root.leftChild, k1, k2);
        }
        if(root.data >= k1 && root.data<=k2){
            System.out.print(root.data + " ");
        }
        if((root.rightChild != null && root.rightChild.data<=k2) || (root.rightChild != null &&root.rightChild.leftChild != null && root.rightChild.leftChild.data<=k2)){
            printNodeFromK1ToK2(root.rightChild, k1, k2);
        }
    }

    public static void main(String [] args){
        BinaryTreeNode<Integer> root = BinaryTreeUsage.takeInputLevelWise();
        int k1 = 6;
        int k2 = 10;
        System.out.println();
        printNodeFromK1ToK2(root, k1, k2);
    }
}
