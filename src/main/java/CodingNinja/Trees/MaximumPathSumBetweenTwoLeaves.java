package CodingNinja.Trees;

class Res {
    int val;
}

public class MaximumPathSumBetweenTwoLeaves {
    /**
     * Maximum Path Sum Between Two Leaves
     * Send Feedback
     * Given a binary tree of N nodes, find and return the maximum sum path between two leaves of the given tree.
     * Given binary tree contains positive values only.
     * Note: If there is only one leaf in the tree, then return 0 as answer.
     * Input format :
     * Line 1 : Nodes in level order form (separated by space). If any node does not have left or right child, take -1 in its place
     * Output format :
     * Maximum sum path between two leaves
     * Constraints :
     * 1 <= N <= 10^5
     * Sample Input :
     * 10 9 4 3 1 5 8 -1 -1 -1 -1 -1 6 -1 -1 3 -1 -1 -1
     * Sample Output :
     * 40
     */

//    private static long maxSum(BinaryTreeNode<Integer> root){
//        if(root == null){
//            return 0;
//        }
//        long lSum = maxSum(root.leftChild);
//        long rSum = maxSum(root.rightChild);
//        return root.data + Math.max(lSum, rSum);
//    }
//
//    public static long maximumSumLeafPath(BinaryTreeNode<Integer> root) {
//        if(root == null){
//            return 0;
//        }
//        long opt1 = maxSum((root.leftChild)) + maxSum(root.rightChild);
//        long opt2 = maximumSumLeafPath(root.leftChild);
//        long opt3 = maximumSumLeafPath(root.rightChild);
//        return Math.max(opt1, Math.max(opt2,opt3));
//    }

    static int maxPathSumUtil(BinaryTreeNode<Integer> node, Res res) {

        // Base cases
        if (node == null)
            return 0;
        if (node.leftChild == null && node.rightChild == null)
            return node.data;

        // Find maximum sum in left and right subtree. Also
        // find maximum root to leaf sums in left and right
        // subtrees and store them in ls and rs
        int ls = maxPathSumUtil(node.leftChild, res);
        int rs = maxPathSumUtil(node.rightChild, res);

        // If both left and right children exist
        if (node.leftChild != null && node.rightChild != null) {

            // Update result if needed
            res.val = Math.max(res.val, ls + rs + node.data);

            // Return maxium possible value for root being
            // on one side
            return Math.max(ls, rs) + node.data;
        }

        // If any of the two children is empty, return
        // root sum for root being on one side
        return (node.leftChild == null) ? rs + node.data
                : ls + node.data;
    }

    // The main function which returns sum of the maximum
    // sum path between two leaves. This function mainly
    // uses maxPathSumUtil()
    long maxPathSum(BinaryTreeNode<Integer> root)
    {
        Res res = new Res();
        res.val = Integer.MIN_VALUE;
        maxPathSumUtil(root, res);
        return res.val;
    }

    public static long maximumSumLeafPath(BinaryTreeNode<Integer> root) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        Res res = new Res();
        res.val = Integer.MIN_VALUE;
        maxPathSumUtil(root, res);
        return res.val;
    }

    public static void main(String [] args){
        BinaryTreeNode<Integer> root = BinaryTreeUsage.takeInputLevelWise();
        System.out.println();
        System.out.println(maximumSumLeafPath(root));
    }
}
