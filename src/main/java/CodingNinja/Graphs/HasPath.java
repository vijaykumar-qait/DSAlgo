package CodingNinja.Graphs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Code : Has Path
 * Send Feedback
 * Given an undirected graph G(V, E) and two vertices v1 and v2(as integers), check if there exists any path between them or not.
 * Print true or false.
 * V is the number of vertices present in graph G and vertices are numbered from 0 to V-1.
 * E is the number of edges present in graph G.
 * Input Format :
 * Line 1: Two Integers V and E (separated by space)
 * Next E lines : Two integers a and b, denoting that there exists an edge between vertex a and vertex b (separated by space)
 * Line (E+2) : Two integers v1 and v2 (separated by space)
 * Output Format :
 * true or false
 * Constraints :
 * 2 <= V <= 1000
 * 1 <= E <= 1000
 * 0 <= v1, v2 <= V-1
 * Sample Input 1 :
 * 4 4
 * 0 1
 * 0 3
 * 1 2
 * 2 3
 * 1 3
 * Sample Output 1 :
 * true
 * Sample Input 2 :
 * 6 3
 * 5 3
 * 0 1
 * 3 4
 * 0 3
 * Sample Output 2 :
 * false
 */
public class HasPath {

    static boolean hasPath(int edges[][], int v1, int v2, boolean isVisited[]){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(v1);
        isVisited[v1] = true;
        int n = edges.length;

        while(!queue.isEmpty()){
            int front = queue.poll();
            if(front==v2){
                return true;
            }
            for(int i=0; i<n; i++){
                if(edges[front][i] == 1 && !isVisited[i]){
                    queue.add(i);
                    isVisited[i] = true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int V = s.nextInt();
        int E = s.nextInt();

        /* Write Your Code Here
         * Complete the Rest of the Program
         * You have to take input and print the output yourself
         */
        int edges[][] = new int [V][V];

        for(int i=0; i<E; i++){
            int sv = s.nextInt();
            int ev = s.nextInt();
            edges[sv][ev] = 1;
            edges[ev][sv] = 1;
        }
        int v1 = s.nextInt();
        int v2 = s.nextInt();
        boolean visited[] = new boolean[edges.length];
        System.out.println(hasPath(edges, v1, v2, visited));
    }
}
