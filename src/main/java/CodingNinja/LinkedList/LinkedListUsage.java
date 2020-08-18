package CodingNinja.LinkedList;

import java.util.Scanner;

public class LinkedListUsage {

    //taking tail a pointer to keep the track of last node so that we don't have to traverse the whole list again
    //increasing the complexity to O(n^2) after taking tail track pointer we reduce complexity to O(n)
    public static Node<Integer> createList(){
        Node<Integer> head = null, tail=null;

        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();

        while(data != -1){
            Node<Integer> newNode = new Node<>(data);
            if(head == null){
                head = newNode;
                tail = newNode;
            }
            else {
                tail.next = newNode;
                tail = tail.next; // tail = newNode;
            }
            data = scanner.nextInt();
        }
        return head;
    }

    static Node<Integer> addNode(Node<Integer> root, int data){
        Node<Integer> temp = new Node<>(data);

        if(root == null){
            root = temp;
            return root;
        }
        Node<Integer> ptr = root;
        while(ptr.next != null){
            ptr = ptr.next;
        }

        ptr.next = temp;
        return root;
    }

    public static void print(Node<Integer> root){
        if(root==null){
            System.out.println("Linked list is empty");
            return;
        }

        Node<Integer> temp = root;

        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    /**
     * Length of LL
     * Send Feedback
     * For a given singly linked list of integers, find and return its length. Do it using an iterative method.
     * Input format :
     * The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
     *
     * First and the only line of each test case or query contains elements of the singly linked list separated by a single space.
     *  Remember/Consider :
     * While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element.
     * Output format :
     * For each test case, print the length of the linked list.
     *
     * Output for every test case will be printed in a seperate line.
     *  Constraints :
     * 1 <= t <= 10^2
     * 0 <= N <= 10^5
     * Time Limit: 1sec
     * Sample Input 1 :
     * 1
     * 3 4 5 2 6 1 9 -1
     * Sample Output 1 :
     * 7
     * Sample Input 2 :
     * 2
     * 10 76 39 -3 2 9 -23 9 -1
     * -1
     * Sample Output 2 :
     * 8
     * 0
     *
     */

    public static int length(Node<Integer> head){
        //Your code goes here
        if(head == null){
            return 0;
        }

        Node ptr = head;
        int count = 0;
        while(ptr != null){
            count++;
            ptr = ptr.next;
        }
        return count;
    }

    /**
     * Print ith Node
     * Send Feedback
     * For a given a singly linked list of integers and a position 'i', print the node data at the 'i-th' position.
     *  Note :
     * Assume that the Indexing for the singly linked list always starts from 0.
     *
     * If the given position 'i',  is greater than the length of the given singly linked list, then don't print anything.
     * Input format :
     * The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
     *
     * The first line of each test case or query contains the elements of the singly linked list separated by a single space.
     *
     * The second line contains the value of 'i'. It denotes the position in the given singly linked list.
     *  Remember/Consider :
     * While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element.
     * Output format :
     * For each test case, print the node data at the 'i-th' position of the linked list(if exists).
     *
     * Output for every test case will be printed in a seperate line.
     *  Constraints :
     * 1 <= t <= 10^2
     * 0 <= N <= 10^5
     * i  >= 0
     * Time Limit: 1sec
     * Sample Input 1 :
     * 1
     * 3 4 5 2 6 1 9 -1
     * 3
     * Sample Output 1 :
     * 2
     * Sample Input 2 :
     * 2
     * 3 4 5 2 6 1 9 -1
     * 0
     * 9 8 4 0 7 8 -1
     * 3
     * Sample Output 2 :
     * 3
     * 0
     *
     */

    public static void printIthNode(Node<Integer> head, int i){
        //Your code goes here
        if(head == null || i<0){
            return;
        }

        Node temp = head;

        while(temp!=null && --i>=0){
            temp = temp.next;
        }

        if(temp != null){
            System.out.println(temp.data);
        }
    }

    /**
     *
     * Delete Node in LL
     * Send Feedback
     * You have been given a linked list of integers. Your task is to write a function that deletes a node from a given position, 'pos'.
     * Note :
     * Assume that the Indexing for the linked list always starts from 0.
     *
     * If the position is greater than or equal to the length of the linked list, you should return the same linked list without any change.
     * Illustration :
     * The following images depict how the deletion has been performed.
     * Image-I :
     * Alt txt
     *
     * Image-II :
     * Alt txt
     *
     * Input format :
     * The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
     *
     * The first line of each test case or query contains the elements of the linked list separated by a single space.
     *
     * The second line contains the integer value of 'pos'. It denotes the position in the linked list from where the node has to be deleted.
     *  Remember/Consider :
     * While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element
     * Output format :
     * For each test case/query, print the resulting linked list of integers in a row, separated by a single space.
     *
     * Output for every test case will be printed in a seperate line.
     * Constraints :
     * 1 <= t <= 10^2
     * 0 <= N <= 10^5
     * pos >= 0
     * Time Limit: 1sec
     *
     * Where 'N' is the size of the singly linked list.
     * Sample Input 1 :
     * 1
     * 3 4 5 2 6 1 9 -1
     * 3
     * Sample Output 1 :
     * 3 4 5 6 1 9
     * Sample Input 2 :
     * 2
     * 3 4 5 2 6 1 9 -1
     * 0
     * 10 20 30 40 50 60 -1
     * 7
     * Sample Output 2 :
     * 4 5 2 6 1 9
     * 10 20 30 40 50 60
     */


    public static Node<Integer> deleteNode(Node<Integer> head, int pos) {

        if(head == null || pos < 0){
            return head;
        }

        if(pos == 0){
            head = head.next;
            return head;
        }

        Node temp = head;

        while(--pos > 0 && temp != null && temp.next!=null){
            temp = temp.next;
        }

        if(temp != null && temp.next != null){
            temp.next = temp.next.next;
        }
        return head;
    }

    /**
     * Length of LL (recursive)
     * Send Feedback
     * Given a linked list, find and return the length of input LL recursively.
     * Input format :
     * Linked list elements (separated by space and terminated by -1)
     * Output format :
     * Length of LL
     * Sample Input :
     * 3 4 5 2 6 1 9 -1
     * Sample Output :
     * 7
     *
     */

    public static int lengthRecursive(Node<Integer> head){

        if(head == null){
            return 0;
        }
        return 1 + lengthRecursive(head.next);
    }

    /**
     * Insert node (recursive)
     * Send Feedback
     * Given a linked list, an integer n and a position i, Insert that node n into Linked List at ith position recursively.
     * If position i is greater than length of LL, then you should return the same LL without any change. And if position i is equal to length of input LL, insert the node at last position.
     * Indexing starts from 0. You don't need to print the elements, just insert and return the head of updated LL.
     * Input format :
     * Line 1 : Linked list elements (separated by space and terminated by -1)
     * Line 2 : Integer i (position)
     * Line 3 : Integer n (Node to be inserted)
     * Output format :
     * Updated LL elements (separated by space)
     * Sample Input 1 :
     * 3 4 5 2 6 1 9 -1
     * 3
     * 100
     * Sample Output 1 :
     * 3 4 5 100 2 6 1 9
     * Sample Input 2 :
     * 3 4 5 2 6 1 9 -1
     * 0
     * 20
     * Sample Output 2 :
     * 20 3 4 5 2 6 1 9
     *
     */

    public static Node<Integer> insertR(Node<Integer> head, int data, int pos){
        //base case
        if(head == null){
            return head;
        }

        //handling of position 0
        if(pos == 0){
            Node<Integer> newNode = new Node<>(data);
            newNode.next = head;
            head = newNode;
            return head;
        }

        //handing for insertion at position
        if(pos-1 == 0){
            Node<Integer> newNode = new Node<>(data);
            newNode.next = head.next;
            head.next = newNode;

            return head;
        }

        //iterate over list to reach to position
        head.next = insertR(head.next, data, pos-1);

        return head;
    }

    /**
     * Delete node (recursive)
     * Send Feedback
     * Given a linked list and a position i, delete the node of ith position from Linked List recursively.
     * If position i is greater than length of LL, then you should return the same LL without any change.
     * Indexing starts from 0. You don't need to print the elements, just delete the node and return the head of updated LL.
     * Input format :
     * Line 1 : Linked list elements (separated by space and terminated by -1)
     * Line 2 : Integer i (position)
     * Output format :
     * Updated LL elements (separated by space)
     * Sample Input 1 :
     * 3 4 5 2 6 1 9 -1
     * 3
     * Sample Output 1 :
     * 3 4 5 6 1 9
     * Sample Input 2 :
     * 3 4 5 2 6 1 9 -1
     * 0
     * Sample Output 2 :
     * 4 5 2 6 1 9
     *
     */

    public static Node<Integer> deleteIthNodeRec(Node<Integer> head, int i){
        if(head == null){
            return head;
        }
        if(i == 0){
            return head.next;
        }
        head.next = deleteIthNodeRec(head.next, i-1);
        return head;
    }

    public static void main(String [] args) {
        Node<Integer> root = null;

        root = createList();
        print(root);

        System.out.println("delete: 19");
        root = deleteIthNodeRec(root, 19);
        print(root);


        /*System.out.println("delete: 0");
        root = deleteNode(root, 0);
        print(root);
        System.out.println("delete: 10");
        root = deleteNode(root, 10);
        print(root);
        System.out.println("delete: 1");
        root = deleteNode(root, 1);
        print(root);
        System.out.println("delete: 5");
        root = deleteNode(root, 5);
        print(root);*/

        /*System.out.println("insert at 0");
        root = insertR(root, 20, 0);
        print(root);

        System.out.println("insert at 10");
        root = insertR(root, 30, 10);
        print(root);

        System.out.println("insert at 1");
        root = insertR(root, 40, 1);
        print(root);

        System.out.println("insert at 4");
        root = insertR(root, 50, 4);
        print(root);

        System.out.println("insert at 7");
        root = insertR(root, 60, 7);
        print(root);

        System.out.println("insert at 3");
        root = insertR(root, 70, 3);
        print(root);*/


        System.out.println(lengthRecursive(root));
        print(root);

    }
}
