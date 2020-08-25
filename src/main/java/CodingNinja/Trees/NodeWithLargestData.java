package CodingNinja.Trees;

public class NodeWithLargestData {
    /**
     * Find the largest data in node of the tree
     */
    static public int findLargestDataInNode(TreeNode<Integer> root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        int max = root.data;
        for(int i=0; i<root.children.size(); i++){
            max = Math.max(max, findLargestDataInNode(root.children.get(i)));
        }
        return max;
    }

    public static void main(String [] args){
        TreeNode<Integer> root = TreeUsage.takeInputLevelWise();
        System.out.println(findLargestDataInNode(root));
    }
}
