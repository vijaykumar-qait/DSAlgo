package CodingNinja.Trees;

public class LCAOfBinaryTree {
    /**
     * LCA of Binary Tree
     * Send Feedback
     * Given a binary tree and two nodes, find LCA (Lowest Common Ancestor) of the given two nodes in Binary Tree.
     * Read about LCA if you are having doubts about the definition.
     * If out of 2 nodes only one node is present, return that node.
     * If both are not present, return -1.
     * Input format :
     * Line 1 :  Elements in level order form (separated by space)
     * (If any node does not have left or right child, take -1 in its place)
     * Line 2 : Two integers, Node 1 and Node 2 (separated by space)
     * Output Format :
     * LCA
     * Constraints :
     * 1 <= N <= 1000
     * Sample Input 1:
     * 5 10 6 2 3 -1 -1 -1 -1 -1 9 -1 -1
     * 2 10
     * Sample Output 1:
     * 10
     * Sample Input 2:
     * 5 10 6 2 3 -1 -1 -1 -1 -1 9 -1 -1
     * 2 6
     * Sample Output 2:
     * 5
     * Sample Input 3:
     * 5 10 6 2 3 -1 -1 -1 -1 -1 9 -1 -1
     * 12 78
     * Sample Output 3:
     * -1
     */

    private static BinaryTreeNode<Integer> helperFucn(BinaryTreeNode <Integer> root , int a, int b){
        if(root == null){
            return null;
        }

        if(root.data == a || root.data == b){
            return root;
        }

        BinaryTreeNode<Integer> nodeA = helperFucn(root.leftChild, a, b);
        BinaryTreeNode<Integer> nodeB = helperFucn(root.rightChild, a, b);

        if(nodeA == null){
            return nodeB;
        }
        else if(nodeB == null){
            return nodeA;
        }
        else {
            return root;
        }
    }

    public static int lcaBinaryTree(BinaryTreeNode <Integer> root , int a, int b){
        // Write your code here
        BinaryTreeNode<Integer> lca = helperFucn(root, a, b);
        return lca != null ? lca.data : -1;
    }

    public static void main(String [] args){
        BinaryTreeNode<Integer> root = BinaryTreeUsage.takeInputLevelWise();
        int a = 2, b = 6;
        System.out.println();
        System.out.println(lcaBinaryTree(root, a, b));
    }
}
