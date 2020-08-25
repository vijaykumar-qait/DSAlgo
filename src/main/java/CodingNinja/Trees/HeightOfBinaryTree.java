package CodingNinja.Trees;

public class HeightOfBinaryTree {
    /**
     * Height Of Binary Tree
     * Send Feedback
     * Given a binary tree, find and return the height of given tree.
     * Input format :
     * Nodes in the level order form (separated by space). If any node does not have left or right child, take -1 in its place
     * Output format :
     * Height
     * Constraints :
     * 1 <= N <= 10^5
     * Sample Input :
     * 10
     *  9
     * 4
     * -1
     * -1
     *  5
     *  8
     * -1
     * 6
     * -1
     * -1
     * 3
     * -1
     * -1
     * -1
     * Sample Output :
     * 5
     */

    public static int height(BinaryTreeNode<Integer> root) {
        if(root == null){
            return 0;
        }
        int sum = 0;
        if(root.leftChild != null){
            sum = Math.max(sum, height(root.leftChild));
        }
        if(root.rightChild != null){
            sum = Math.max(sum, height(root.rightChild));
        }
        return sum+1;
    }

    public static void main(String [] args){
        BinaryTreeNode<Integer> root = BinaryTreeUsage.takeInputLevelWise();
        System.out.println(height(root));

        try{
            System.out.println("hello");
            return;
        }
        catch (Exception e){
            System.out.println("catch");
        }
        finally {
            System.out.println("finally");
        }
    }
}
