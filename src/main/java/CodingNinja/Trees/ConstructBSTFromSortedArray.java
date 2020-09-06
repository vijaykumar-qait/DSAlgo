package CodingNinja.Trees;

public class ConstructBSTFromSortedArray {
    /**
     * Construct BST From Sorted Array
     * Send Feedback
     * Given a sorted integer array A of size n which contains all unique elements.
     * You need to construct a balanced BST from this input array. Return the root of constructed BST.
     * Note : If array size is even, take first mid as root.
     * Input format :
     * Line 1 : Integer n (Size of array)
     * Line 2 : Array elements (separated by space)
     * Output Format :
     * BST elements (in pre order traversal, separated by space)
     * Sample Input :
     * 7
     * 1 2 3 4 5 6 7
     * Sample Output :
     * 4 2 1 3 6 5 7
     */

    public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int starti, int endi){
        if(starti > endi){
            return null;
        }

        int mid = starti + (endi - starti)/2;
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(arr[mid]);
        root.leftChild = SortedArrayToBST(arr, starti, mid-1);
        root.rightChild = SortedArrayToBST(arr, mid+1, endi);
        return root;
    }

    public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr){
        return SortedArrayToBST(arr, 0, arr.length-1);
    }

    public static void main(String [] args){
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        BinaryTreeNode<Integer> root = SortedArrayToBST(arr);
        BinaryTreeUsage.printLevelWise(root);
    }
}
