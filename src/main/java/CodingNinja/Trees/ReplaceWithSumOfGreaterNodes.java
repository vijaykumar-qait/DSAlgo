package CodingNinja.Trees;

public class ReplaceWithSumOfGreaterNodes {
    /**
     * Replace with Sum of greater nodes
     * Send Feedback
     * Given a binary search tree, replace each nodes' data with the sum of all nodes' which are greater or equal than it.
     * You need to include the current node's data also.
     * That is, if in given BST there is a node with data 5, you need to replace it with sum of its data (i.e. 5) and
     * all nodes whose data is greater than or equal to 5.
     * You don't need to return or print, just change the data of each node.
     * Input format :
     *
     * Line 1 : Elements in level order form (separated by space)
     *
     * (If any node does not have left or right child, take -1 in its place)
     *
     * Output format : Elements are printed in level order wise, every level in new line
     *
     * Sample Input 1 :
     * 8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1
     * Sample Output 1 :
     * 18
     * 36 10
     * 38 31
     * 25
     */

    /*private static int replaceFunction(BinaryTreeNode<Integer> root, int sum){
        if(root == null){
            return 0;
        }

        int rightSum = replaceFunction(root.rightChild, sum);
        int rightSumPlusRoot = rightSum + root.data;
        root.data = root.data + rightSum;
        int leftSum = replaceFunction(root.leftChild, rightSumPlusRoot);
        return rightSum + leftSum;
    }

    public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {
        replaceFunction(root, 0);
    }*/



    public static void main(String [] args){
        BinaryTreeNode<Integer> root = BinaryTreeUsage.takeInputLevelWise();

    }
}
