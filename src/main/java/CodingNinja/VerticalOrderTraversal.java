package CodingNinja;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;

public class VerticalOrderTraversal {

    static class BinaryTreeNode<T> {
        T data;
        BinaryTreeNode<T> left;
        BinaryTreeNode<T> right;

        public BinaryTreeNode(T data) {
            this.data = data;
        }
    }

    public static void printBinaryTreeVerticalOrder(BinaryTreeNode<Integer> root, int hd, TreeMap<Integer, Vector<Integer>> map){
        if(root == null){
            return;
        }
        Vector<Integer> get = map.get(hd);
        if(get == null){
            get = new Vector<>();
            get.add(root.data);
        }
        else {
            get.add(root.data);
        }
        map.put(hd, get);

        printBinaryTreeVerticalOrder(root.left, hd-1, map);
        printBinaryTreeVerticalOrder(root.right, hd+1, map);
    }

    public static void printBinaryTreeVerticalOrder(BinaryTreeNode<Integer> root){
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Print output and don't return it.
         * Taking input is handled automatically.
         */
        TreeMap<Integer, Vector<Integer>> map = new TreeMap<>();
        int hd = 0;
        printBinaryTreeVerticalOrder(root, hd, map);

        for(Map.Entry<Integer, Vector<Integer>> entry : map.entrySet()){
            Iterator values = entry.getValue().iterator();
            while(values.hasNext()){
                System.out.print(values.next() + " ");
            }
            System.out.println();
        }

    }
    public static void main(String args[]){
        // TO DO Auto-generated method stub
        BinaryTreeNode root = new BinaryTreeNode(1);
        root.left = new BinaryTreeNode(2);
        root.right = new BinaryTreeNode(3);
        root.left.left = new BinaryTreeNode(4);
        root.left.right = new BinaryTreeNode(5);
        root.right.left = new BinaryTreeNode(6);
        root.right.right = new BinaryTreeNode(7);
        root.right.left.right = new BinaryTreeNode(8);
        root.right.right.right = new BinaryTreeNode(9);
        System.out.println("Vertical Order traversal is");
        printBinaryTreeVerticalOrder(root);
    }
}
