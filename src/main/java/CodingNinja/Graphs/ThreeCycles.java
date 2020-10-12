package CodingNinja.Graphs;

/**
 * 3 Cycle
 * Send Feedback
 * Given a graph with N vertices (numbered from 1 to N) and Two Lists (U,V) of size M where (U[i],V[i]) and (V[i],U[i]) are
 * connected by an edge , then count the distinct 3-cycles in the graph. A 3-cycle PQR is a cycle in which (P,Q), (Q,R) and (R,P)
 * are connected an edge.
 * Input Format :
 * Line 1 : Two integers N and M
 * Line 2 : List u of size of M
 * Line 3 : List v of size of M
 * Return Format :
 * The count the number of 3-cycles in the given Graph
 * Constraints :
 * 1<=N<=100
 * 1<=M<=(N*(N-1))/2
 * 1<=u[i],v[i]<=N
 * Sample Input:
 * 3 3
 * 1 2 3
 * 2 3 1
 * Sample Output:
 * 1
 */

public class ThreeCycles {
    static public int solve(int n,int m,int U[],int V[]) {
        //write your code here
        int edges[][] = new int[n+1][n+1];

        for(int i=0; i<m; i++){
            edges[U[i]][V[i]] = 1;
            edges[V[i]][U[i]] = 1;
        }
        int count = 0;

        for(int i=1; i<n+1; i++){
            for(int j=1; j<n+1; j++){
                if(edges[i][j] == 1){
                    for(int k=1; k<n+1; k++){
                        if(edges[j][k] == 1 && i!=k){
                            if(edges[i][k] == 1){
                                count++;
                            }
                        }
                    }
                }
            }
        }
        return count/6;
    }

    public static void main(String [] args){
        int n = 6;
        int m = 6;
        int u[] = {3, 3, 1, 5, 6, 4};
        int v[] = {1, 2, 2, 4, 5, 6};
        System.out.println(solve(n,m,u,v));
    }
}
