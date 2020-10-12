package CodingNinja.Trees;

public class PrintNodesAtDistanceKFromNode {
    /**
     * Print nodes at distance k from node
     * Send Feedback
     * Given a binary tree, a node and an integer K, print nodes which are at K distance from the the given node.
     * Input format :
     *
     * Line 1 : Elements in level order form (separated by space)
     *
     * (If any node does not have left or right child, take -1 in its place)
     *
     * Line 2 : Node
     *
     * Line 3 : K
     *
     * Output format : Answer nodes in different line
     *
     * Sample Input :
     * 5 6 10 2 3 -1 -1 -1 -1 -1 9 -1 -1
     * 3
     * 1
     * Sample Output :
     * 9
     * 6
     */

    static void printkdistanceNodeDown(BinaryTreeNode<Integer> node, int k)
    {
        // Base Case
        if (node == null || k < 0)
            return;

        // If we reach a k distant node, print it
        if (k == 0)
        {
            System.out.print(node.data);
            System.out.println("");
            return;
        }

        // Recur for left and right subtrees
        printkdistanceNodeDown(node.leftChild, k - 1);
        printkdistanceNodeDown(node.rightChild, k - 1);
    }

    static int printkdistanceNode(BinaryTreeNode<Integer> node, BinaryTreeNode<Integer> target, int k)
    {
        // Base Case 1: If tree is empty, return -1
        if (node == null)
            return -1;

        // If target is same as root.  Use the downward function
        // to print all nodes at distance k in subtree rooted with
        // target or root
        if (node == target)
        {
            printkdistanceNodeDown(node, k);
            return 0;
        }

        // Recur for left subtree
        int dl = printkdistanceNode(node.leftChild, target, k);

        // Check if target node was found in left subtree
        if (dl != -1)
        {

            // If root is at distance k from target, print root
            // Note that dl is Distance of root's left child from
            // target
            if (dl + 1 == k)
            {
                System.out.print(node.data);
                System.out.println("");
            }

            // Else go to right subtree and print all k-dl-2 distant nodes
            // Note that the right child is 2 edges away from left child
            else
                printkdistanceNodeDown(node.rightChild, k - dl - 2);

            // Add 1 to the distance and return value for parent calls
            return 1 + dl;
        }

        // MIRROR OF ABOVE CODE FOR RIGHT SUBTREE
        // Note that we reach here only when node was not found in left
        // subtree
        int dr = printkdistanceNode(node.rightChild, target, k);
        if (dr != -1)
        {
            if (dr + 1 == k)
            {
                System.out.print(node.data);
                System.out.println("");
            }
            else
                printkdistanceNodeDown(node.leftChild, k - dr - 2);
            return 1 + dr;
        }

        // If target was neither present in left nor in right subtree
        return -1;
    }

    public static void nodesAtDistanceK(BinaryTreeNode<Integer> root, int node, int k) {
        // Write your code here
        BinaryTreeNode<Integer> nodeData = new BinaryTreeNode<>(node);
        printkdistanceNode(root, nodeData, k);

    }

    public static void main(String [] args){
        BinaryTreeNode<Integer> root = BinaryTreeUsage.takeInputLevelWise();
        int node = 3;
        int k = 1;
    }

}

