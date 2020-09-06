package CodingNinja.Trees;

import org.omg.CORBA.INTERNAL;

public class CreateInsertDuplicateNode {
    /**
     * Create & Insert Duplicate Node
     * Send Feedback
     * Given a Binary Tree with N number of nodes, for each node create a new duplicate node, and insert
     * that duplicate as left child of the original node.
     * Note : Root will remain same. So you just need to insert nodes in the given Binary Tree and no need to print or return anything.
     * Input format :
     * Elements in level order form (separated by space)
     * (If any node does not have left or right child, take -1 in its place)
     * Output Format :
     * Level order traversal of updated tree. (Every level in new line)
     * Constraints :
     * 1 <= N <= 1000
     * Sample Input :
     * 8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1
     * Sample Output :
     * 8
     * 8 10
     * 5 10
     * 5 6
     * 2 6 7
     * 2 7
     */

    private static BinaryTreeNode<Integer> insertDuplicateNodeHelper(BinaryTreeNode<Integer> root){
        if(root == null){
            return null;
        }
        BinaryTreeNode<Integer> temp = root.leftChild;
        BinaryTreeNode<Integer> duplicate = new BinaryTreeNode<>(root.data);
        root.leftChild = duplicate;
        duplicate.leftChild = insertDuplicateNodeHelper(temp);
        root.rightChild = insertDuplicateNodeHelper(root.rightChild);
        return root;
    }

    public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
        root = insertDuplicateNodeHelper(root);
        BinaryTreeUsage.printLevelWise(root);
    }
    public static void main(String [] args){
        BinaryTreeNode<Integer> root = BinaryTreeUsage.takeInputLevelWise();
        insertDuplicateNode(root);
    }
}
