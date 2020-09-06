package CodingNinja.Trees;

public class DepthofBinaryTree {
    /**
     * Depth of Binary Tree
     * Send Feedback
     * A rooted binary tree is called “nice”, if every node is either a leaf, or has exactly two children.
     * For example, the following tree is nice,
     *                            n
     *                          /   \
     *                         l     n
     *                              / \
     *                             n   l
     *                            / \
     *                           l   l
     * and the following tree is not,
     *                           n
     *                          / \
     *                        n     n
     *                       /
     *                      l
     * The leaves of a nice binary tree are labeled by the letter ‘l’, and other nodes are labeled by the letter ‘n’.
     * Given the pre-order traversal of a nice binary tree as a string, you are required to find the depth of the tree.
     * Output one line for each test case, containing a single integer, the depth of tree.
     * Sample Input 1:
     *                 nlnll
     * Sample Output 1:
     *                 2
     * Sample Input 2:
     *                 nll
     * Sample Output 2:
     *                 1
     */

    static int findDepthRec(String tree, int n, int index) {
        if (index >= n ||
                tree.charAt(index) == 'l')
            return 0;

        // calc height of left subtree
        // (In preorder left subtree
        // is processed before right)
        index++;
        int left = findDepthRec(tree,
                n, index);

        // calc height of
        // right subtree
        index++;
        int right = findDepthRec(tree, n, index);

        return Math.max(left, right) + 1;
    }

    // Wrapper over findDepthRec()
    static int findDepth(String tree, int n) {
        int index = 0;
        return (findDepthRec(tree,
                n, index));
    }

    public static int depth(String str) {
        //Write your code here
        return findDepth(str, str.length());

    }

    public static void main(String [] args){
        String str = "nlnll";
        System.out.println(depth(str));
    }

}
