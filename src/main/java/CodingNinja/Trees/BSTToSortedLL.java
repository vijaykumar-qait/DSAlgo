package CodingNinja.Trees;

import CodingNinja.LinkedList.LinkedListUsage;
import CodingNinja.LinkedList.Node;

public class BSTToSortedLL {
    /**
     * BST to Sorted LL
     * Send Feedback
     * Given a BST, convert it into a sorted linked list. Return the head of LL.
     * Input format :
     * Elements in level order form (separated by space)
     * (If any node does not have left or right child, take -1 in its place)
     * Output Format :
     * Linked list elements (separated by space)
     * Sample Input :
     * 8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1
     * Sample Output :
     * 2 5 6 7 8 10
     */

    public static Node<Integer> BSTToSortedLL(BinaryTreeNode<Integer> root){
        if(root == null){
            return null;
        }

        Node<Integer> leftHead = BSTToSortedLL(root.leftChild);
        Node<Integer> rightHead = BSTToSortedLL(root.rightChild);

        Node<Integer> temp = new Node<>(root.data);

        if(leftHead == null){
            leftHead = temp;
            temp.next = rightHead;
        }
        else {
            Node<Integer> ptr = leftHead;
            while(ptr.next != null){
                ptr = ptr.next;
            }
            ptr.next = temp;
            temp.next = rightHead;
        }
        return leftHead;
    }

    public static void main(String [] args){
        BinaryTreeNode<Integer> root = BinaryTreeUsage.takeInputLevelWise();
        Node<Integer> head = BSTToSortedLL(root);
        LinkedListUsage.print(head);
    }
}
