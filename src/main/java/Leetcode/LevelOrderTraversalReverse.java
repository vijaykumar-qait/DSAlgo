package Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LevelOrderTraversalReverse {

    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

    public static void insertIntoMultimap(Map<Integer, List<Integer>> map, Integer key, Integer value){
        if(!map.containsKey(key)){
            map.put(key, new ArrayList<>());
        }
        map.get(key).add(value);
    }

    static void preOrder(TreeNode root, int level, Map<Integer, List<Integer>> map){
        if(root==null){
            return;
        }
        insertIntoMultimap(map, level, root.val);

        preOrder(root.left, level+1, map);
        preOrder(root.right, level+1, map);
    }

    static public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        preOrder(root, 1, map);
        List<List<Integer>> list = new ArrayList<>();

        for(int i=map.size(); i>0; i--){
            list.add(map.get(i));
        }

        return list;
    }

    public static void main(String [] args){
        TreeNode root = new TreeNode(15);
        root.left = new TreeNode(10);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(8);
        root.left.right = new TreeNode(12);
        root.right.left = new TreeNode(16);
        root.right.right = new TreeNode(25);
        root.right.right.right = new TreeNode(30);

        System.out.println(levelOrderBottom(root).toString());
    }
}
