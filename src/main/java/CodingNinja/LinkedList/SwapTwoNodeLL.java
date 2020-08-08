package CodingNinja.LinkedList;

import java.util.Scanner;

public class SwapTwoNodeLL {
    /**
     * Swap two Node of LL
     * Send Feedback
     * Given a linked list, i & j, swap the nodes that are present at i & j position in the LL. You need to swap the entire nodes, not just the data.
     * Indexing starts from 0. You don't need to print the elements, just swap and return the head of updated LL.
     * Assume i & j given will be within limits. And i can be greater than j also.
     * Input format :
     *
     * Line 1 : Linked list elements (separated by space and terminated by -1)
     *
     * Line 2 : i and j (separated by space)
     *
     * Sample Input 1 :
     * 3 4 5 2 6 1 9 -1
     * 3 4
     * Sample Output 1 :
     * 3 4 5 6 2 1 9
     * Sample Input 2 :
     * 3 4 5 2 6 1 9 -1
     * 2 4
     * Sample Output 2 :
     * 3 4 6 2 5 1 9
     */

    public static  Node<Integer> swap_nodes(Node<Integer> head,int i,int j){
        if(head == null || head.next == null || i==j){
            return head;
        }

        if((i==0 || j==0) && Math.abs(i-j)!=1){
            if(j==0){
                j=i;
                i=0;
            }

            Node<Integer> currenti = head;
            Node<Integer> nexti = head.next;
            Node<Integer> prevj = head;
            Node<Integer> currentj = null;

            while(j-1 != 0){
                prevj = prevj.next;
                j--;
            }
            currentj = prevj.next;

            prevj.next = currenti;
            currenti.next = currentj.next;
            currentj.next = nexti;
            head = currentj;
            return head;
        }

        if((i==0 || j==0) && Math.abs(i-j) == 1){
            if(j==0){
                j = i;
            }
            Node<Integer> currenti = head;
            Node<Integer> currentj = head.next;

            currenti.next = currentj.next;
            currentj.next = currenti;
            head = currentj;
            return head;
        }

        if(i>j){
            int temp = i;
            i = j;
            j = temp;
        }

        if(Math.abs(i-j) == 1){
            Node<Integer> previousi = head;
            Node<Integer> currenti = null;
            Node<Integer> currentj = head;

            while(i-1 != 0){
                previousi = previousi.next;
                i--;
            }
            currenti = previousi.next;


            while(j != 0){
                currentj = currentj.next;
                j--;
            }

            currenti.next = currentj.next;
            currentj.next = currenti;
            previousi.next = currentj;
            return  head;
        }

        Node<Integer> previousi = head;
        Node<Integer> currenti = null;
        Node<Integer> previousj = head;
        Node<Integer> currentj = null;
        Node<Integer> currentiNext = null;

        while(i-1 != 0){
            previousi = previousi.next;
            i--;
        }
        currenti = previousi.next;
        currentiNext = currenti.next;

        while(j-1 != 0){
            previousj = previousj.next;
            j--;
        }
        currentj = previousj.next;

        previousi.next = currentj;
        previousj.next = currenti;
        currenti.next = currentj.next;
        currentj.next = currentiNext;

        return head;
    }

    public static void main(String [] args){
        Node<Integer> root = null;

        root = LinkedListUsage.createList();
        LinkedListUsage.print(root);

        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int j = scanner.nextInt();

        root = swap_nodes(root, i, j);
        LinkedListUsage.print(root);
    }


}
