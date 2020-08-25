package CodingNinja.Trees;

public class TreeHeight {
    /**
     * Code : Find Height
     * Send Feedback
     * Given a generic tree, find and return the height of given tree.
     * Input format :
     * Elements in level order form separated by space (as per done in class). Order is -
     * Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element
     * Output Format :
     * Height
     * Sample Input :
     * 10 3 20 30 40 2 40 50 0 0 0 0
     * Sample Output :
     * 3
     */
    public static int height(TreeNode<Integer> root){
        if(root == null){
            return 0;
        }
        int count = 0;
        for(int i=0; i<root.children.size(); i++){
            count =  Math.max(count, height(root.children.get(i)));
        }
        return count+1;
    }

    public static void main(String [] args){
        TreeNode<Integer> root = TreeUsage.takeInputLevelWise();
        System.out.println(height(root));
    }
}
