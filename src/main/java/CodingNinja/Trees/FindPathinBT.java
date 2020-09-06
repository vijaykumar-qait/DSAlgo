package CodingNinja.Trees;

import java.util.ArrayList;

public class FindPathinBT {
    /**
     * You have to find path in binary tree with the given data.
     * So you are given binary tree and data, you have to return an arraylist containg the path from root to the data node if exist else
     * return null
     */
    public static ArrayList<Integer> getRootToNodePath(BinaryTreeNode<Integer> root, int data){
        if(root == null){
            return null;
        }

        if(root.data == data){
            ArrayList<Integer> output = new ArrayList<>();
            output.add(root.data);
            return output;
        }

        ArrayList<Integer> leftOutput = getRootToNodePath(root.leftChild, data);
        if(leftOutput != null){
            leftOutput.add(root.data);
            return leftOutput;
        }

        ArrayList<Integer> rightOutput = getRootToNodePath(root.rightChild, data);
        if(rightOutput != null){
            rightOutput.add(root.data);
            return rightOutput;
        }
        else {
            return null;
        }
     }

     public static void main(String [] args){
        BinaryTreeNode<Integer> root = BinaryTreeUsage.takeInputLevelWise();
        int data = 2;
        System.out.println(getRootToNodePath(root, data).toString());
     }
}
