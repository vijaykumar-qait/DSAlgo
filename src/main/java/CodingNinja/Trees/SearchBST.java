package CodingNinja.Trees;

public class SearchBST {
    /**
     * Code: Search Node in BST
     * Send Feedback
     * Given a BST and an integer k. Find if the integer k is present in given BST or not. Return the node with data k if it is present, return null otherwise.
     * Assume that BST contains all unique elements.
     * Input Format :
     * Line 1 : Elements in level order form (separated by space)
     * (If any node does not have left or right child, take -1 in its place)
     * Line 2 : Integer k
     * Output Format :
     * Node with data k
     * Sample Input 1 :
     * 8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1
     * 2
     * Sample Output 1 :
     * 2
     * Sample Input 2 :
     * 8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1
     * 12
     * Sample Output 2 :
     * (empty)
     */
    public static BinaryTreeNode<Integer> searchInBST(BinaryTreeNode<Integer> root , int k){
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        if(root == null || root.data == k){
            return root;
        }
        if(k > root.data){
            return searchInBST(root.rightChild, k);
        }
        else {
            return searchInBST(root.leftChild, k);
        }
    }

    public static void main(String args[]){
        BinaryTreeNode<Integer> root = BinaryTreeUsage.takeInputLevelWise();
        int k = 12;
        System.out.println();
        BinaryTreeNode<Integer> data = searchInBST(root, k);
        if(data != null){
            System.out.println(data.data);
        }
        else {
            System.out.println("data not present");
        }

    }
}
