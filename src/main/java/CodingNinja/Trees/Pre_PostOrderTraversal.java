package CodingNinja.Trees;

public class Pre_PostOrderTraversal {
    /**
     * pre order traversal
     */

    static void preOrderTraversal(TreeNode<Integer> root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        for(int i=0; i< root.children.size(); i++){
            preOrderTraversal(root.children.get(i));
        }
    }

    static void postOrderTraversal(TreeNode<Integer> root){
        if(root == null){
            return;
        }
        for(int i=0; i<root.children.size(); i++){
            postOrderTraversal(root.children.get(i));
        }
        System.out.print(root.data + " ");
    }

    public static void main(String args[]){
        TreeNode<Integer> root = TreeUsage.takeInputLevelWise();
        preOrderTraversal(root);
        System.out.println();
        postOrderTraversal(root);
    }
}
