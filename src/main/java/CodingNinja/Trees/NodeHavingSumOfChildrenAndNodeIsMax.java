package CodingNinja.Trees;

class MaxNode<T>{
    TreeNode<T> maxNode;
    T maxValue;
}

public class NodeHavingSumOfChildrenAndNodeIsMax {
    /**
     * Node having sum of children and node is max
     * Send Feedback
     * Given a tree, find and return the node for which sum of data of all children and the node itself is
     * maximum. In the sum, data of node itself and data of immediate children is to be taken.
     * Input format :
     *
     * Line 1 : Elements in level order form separated by space (as per done in class). Order is -
     *
     * Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element
     *
     * Output format : Node with maximum sum.
     *
     * Sample Input 1 :
     * 5 3 1 2 3 1 15 2 4 5 1 6 0 0 0 0
     * Sample Output 1 :
     * 1
     */



    private static MaxNode<Integer> maxSumNode(TreeNode<Integer> root, MaxNode<Integer> maxNode){
        int max = root.data;
        for(int i=0; i<root.children.size(); i++){
            max += root.children.get(i).data;
        }

        if(max > maxNode.maxValue){
            maxNode.maxNode = root;
            maxNode.maxValue = max;
        }

        for(int i=0; i<root.children.size(); i++){
            maxNode = maxSumNode(root.children.get(i), maxNode);
        }
        return maxNode;
    }

    public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){
        if(root == null){
            return root;
        }
        MaxNode<Integer> maxNode= new MaxNode<>();
        maxNode.maxValue = root.data;
        maxNode.maxNode = root;

        return maxSumNode(root, maxNode).maxNode;
    }

    public static void main(String [] args){
        TreeNode<Integer> root = TreeUsage.takeInputLevelWise();
        System.out.println(maxSumNode(root).data);
    }
}
