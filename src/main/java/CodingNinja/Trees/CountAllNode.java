package CodingNinja.Trees;

public class CountAllNode {
    static int countTreeNode(TreeNode<Integer> root){
        if(root == null){
            return 0;
        }

        int count = 1;
        for(int i=0; i<root.children.size(); i++){
            count+=countTreeNode(root.children.get(i));
        }
        return count;
    }

    public static void main(String [] args){
        TreeNode<Integer> root = TreeUsage.takeInputLevelWise();
        System.out.println("Tree Node Count: " +  countTreeNode(root));
    }
}
