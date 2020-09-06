package CodingNinja.Trees;


class PairSecond<T> {
    T max;
    T secondMax;
}

public class SecondLargestElementInTree {
    /**
     * Second Largest Element In Tree
     * Send Feedback
     * Given a generic tree, find and return the node with second largest value in given tree.
     * Return NULL if no node with required value is present.
     * Input format :
     * Elements in level order form separated by space (as per done in class). Order is -
     * <p>
     * Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element
     * Output format:
     * Second Largest node data
     * Sample Input 1 :
     * 10 3 20 30 40 2 40 50 0 0 0 0
     * Sample Output 1 :
     * 40
     */

//    private int largestElement(TreeNode<Integer> root){
//        if(root == null){
//            return 0;
//        }
//
//        int max = root.data;
//
//        for(int i=0; i<root.children.size(); i++){
//            max = Math.max(max, largestElement(root.children.get(i)));
//        }
//        return max;
//    }
//
//    private static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root, int max){
//        return root;
//    }
//
//    public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root){
//
//
//        // Write your code here
//
//    }
    private static PairSecond<TreeNode<Integer>> helperFunc(TreeNode<Integer> root) {
        if (root == null) {
            PairSecond<TreeNode<Integer>> ans = new PairSecond<>();
            ans.max = null;
            ans.secondMax = null;
            return ans;
        }
        PairSecond<TreeNode<Integer>> ans = new PairSecond<>();
        ans.max = root;

        for (int i = 0; i < root.children.size(); i++) {
            PairSecond<TreeNode<Integer>> temp = helperFunc(root.children.get(i));

            if (ans.max.data > temp.max.data) {
                if (ans.secondMax != null) {
                    if (ans.secondMax.data < temp.max.data) {
                        ans.secondMax = ans.max;
                    }
                } else {
                    ans.secondMax = temp.max;
                }
            } else {

                if (ans.max.data == temp.max.data) {
                    if (ans.secondMax == null) {
                        ans.secondMax = temp.secondMax;
                    } else {
                        if(temp.secondMax != null){
                            if (ans.secondMax.data < temp.secondMax.data) {
                                ans.secondMax = temp.secondMax;
                            }
                        }
                    }
                } else {
                    TreeNode<Integer> tempNode = ans.max;
                    ans.max = temp.max;

                    if (temp.secondMax != null) {
                        if (tempNode.data > temp.secondMax.data) {
                            ans.secondMax = tempNode;
                        } else {
                            ans.secondMax = temp.secondMax;
                        }
                    } else {
                        ans.secondMax = tempNode;
                    }
                }
            }

        }
        return ans;
    }


    public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root) {
        PairSecond<TreeNode<Integer>> ans = helperFunc(root);
        return ans.secondMax;
    }

    public static void main(String args[]) {
        TreeNode<Integer> root = TreeUsage.takeInputLevelWise();
        System.out.println(findSecondLargest(root).data);
    }
}
