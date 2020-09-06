package CodingNinja.Trees;

class Index {
    int index;
}

public class BuildTreePostInorder {
    /**
     * Construct Tree from Postorder and Inorder
     * Send Feedback
     * Given Postorder and Inorder traversal of a binary tree, create the binary tree associated with the traversals.You just need to construct the tree and return the root.
     * Note: Assume binary tree contains only unique elements.
     * Input format :
     *
     * Line 1 : n (Total number of nodes in binary tree)
     *
     * Line 2 : Post order traversal
     *
     * Line 3 : Inorder Traversal
     *
     * Output Format :
     *
     * Elements are printed level wise, each level in new line (separated by space).
     *
     * Sample Input :
     * 8
     * 8 4 5 2 6 7 3 1
     * 4 8 2 5 1 6 3 7
     * Sample Output :
     * 1
     * 2 3
     * 4 5 6 7
     * 8
     */

    static int search(int arr[], int strt, int end, int value)
    {
        int i;
        for (i = strt; i <= end; i++) {
            if (arr[i] == value)
                break;
        }
        return i;
    }

    static BinaryTreeNode<Integer> buildUtil(int in[], int post[], int inStrt, int inEnd, Index pIndex) {
        // Base case
        if (inStrt > inEnd)
            return null;

        /* Pick current node from Postrder traversal using
           postIndex and decrement postIndex */
        BinaryTreeNode<Integer> node = new BinaryTreeNode<>(post[pIndex.index]);
        (pIndex.index)--;

        /* If this node has no children then return */
        if (inStrt == inEnd)
            return node;

        /* Else find the index of this node in Inorder
           traversal */
        int iIndex = search(in, inStrt, inEnd, node.data);

        /* Using index in Inorder traversal, construct left and
           right subtress */
        node.rightChild = buildUtil(in, post, iIndex + 1, inEnd, pIndex);
        node.leftChild = buildUtil(in, post, inStrt, iIndex - 1, pIndex);

        return node;
    }

    // This function mainly initializes index of root
    // and calls buildUtil()
//    static BinaryTreeNode<Integer> buildTree(int in[], int post[], int n)
//    {
//        Index pIndex = new Index();
//        pIndex.index = n - 1;
//        return buildUtil(in, post, 0, n - 1, pIndex);
//    }

    public static BinaryTreeNode<Integer> getTreeFromPostorderAndInorder(int[] post,
                                                                         int[] in){

        // Write your code here
        Index pIndex = new Index();
        pIndex.index = post.length - 1;
        return buildUtil(in, post, 0, post.length - 1, pIndex);

    }

    public static void main(String [] args){
        int post[] = {8, 4, 5, 2, 6, 7, 3, 1};
        int in[] = {4, 8, 2, 5, 1, 6, 3, 7};
        BinaryTreeNode<Integer> root = getTreeFromPostorderAndInorder(post, in);
        BinaryTreeUsage.printLevelWise(root);
    }

}
