package CodingNinja.LinkedList;

import java.util.Scanner;

public class PalindromeLinkedList {
    /**
     * Palindrome LinkedList
     * Send Feedback
     * You have been given a head to a singly linked list of integers. Write a function check to whether the list given is a 'Palindrome' or not.
     *  Input format :
     * The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
     *
     * First and the only line of each test case or query contains the the elements of the singly linked list separated by a single space.
     *  Remember/Consider :
     * While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element.
     *  Output format :
     * For each test case, the only line of output that print 'true' if the list is Palindrome or 'false' otherwise.
     *  Constraints :
     * 1 <= t <= 10^2
     * 0 <= M <= 10^5
     * Time Limit: 1sec
     *
     * Where 'M' is the size of the singly linked list.
     * Sample Input 1 :
     * 1
     * 9 2 3 3 2 9 -1
     * Sample Output 1 :
     * true
     * Sample Input 2 :
     * 2
     * 0 2 3 2 5 -1
     * -1
     * Sample Output 2 :
     * false
     * true
     * Explanation for the Sample Input 2 :
     * For the first query, it is pretty intuitive that the the given list is not a palindrome, hence the output is 'false'.
     *
     * For the second query, the list is empty. An empty list is always a palindrome , hence the output is 'true'.
     */

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

    private static Node<Integer> reverse(Node<Integer> head){
        if(head == null || head.next == null){
            return head;
        }

        Node<Integer> ptr = head;
        Node<Integer> nextPtr = head;
        Node<Integer> prevPtr = null;

        while(nextPtr != null){
            nextPtr = nextPtr.next;
            ptr.next = prevPtr;
            prevPtr = ptr;
            ptr = nextPtr;
        }
        head = prevPtr;
        return head;
    }

    public static boolean isPalindrome(Node<Integer> head) {
        //case when list is empty or only one node is present
        if(head == null || head.next == null){
            return true;
        }

        Node<Integer> slowPtr = head;
        Node<Integer> fastPtr = head;

        while(fastPtr != null && fastPtr.next != null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
        }

        Node<Integer> head2 = null;

        //fastPtr == null the list is even
        if(fastPtr == null){
            head2 = reverse(slowPtr);
        }
        //list is odd
        else {
            head2 = reverse(slowPtr.next);
        }

        Node<Integer> ptr1 = head;
        Node<Integer> ptr2 = head2;

        while(ptr1 != null && ptr2 != null){
            if(ptr1.data != ptr2.data){
                return false;
            }
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        return true;
    }

    public static void main(String [] args){
        Node<Integer> root = null;

        root = createList();
        print(root);

        System.out.println(isPalindrome(root));
    }
}
