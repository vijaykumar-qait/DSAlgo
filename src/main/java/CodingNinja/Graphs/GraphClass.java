package CodingNinja.Graphs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GraphClass {

    private static void printHelperDFS(int edges[][], int sv, boolean visited[]){
        System.out.println(sv);
        visited[sv] = true;
        int n = edges.length;
        for(int i=0; i<n; i++){
            if(edges[sv][i]==1 && !visited[i]){
                printHelperDFS(edges, i, visited);
            }
        }
    }

    public static void printDFS(int [][] edges, int sv){
        boolean isVisited[] = new boolean[edges.length];
        printHelperDFS(edges, sv, isVisited);
    }

    /**
     * Code : BFS Traversal
     * Send Feedback
     * Given an undirected and disconnected graph G(V, E), print its BFS traversal.
     * Here you need to consider that you need to print BFS path starting from vertex 0 only.
     * V is the number of vertices present in graph G and vertices are numbered from 0 to V-1.
     * E is the number of edges present in graph G.
     * Note : 1. Take graph input in the adjacency matrix.
     * 2. Handle for Disconnected Graphs as well
     * Input Format :
     * Line 1: Two Integers V and E (separated by space)
     * Next 'E' lines, each have two space-separated integers, 'a' and 'b', denoting that there exists an edge between Vertex 'a'
     * and Vertex 'b'.
     * Output Format :
     * BFS Traversal (separated by space)
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
     * 0 1 3 2
     * @param edges
     * @param sv
     * @param isVisited
     */

    public static void printHelperBFS(int [][] edges, int sv, boolean [] isVisited){
        int n = edges.length;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(sv);
        while(!queue.isEmpty()){
            int front = queue.poll();
            if(!isVisited[front]){
                System.out.print(front + " ");
            }
            isVisited[front] = true;
            for(int i=0; i<n; i++){
                if(edges[front][i] == 1 && !isVisited[i]){
                    queue.add(i);
                }
            }
        }
    }

    public static void printBFS(int [][] edges, int sv){
        boolean isVisited[] = new boolean[edges.length];
        for(int i=0; i<edges.length; i++){
            printHelperBFS(edges, i, isVisited);
        }
    }

    public static void main(String [] args){
        int n;
        int e;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        e = scanner.nextInt();

        int edges[][] = new int[n][n];

        for(int i=0; i<e; i++){
            int fv = scanner.nextInt();
            int sv = scanner.nextInt();
            edges[fv][sv]=1;
            edges[sv][fv]=1;
        }

        printDFS(edges, 0);
        System.out.println();
        printBFS(edges, 0);
    }
}
