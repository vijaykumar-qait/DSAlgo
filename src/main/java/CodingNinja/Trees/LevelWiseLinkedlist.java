package CodingNinja.Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Node<T> {
    T data;
    Node<T> next;
    Node(T data){
        this.data = data;
    }
}

public class LevelWiseLinkedlist {
    /**
     * Level wise linkedlist
     * Send Feedback
     * Given a binary tree, write code to create a separate linked list for each level. You need to return the array which contains head of each level linked list.
     * Input format :
     *
     * Elements in level order form (separated by space). If any node does not have left or right child, take -1 in its place.
     *
     * Output format : Each level linked list is printed in new line (elements separated by space).
     *
     * Sample Input :
     * 5 6 10 2 3 -1 -1 -1 -1 -1 9 -1 -1
     * Sample Output :
     * 5
     * 6 10
     * 2 3
     * 9
     */
    public static ArrayList<Node<BinaryTreeNode<Integer>>> LLForEachLevel(BinaryTreeNode<Integer> root) {
        if(root == null){
            return null;
        }
        ArrayList<Node<BinaryTreeNode<Integer>>> finalList = new ArrayList<>();
        Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node<BinaryTreeNode<Integer>> head = null;
            Node<BinaryTreeNode<Integer>> tail = null;
            int size = queue.size();

            for(int i=0; i<size; i++){
                BinaryTreeNode<Integer> front = queue.poll();
                Node<BinaryTreeNode<Integer>> newNode = new Node<>(front);
                if(head == null){
                    head = newNode;
                    tail = newNode;
                }
                else {
                    tail.next = newNode;
                    tail = tail.next;
                }

                if(front.leftChild != null){
                    queue.add(front.leftChild);
                }
                if(front.rightChild != null){
                    queue.add(front.rightChild);
                }
            }
            finalList.add(head);
        }

        return finalList;
    }

    public static void main(String [] args){
        BinaryTreeNode<Integer> root = BinaryTreeUsage.takeInputLevelWise();
        System.out.println(LLForEachLevel(root).toString());
    }
}
