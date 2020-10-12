package Crio.QprepJava;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListIntro {

    /**
     * Problem Description
     * There is a long queue, of size n, at the post office today. A new person joins this queue every minute,
     * and the post office is able to serve the people at the rate of 1 person per minute. However, every minute, two people from
     * the center of the queue exit because they believe they waited too long if there are more than two people in the queue, and one
     * person otherwise. How many minutes does it take for the post office to finish serving all of them?
     *
     *
     * Input format
     * The input format consists of a single number n. This is the initial size of the queue at the post office.
     *
     * Output format
     * Prints the number of minutes it would take the post office to finish serving all the people.
     *
     * Constraints
     * 0 <= n <= 100
     *
     * Sample Input
     * 28
     *
     * Sample Output
     * 14
     * @param n
     * @return
     */
    public static int numberOfMinutes(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1; i<n+1; i++){
            list.add(i);
        }

        int count = 0;

        while(list.size()>0){
            if(list.size()>=2){
                int mid = list.size()/2;
                list.remove(mid);
                list.remove(mid-1);
            }
            else {
                int mid = list.size()/2;
                list.remove(mid);
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = numberOfMinutes(n);
        System.out.print(result);
    }
}
