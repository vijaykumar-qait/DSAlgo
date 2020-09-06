package CodingNinja.Trees;

public class ConstructTreeFromPreorderAndInorder {
    /**
     * Code: Construct Tree from Preorder and Inorder
     * Send Feedback
     * Given Preorder and Inorder traversal of a binary tree, create the binary tree associated with the traversals.
     * You just need to construct the tree and return the root.
     * Note: Assume binary tree contains only unique elements.
     * Input format :
     *
     * Line 1 : n (Total number of nodes in binary tree)
     *
     * Line 2 : Pre order traversal
     *
     * Line 3 : Inorder Traversal
     *
     * Output Format :
     *
     * Elements are printed level wise, each level in new line (separated by space).
     *
     * Sample Input :
     * 12
     * 1 2 3 4 15 5 6 7 8 10 9 12
     * 4 15 3 2 5 1 6 10 8 7 9 12
     * Sample Output :
     * 1
     * 2 6
     * 3 5 7
     * 4 8 9
     * 15 10 12
     */


    private static BinaryTreeNode<Integer> helperFucntion(int[] preOrder, int[] inOder, int prs, int pre, int ios, int ioe){
        if(prs > pre || ios > ioe){
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(preOrder[prs]);

        int inoIndex = 0;
        for(int i=ios; i<=ioe; i++){
            if(root.data == inOder[i]){
                inoIndex = i;
                break;
            }
        }

        root.leftChild = helperFucntion(preOrder, inOder, prs+1, (prs + (inoIndex-ios)),ios, inoIndex-1);
        root.rightChild = helperFucntion(preOrder, inOder, (prs + (inoIndex-ios)+1), pre,inoIndex+1, ioe);
        return root;
    }

    public static BinaryTreeNode<Integer> getTreeFromPreorderAndInorder(int[] pre, int[] in){
        return helperFucntion(pre, in, 0, pre.length-1, 0, in.length-1);
    }

    public static void main(String [] args){
        int inOrder[] = {4, 15, 3, 2, 5, 1, 6, 10, 8, 7, 9, 12};
        int preOrder[] = {1, 2, 3, 4, 15, 5, 6, 7, 8, 10, 9, 12};
        BinaryTreeNode<Integer> root = getTreeFromPreorderAndInorder(preOrder, inOrder);
        BinaryTreeUsage.printLevelWise(root);
    }
}
