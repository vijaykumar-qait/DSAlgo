package CodingNinja.Trees;

public class PathSumRootToLeaf {
    /**
     * Path Sum Root to Leaf
     * Send Feedback
     * Given a binary tree and a number k, print out all root to leaf paths where the sum of all nodes value is same as the given number k.
     * Input format :
     *
     * Line 1 : Elements in level order form (separated by space)
     *
     * (If any node does not have left or right child, take -1 in its place)
     *
     * Line 2 : k
     *
     * Output format : Print each path in new line, elements separated by space
     *
     * Sample Input 1 :
     * 5 6 7 2 3 -1 1 -1 -1 -1 9 -1 -1 -1 -1
     * 13
     * Sample Output 1 :
     * 5 6 2
     * 5 7 1
     */

    private static void helperFunc(BinaryTreeNode<Integer> root, int k, String str){
        if(root == null || k<0){
            return;
        }

        if(k - root.data == 0 && root.leftChild == null && root.rightChild == null){
            System.out.println(str + root.data);
        }
        String newStr = str + root.data + " ";
        helperFunc(root.leftChild, k-root.data, newStr);
        helperFunc(root.rightChild, k-root.data, newStr);
    }

    public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
        helperFunc(root, k, "");
    }

    public static void main(String [] args){
        BinaryTreeNode<Integer> root = BinaryTreeUsage.takeInputLevelWise();
        int k = 13;
        System.out.println();
        rootToLeafPathsSumToK(root, k);
    }
}
