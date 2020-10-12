package CodingNinja.Trees;

class BSTData{
    int min;
    int max;
    boolean isBst;
    int height;
}

public class LargestBST {
    /**
     * Largest BST
     * Send Feedback
     * Given a Binary tree, find the largest BST subtree. That is, you need to find the BST with maximum height in the given binary tree.
     * Return the height of largest BST.
     * Input format :
     *
     * Line 1 : Elements in level order form (separated by space)
     *
     * (If any node does not have left or right child, take -1 in its place)
     *
     * Sample Input 1:
     * 5 10 6 2 3 -1 -1 -1 -1 -1 9 -1 -1
     * Sample Output 1:
     * 2
     */
    static BSTData helperFunction(BinaryTreeNode<Integer> root){
        if(root == null){
            BSTData nodeData = new BSTData();
            nodeData.min = Integer.MAX_VALUE;
            nodeData.max = Integer.MIN_VALUE;
            nodeData.isBst = true;
            nodeData.height = 0;
            return nodeData;
        }

        BSTData left = helperFunction(root.leftChild);
        BSTData right = helperFunction(root.rightChild);

        BSTData largestBst = new BSTData();
        largestBst.min = Math.min(root.data, Math.min(left.min, right.min));
        largestBst.max = Math.max(root.data, Math.max(left.max, right.max));

        largestBst.isBst = left.isBst && right.isBst && (root.data > left.max) && (root.data< right.min);

        if(largestBst.isBst){
            largestBst.height = 1 + Math.max(left.height, right.height);
        }
        else {
            largestBst.height = Math.max(left.height, right.height);
        }
        return largestBst;
    }

    public static int largestBSTSubtree(BinaryTreeNode<Integer> root) {
        // Write your code here
        BSTData largestBst = helperFunction(root);
        return largestBst.height;
    }

    public static void main(String [] args){
        BinaryTreeNode<Integer> root = BinaryTreeUsage.takeInputLevelWise();
        System.out.println();
        System.out.println(largestBSTSubtree(root));
    }

}
