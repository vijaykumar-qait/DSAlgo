package CodingNinja.Graphs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Code : All connected components
 * Send Feedback
 * Given an undirected graph G(V,E), find and print all the connected components of the given graph G.
 * V is the number of vertices present in graph G and vertices are numbered from 0 to V-1.
 * E is the number of edges present in graph G.
 * You need to take input in main and create a function which should return all the connected components. And then print
 * them in the main, not inside function.
 * Print different components in new line. And each component should be printed in increasing order (separated by space).
 * Order of different components doesn't matter.
 * Input Format :
 * Line 1: Two Integers V and E (separated by space)
 * Next 'E' lines, each have two space-separated integers, 'a' and 'b', denoting that there exists an edge between Vertex 'a'
 * and Vertex 'b'.
 * Output Format :
 * Different components in new line
 * Constraints :
 * 2 <= V <= 1000
 * 1 <= E <= 1000
 * Sample Input 1:
 * 4 2
 * 0 1
 * 2 3
 * Sample Output 1:
 * 0 1
 * 2 3
 * Sample Input 2:
 * 4 3
 * 0 1
 * 1 3
 * 0 3
 * Sample Output 2:
 * 0 1 3
 * 2
 */

public class AllConnectedComponents {

    private static ArrayList<Integer> connectedComponentHelper(int [][] edges, int sv, boolean [] visited, ArrayList<Integer> list){
        if(!visited[sv]){
            visited[sv] = true;
            list.add(sv);
        }
        int n = edges.length;
        for(int i=0; i<n; i++){
            if(edges[sv][i] == 1 && !visited[i]){
                connectedComponentHelper(edges, i, visited, list);
            }
        }
        return list;
    }

    public static void connectedComponent(int [][] edges){
        int n = edges.length;
        boolean visited[] = new boolean[n];

        for(int i=0; i<n; i++){
            ArrayList<Integer> list = new ArrayList<>();
            connectedComponentHelper(edges, i, visited, list);
            if(list.size()>0){
                Collections.sort(list);
                for(int j=0; j<list.size(); j++){
                    System.out.print(list.get(j) + " ");
                }
                System.out.println();
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
        connectedComponent(edges);
    }

}
