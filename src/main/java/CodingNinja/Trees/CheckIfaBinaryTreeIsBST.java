package CodingNinja.Trees;

public class CheckIfaBinaryTreeIsBST {
    /**
     * Check if a Binary Tree is BST
     * Send Feedback
     * Given a binary tree with N number of nodes, check if that input tree is BST (Binary Search Tree) or not. If yes, return true, return false otherwise.
     * Duplicate elements should be in right subtree.
     * Input format :
     * Line 1 : Nodes in level order form (separated by space). If any node does not have left or right child, take -1 in its place
     * Output format :
     * true or false
     * Constraints :
     * 1 <= N <= 10^5
     * Sample Input 1 :
     * 3 1 5 -1 2 -1 -1 -1 -1
     * Sample Output 1 :
     * true
     * Sample Input 2 :
     * 5 2 10 0 1 -1 15 -1 -1 -1 -1 -1 -1
     * Sample Output 2 :
     * false
     */

    private static int maximun(BinaryTreeNode<Integer> root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        int opt1 = root.data;
        int opt2 = maximun((root.leftChild));
        int opt3 = maximun((root.rightChild));
        return Math.max(opt1, Math.max(opt2, opt3));
    }

    private static int minimum(BinaryTreeNode<Integer> root){
        if(root == null){
            return Integer.MAX_VALUE;
        }
        int opt1 = root.data;
        int opt2 = minimum(root.leftChild);
        int opt3 = minimum(root.rightChild);
        return Math.min(opt1, Math.min(opt2, opt3));
    }

    public static boolean isBST(BinaryTreeNode<Integer> root) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        if(root == null){
            return true;
        }

        int leftMax = maximun(root.leftChild);
        int rightMin = minimum(root.rightChild);

        if(root.data <leftMax){
            return false;
        }

        if(root.data > rightMin){
            return false;
        }

        boolean isleftBST = isBST(root.leftChild);
        boolean isRightBST = isBST(root.rightChild);

        if(isleftBST && isRightBST){
            return true;
        }
        else {
            return false;
        }

    }

    public static void main(String [] args){
        BinaryTreeNode<Integer> root = BinaryTreeUsage.takeInputLevelWise();
        System.out.println();
        System.out.println(isBST(root));
    }
}
