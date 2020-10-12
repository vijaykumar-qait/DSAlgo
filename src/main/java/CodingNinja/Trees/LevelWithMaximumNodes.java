package CodingNinja.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class LevelWithMaximumNodes {
    /**
     * Level With Maximum Nodes
     * Send Feedback
     * Given a generic tree, return the level number, which is having maximum number of nodes(root is level 0).
     * Note : If there are multiple levels having maximum number of nodes, print the level which comes first.
     * Input format :
     * Line 1 : Elements will be input in level order form separated by space. Order is -
     * Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element.
     * Output format
     * Line 1 : Level with maximum nodes
     * Sample Input 1 :
     * 2 2 1 3 2 4 6 1 8 0 1 5 0 0
     * Sample Output 1 :
     * 2
     * Sample Output Explanation
     * Level 2 has maximum number of nodes i.e. 3 nodes (Nodes 4,6 and 8 are at level 2)
     */

    public static int maxLevel(TreeNode<Integer> root){


        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */

        if(root == null){
            return -1;
        }

        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);

        //current level
        int level = 0;

        //max node @ same level
        int max = Integer.MIN_VALUE;

        //level haveing max node
        int level_no = 0;

        while(true){
            int nodeCount = queue.size();

            if(nodeCount == 0){
                break;
            }

            if(nodeCount > max){
                max = nodeCount;
                level_no = level;
            }

            while (nodeCount > 0){
                TreeNode<Integer> front = queue.poll();

                for(int i=0; i<front.children.size(); i++){
                    queue.add(front.children.get(i));
                }
                nodeCount--;
            }
            level++;
        }
        return level_no;
    }

    public static void main(String [] args){
        TreeNode<Integer> root = TreeUsage.takeInputLevelWise();
        System.out.println();
        System.out.println(maxLevel(root));
    }
}
