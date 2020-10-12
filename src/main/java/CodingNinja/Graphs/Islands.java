package CodingNinja.Graphs;

import java.util.ArrayList;

/**
 * Islands
 * Send Feedback
 * An island is a small piece of land surrounded by water . A group of islands is said to be connected if we can reach
 * from any given island to any other island in the same group . Given N islands (numbered from 1 to N) and two lists of size
 * M (u and v) denoting island u[i] is connected to island v[i] and vice versa . Can you count the number of connected groups of
 * islands.
 * Constraints :
 * 1<=N<=100
 * 1<=M<=(N*(N-1))/2
 * 1<=u[i],v[i]<=N
 * Input Format :
 * Line 1 : Two integers N and M
 * Line 2 : List u of size of M
 * Line 3 : List v of size of M
 * Output Return Format :
 * The count the number of connected groups of islands
 * Sample Input :
 * 2 1
 * 1
 * 2
 * Sample Output :
 * 1
 */

public class Islands {

    static void helperConnect(int edges[][], int n, int sv, boolean [] visited, ArrayList<Integer> list){
        if(!visited[sv]){
            visited[sv] = true;
            list.add(sv);
        }
        for(int i=1; i<n+1; i++){
            if(edges[sv][i] == 1 && !visited[i]){
                helperConnect(edges, n, i, visited, list);
            }
        }

    }

    static public int solve(int n,int m,int U[],int V[]) {
        int edges[][] = new int[n+1][n+1];
        for(int i=0; i<m; i++){
            edges[U[i]][V[i]] = 1;
            edges[V[i]][U[i]] = 1;
        }
        int count = 0;
        boolean [] visited = new boolean[n+1];

        for(int i=1; i<n+1; i++){
            if(!visited[i]){
                ArrayList<Integer> list = new ArrayList<>();
                helperConnect(edges, n, i, visited, list);
                if(list.size()>0){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String [] args){
        int n = 6;
        int m = 6;
        int u[] = {3 ,3 ,1 ,5 ,6 ,4 };
        int v[] = {1 ,2 ,2 ,4 ,5 ,6};
        System.out.println(solve(n,m,u,v));

    }
}
