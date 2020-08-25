package CodingNinja.Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTreeUsage {
    /**
     * Take input function and print binary tree;
     */

    public static BinaryTreeNode<Integer> takeInput(Scanner scanner){
        int readData;
        System.out.print("Enter data: ");
        readData = scanner.nextInt();
        if(readData == -1){
            return null;
        }
        BinaryTreeNode root = new BinaryTreeNode(readData);
        root.leftChild = takeInput(scanner);
        root.rightChild = takeInput(scanner);
        return root;
    }

    public static void printTree(BinaryTreeNode<Integer> root){
        if(root == null){
            return;
        }
        String toBePrinted = root.data + " : ";
        if(root.leftChild != null)
            toBePrinted += "L " + root.leftChild.data + " , ";

        if(root.rightChild != null)
            toBePrinted += "R " + root.rightChild.data;

        System.out.println(toBePrinted);
        if(root.leftChild != null)
            printTree(root.leftChild);
        if(root.rightChild != null)
            printTree(root.rightChild);

    }

    public static BinaryTreeNode<Integer>takeInputLevelWise(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter root data: " );
        int readData = scanner.nextInt();
        if(readData == -1){
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(readData);
        Queue<BinaryTreeNode> pending = new LinkedList<>();
        pending.add(root);
        while(!pending.isEmpty()){
            BinaryTreeNode<Integer> frontNode = pending.poll();
            System.out.print("Enter data for left child " + frontNode.data + " : ");
            int leftChild = scanner.nextInt();
            if(leftChild != -1){
                BinaryTreeNode<Integer> leftChildNode = new BinaryTreeNode<>(leftChild);
                frontNode.leftChild = leftChildNode;
                pending.add(leftChildNode);
            }

            System.out.print("Enter data for right child " + frontNode.data + " : ");
            int rightChild = scanner.nextInt();
            if(rightChild!= -1){
                BinaryTreeNode<Integer> rightChildNode = new BinaryTreeNode<>(rightChild);
                frontNode.rightChild = rightChildNode;
                pending.add(rightChildNode);
            }

        }
        return root;
    }

    public static void printLevelWise(BinaryTreeNode<Integer> root){
        if(root == null){
            return;
        }
        Queue<BinaryTreeNode<Integer>> pending = new LinkedList<>();
        pending.add(root);

        while(!pending.isEmpty()){
            BinaryTreeNode<Integer> front = pending.poll();
            System.out.print(front.data + ":");
            if(front.leftChild != null){
                System.out.print("L:" + front.leftChild.data + ",");
                pending.add(front.leftChild);
            }
            if(front.rightChild != null){
                System.out.print("R:" + front.rightChild.data);
                pending.add(front.rightChild);
            }
            System.out.println();
        }

    }

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
//        BinaryTreeNode<Integer> root = takeInput(scanner);
//        printTree(root);

        BinaryTreeNode<Integer> root = takeInputLevelWise();
        printLevelWise(root);
    }
}
