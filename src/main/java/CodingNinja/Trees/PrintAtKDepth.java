package CodingNinja.Trees;

public class PrintAtKDepth {
    /**
     * print tree node at depth k
     */
    static void printNodeAtKDepth(TreeNode<Integer> root, int k){
        if(k<0){
            return;
        }
        if(k==0){
            System.out.println(root.data);
        }
        for(int i=0; i<root.children.size(); i++){
            printNodeAtKDepth(root.children.get(i), k-1);
        }
    }
    public static void main(String [] args){
        TreeNode<Integer> root = TreeUsage.takeInputLevelWise();
        int k = 2;
        printNodeAtKDepth(root,k);
    }
}
