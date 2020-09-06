package CodingNinja.Trees;

public class BoundaryTraversal {
    /**
     * Boundary Traversal
     * Send Feedback
     * Given a binary tree having N nodes, print its boundary traversal.
     * Input format :
     * Line 1 : Nodes in level order form (separated by space). If any node does not have left or right child, take -1 in its place
     * Output format :
     * Boundary traversal (separated by space)
     * Constraints :
     * 1 <= N <= 10^5
     * Sample Input 1 :
     * 1 2 3 -1 -1 -1 -1
     * Sample Output 1 :
     * 1 2 3
     * Sample Input 2 :
     * 1 2 3 4 5 7 -1 -1 -1 6 -1 -1 8 -1 -1 -1 -1
     * Sample Output 2 :
     * 1 2 4 6 8 7 3
     */

    private static void printLeaves(BinaryTreeNode<Integer> root){
        if(root == null){
            return;
        }
        printLeaves(root.leftChild);
        if(root.leftChild == null && root.rightChild == null){
            System.out.print(root.data + " ");
        }
        printLeaves(root.rightChild);
    }

    private static void printBorderLeft(BinaryTreeNode<Integer> root){
        if(root == null){
            return;
        }
        if(root.leftChild != null){
            System.out.print(root.data + " ");
            printBorderLeft(root.leftChild);
        }
        else if(root.rightChild != null){
            System.out.println(root.data +  " ");
            printBorderLeft(root.rightChild);
        }
    }

    private static void printBorderRight(BinaryTreeNode<Integer> root){
        if(root == null){
            return;
        }
        if(root.rightChild != null){
            printBorderRight(root.rightChild);
            System.out.print(root.data + "");
        }
        else if(root.leftChild != null){
            printBorderRight(root.leftChild);
            System.out.print(root.data);
        }
    }

    public static void solve(BinaryTreeNode<Integer> root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        printBorderLeft(root.leftChild);
        printLeaves(root.leftChild);
        printLeaves(root.rightChild);
        printBorderRight(root.rightChild);
    }

    public static void main(String [] args){
        BinaryTreeNode<Integer> root = BinaryTreeUsage.takeInputLevelWise();
        System.out.println();
        solve(root);
    }
}
