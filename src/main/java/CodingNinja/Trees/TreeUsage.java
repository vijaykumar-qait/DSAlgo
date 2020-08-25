package CodingNinja.Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeUsage {

    static Scanner scanner = new Scanner(System.in);

    public static TreeNode<Integer> takeInput(){
        int n;
        System.out.println("Enter next node data: ");
        n = scanner.nextInt();

        TreeNode<Integer> root = new TreeNode<>(n);

        System.out.println("Enter number of childern: ");

        int childerCount = scanner.nextInt();
        for(int i=0; i<childerCount; i++){
            TreeNode<Integer> child = takeInput();
            root.children.add(child);
        }
        return root;
    }

    public static void print(TreeNode<Integer> root){
        String s = root.data + " : ";
        for(int i=0; i<root.children.size(); i++){
            s = s + root.children.get(i).data + ", ";
        }
        System.out.println(s);
        for(int i=0; i<root.children.size(); i++){
            print(root.children.get(i));
        }
    }

    public static TreeNode<Integer> takeInputLevelWise(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter root data: ");
        int readData = scanner.nextInt();
        Queue<TreeNode<Integer>> pendingNode = new LinkedList<>();
        TreeNode<Integer> root = new TreeNode<>(readData);
        pendingNode.add(root);

        while(!pendingNode.isEmpty()){
            try {
                TreeNode<Integer> frontNode = pendingNode.remove();

                System.out.println("Enter number of children for "+ frontNode.data +" : ");
                int numChild = scanner.nextInt();

                for(int i=0; i<numChild; i++){
                    System.out.println("Enter "+(i+1)+" child: ");
                    int child = scanner.nextInt();
                    TreeNode<Integer> childNode = new TreeNode<>(child);
                    frontNode.children.add(childNode);
                    pendingNode.add(childNode);
                }
            }
            catch (Exception e){

            }
        }
        return root;
    }

    static void printTreeLevelWise(TreeNode<Integer> root){
        if(root == null){
            return;
        }

        Queue<TreeNode<Integer>> pendingNode = new LinkedList<>();
        pendingNode.add(root);
        while(!pendingNode.isEmpty()){

            int size = pendingNode.size();

            while(size-- >0){
                TreeNode<Integer> frontNode = pendingNode.poll();
                System.out.print(frontNode.data + " ");
                for(int i=0; i<frontNode.children.size(); i++){
                    pendingNode.add(frontNode.children.get(i));
                }
            }
            System.out.println();
        }
    }

    public static void main(String [] args){
        TreeNode<Integer> root = takeInputLevelWise();
        //print(root);
        printTreeLevelWise(root);
     }
}
