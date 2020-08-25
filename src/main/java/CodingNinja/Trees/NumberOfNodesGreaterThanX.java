package CodingNinja.Trees;

public class NumberOfNodesGreaterThanX {
    /**
     * Code : Number of nodes greater than x
     * Send Feedback
     * Given a tree and an integer x, find and return number of Nodes which are greater than x.
     * Input format :
     * Single Line : First Integer denotes x and rest of the elements in level order form separated by space.
     * Order is -
     * Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element
     * Output Format :
     * Count of nodes greater than x
     * Sample Input 1 :
     * 35 10 3 20 30 40 2 40 50 0 0 0 0
     * Sample Output 1 :
     * 3
     * Sample Input 2 :
     * 10 10 3 20 30 40 2 40 50 0 0 0 0
     * Sample Output 2:
     * 5
     */

    public static int numNodeGreater(TreeNode<Integer> root,int x){
        if(root == null){
            return 0;
        }
        int count = 0;
        if(root.data > x){
            count++;
        }
        for(int i=0; i<root.children.size(); i++){
            count+= numNodeGreater(root.children.get(i), x);
        }
        return count;
    }


    public static void main(String [] args){
        TreeNode<Integer> root = TreeUsage.takeInputLevelWise();
        int x = 35;
        System.out.println(numNodeGreater(root, x));
    }
}
