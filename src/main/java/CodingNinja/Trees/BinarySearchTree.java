package CodingNinja.Trees;

import java.util.Scanner;

public class BinarySearchTree {
    /**
     * Code: BST Class
     * Send Feedback
     * Implement the BST class which includes following functions -
     * 1. search
     * Given an element, find if that is present in BSt or not. Return true or false.
     * 2. insert -
     * Given an element, insert that element in the BST at the correct position. Assume unique elements will be given.
     * 3. delete -
     * Given an element, remove that element from the BST. If the element which is to be deleted has both children,
     * replace that with the minimum element from right sub-tree.
     * 4. printTree (recursive) -
     * Print the BST in ithe following format -
     * For printing a node with data N, you need to follow the exact format -
     * N:L:x,R:y
     * wherer, N is data of any node present in the binary tree. x and y are the values of left and right child of node N.
     * Print the children only if it is not null.
     * There is no space in between.
     * You need to print all nodes in the recursive format in different lines.
     * Note : main function is given for your reference which we are using internally to test the class.
     */

    private BinaryTreeNode<Integer> root = null;

    private boolean hasData(BinaryTreeNode<Integer> root, int data){
        if(root == null){
            return false;
        }
        if(root.data == data){
            return true;
        }
        else if(data > root.data){
            return hasData(root.rightChild, data);
        }
        else {
            return hasData(root.leftChild, data);
        }
    }

    public boolean search(int data){
        return hasData(root, data);
    }

    private BinaryTreeNode<Integer> helperFuncInsert(BinaryTreeNode<Integer> root, int data){
        if(root == null){
            BinaryTreeNode<Integer> newRoot = new BinaryTreeNode<>(data);
            return newRoot;
        }
        if(root.data> data){
            root.leftChild = helperFuncInsert(root.leftChild, data);
        }
        else {
            root.rightChild = helperFuncInsert(root.rightChild, data);
        }
        return root;
    }

    public void insertData(int data){
        root = helperFuncInsert(root, data);
    }

    private BinaryTreeNode<Integer> helperFuncDelete(BinaryTreeNode<Integer> root, int data){
        if(root == null){
            return null;
        }
        if(root.data == data){
            if(root.leftChild == null && root.rightChild == null){
                return null;
            }
            else if(root.leftChild != null && root.rightChild == null){
                BinaryTreeNode<Integer> temp = root.leftChild;
                return temp;
            }
            else if(root.rightChild != null && root.leftChild == null){
                BinaryTreeNode<Integer> temp = root.rightChild;
                return temp;
            }
            else {
                BinaryTreeNode<Integer> minFromRight = root.rightChild;
                while(minFromRight.leftChild != null){
                    minFromRight = minFromRight.leftChild;
                }
                root.data = minFromRight.data;

                root.rightChild = helperFuncDelete(root.rightChild, minFromRight.data);
                return root;
            }
        }
        else if(root.data > data){
            root.leftChild = helperFuncDelete(root.leftChild, data);
            return root;
        }
        else {
            root.rightChild = helperFuncDelete(root.rightChild, data);
            return root;
        }
    }

    public void deleteData(int data){
        root = helperFuncDelete(root, data);
    }

    private void helperPrint(BinaryTreeNode<Integer> root){
        if(root == null){
            return;
        }
        System.out.print(root.data+":");
        if(root.leftChild != null){
            System.out.print("L:"+root.leftChild.data+",");
        }
        if(root.rightChild != null){
            System.out.print("R:"+root.rightChild.data);
        }
        System.out.println();
        if(root.leftChild != null){
            helperPrint(root.leftChild);
        }
        if(root.rightChild != null){
            helperPrint(root.rightChild);
        }
    }

    public void printTree(){
        helperPrint(root);
    }

    public static void main(String [] args){
        BinarySearchTree bst = new BinarySearchTree();
        Scanner s = new Scanner(System.in);
        int choice, input;
        while(true) {
            choice = s.nextInt();
            switch(choice) {
                case 1 :
                    input = s.nextInt();
                    bst.insertData(input);
                    break;
                case 2 :
                    input = s.nextInt();
                    bst.deleteData(input);
                    break;
                case 3 :
                    input = s.nextInt();
                    System.out.println(bst.search(input));
                    break;
                case 4 :
                    bst.printTree();
                    break;
                default :
                    bst.printTree();
                    return;
            }

        }
    }
}
