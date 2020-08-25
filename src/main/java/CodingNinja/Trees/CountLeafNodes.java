package CodingNinja.Trees;

public class CountLeafNodes {
    /**
     * Code : Count leaf nodes
     * Send Feedback
     * Given a generic tree, count and return the number of leaf nodes present in the given tree.
     * Input format :
     * Elements in level order form separated by space (as per done in class). Order is -
     * Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element
     * Output Format :
     * Count of leaf nodes
     * Sample Input 1 :
     * 10 3 20 30 40 2 40 50 0 0 0 0
     * Sample Output 1 :
     * 4
     */
    public static int countLeafNodes(TreeNode<Integer> root){
        if(root == null){
            return 0;
        }
        if(root.children.size() == 0){
            return 1;
        }
        int sum = 0;
        for(int i=0; i<root.children.size(); i++){
            sum+= countLeafNodes(root.children.get(i));
        }
        return sum;
    }

    public static void main(String [] args){
        TreeNode<Integer> root = TreeUsage.takeInputLevelWise();
        System.out.println(countLeafNodes(root));
    }
}
