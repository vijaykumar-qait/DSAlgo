package CodingNinja.Graphs;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Code : Is Connected ?
 * Send Feedback
 * Given an undirected graph G(V,E), check if the graph G is connected graph or not.
 * V is the number of vertices present in graph G and vertices are numbered from 0 to V-1.
 * E is the number of edges present in graph G.
 * Input Format :
 * Line 1: Two Integers V and E (separated by space)
 * Next 'E' lines, each have two space-separated integers, 'a' and 'b', denoting that there exists an edge between Vertex 'a'
 * and Vertex 'b'.
 * Output Format :
 * "true" or "false"
 * Constraints :
 * 2 <= V <= 1000
 * 1 <= E <= 1000
 * Sample Input 1:
 * 4 4
 * 0 1
 * 0 3
 * 1 2
 * 2 3
 * Sample Output 1:
 * true
 * Sample Input 2:
 * 4 3
 * 0 1
 * 1 3
 * 0 3
 * Sample Output 2:
 * false
 * Sample Output 2 Explanation
 * The graph is not connected, even though vertices 0,1 and 3 are connected to each other but there isn’t any path from
 * vertices 0,1,3 to vertex 2.
 */

public class IsConnected {

    static void isConnected(int [][]edges, int sv, boolean isVisited[]){
        isVisited[sv] = true;
        int n = edges.length;
        for(int i=0; i<n; i++){
            if(edges[sv][i] == 1 && !isVisited[i]){
                isConnected(edges, i, isVisited);
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int V = s.nextInt();
        int E = s.nextInt();

        /* Write Your Code Here
         * Complete the Rest of the Program
         * You have to take input and print the output yourself
         */
        int edges[][] = new int[V][V];
        for(int i=0; i<E; i++){
            int sv = s.nextInt();
            int ev = s.nextInt();
            edges[sv][ev] = 1;
            edges[ev][sv] = 1;
        }
        boolean visited[] = new boolean[V];
        isConnected(edges, 0, visited);
        boolean flag = true;
        for(int i=0; i<visited.length; i++){
            if(!visited[i]){
                flag = false;
            }
        }
        System.out.println(flag);
    }
}
