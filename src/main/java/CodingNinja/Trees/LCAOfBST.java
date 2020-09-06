package CodingNinja.Trees;

public class LCAOfBST {
    /**
     * LCA of BST
     * Send Feedback
     * Given a binary search tree and two nodes, find LCA(Lowest Common Ancestor) of the given two nodes in the BST.
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
     * 8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1
     * 2 10
     * Sample Output 1:
     * 8
     * Sample Input 2:
     * 8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1
     * 2 6
     * Sample Output 2:
     * 5
     * Sample Input 3:
     * 8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1
     * 12 78
     * Sample Output 3:
     * -1
     */


    /**
     * private static BinaryTreeNode<Integer> helperFunc(BinaryTreeNode<Integer> root , int a , int b){
     *         if(root == null){
     *             return  null;
     *         }
     *
     *         if(root.data == a || root.data == b){
     *             return root;
     *         }
     *
     *         BinaryTreeNode<Integer> left_lca = helperFunc(root.left, a, b);
     *         BinaryTreeNode<Integer> right_lca = helperFunc(root.right, a, b);
     *
     *
     *        if (left_lca != null && right_lca != null)
     *             return root;
     *         else if(left_lca != null )//&& right_lca == null)
     *             return left_lca;
     *         else if(right_lca != null)
     *             return right_lca;
     *         else
     *             return null;
     *     }
     *
     *         public static int lcaInBST(BinaryTreeNode<Integer> root , int a , int b){
     *             // Write your code here
     *             BinaryTreeNode<Integer> lca = helperFunc(root, a, b);
     *         	return lca != null ? lca.data : -1;
     *
     *         }
     *
     *
     */

    private static BinaryTreeNode<Integer> helperFunc(BinaryTreeNode<Integer> root , int a , int b){
        if(root == null){
            return  null;
        }

        if(root.data == a || root.data == b){
            return root;
        }

        BinaryTreeNode<Integer> nodeA = null;
        BinaryTreeNode<Integer> nodeB = null;

        if(root.data > a && root.data > b){
            nodeA = helperFunc(root.leftChild, a, b);
        }
        else if(root.data < a && root.data < b){
            nodeB = helperFunc(root.rightChild, a, b);
        }
        else {
            if(root.data > a){
                nodeA = helperFunc(root.leftChild, a, b);
            }
            else {
                nodeB = helperFunc(root.rightChild, a, b);
            }

            if(root.data > b){
                nodeA = helperFunc(root.leftChild, a, b);
            }
            else {
                nodeB = helperFunc(root.rightChild, a, b);
            }
        }

        if(nodeA == null){
            return nodeB;
        }
        else if(nodeB == null){
            return  nodeA;
        }
        else {
            return root;
        }
    }

    public static int lcaInBST(BinaryTreeNode<Integer> root , int a , int b){
        // Write your code here
        BinaryTreeNode<Integer> lca = helperFunc(root, a, b);
        return lca != null ? lca.data : -1;
    }

    public static void main(String [] args){
        BinaryTreeNode<Integer> root = BinaryTreeUsage.takeInputLevelWise();
        int a = 12, b = 78;
        System.out.println();
        System.out.println(lcaInBST(root, a, b));
    }
}
