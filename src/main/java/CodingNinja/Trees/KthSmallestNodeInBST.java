package CodingNinja.Trees;

public class KthSmallestNodeInBST {
    /**
     * Kth smallest node in BST
     * Send Feedback
     * Given a BST and an integer K, you need to find the Kth smallest element present in the BST.
     * Return INT_MIN if that is not present in the BST.
     * Input format :
     * Line 1: Elements in level order form (separated by space)
     * (If any node does not have left or right child, take -1 in its place)
     * Output Format:
     * Line 1: Kth smallest node
     * Sample Input :
     * 8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1
     * 3
     * Sample Output :
     * 6
     */

    static int count = 0;

    public static BinaryTreeNode<Integer> kthSmallest(BinaryTreeNode<Integer> root, int k){
        if(root == null){
            return null;
        }

        BinaryTreeNode<Integer> left = kthSmallest(root.leftChild, k);

        if(left != null){
            return left;
        }

        count++;
        if(count == k){
            return root;
        }
        return kthSmallest(root.rightChild, k);
    }

    public static int kthSmallestNode(BinaryTreeNode<Integer> root,int K){
        // Write your code here
        count = 0;

        BinaryTreeNode<Integer> res = kthSmallest(root, K);
        if (res == null)
            return Integer.MIN_VALUE;
        else
            return res.data;
    }

    public static void main(String [] args){
        BinaryTreeNode<Integer> root = BinaryTreeUsage.takeInputLevelWise();
        int k = 3;
        System.out.println();
        System.out.println(kthSmallestNode(root, k));

    }
}
