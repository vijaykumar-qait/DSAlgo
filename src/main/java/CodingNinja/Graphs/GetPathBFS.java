package CodingNinja.Graphs;


import java.util.*;

/**
 * Code : Get Path - BFS
 * Send Feedback
 * Given an undirected graph G(V, E) and two vertices v1 and v2(as integers), find and print the path from v1 to v2 (if exists).
 * Print nothing if there is no path between v1 and v2.
 * Find the path using BFS and print the shortest path available.
 * V is the number of vertices present in graph G and vertices are numbered from 0 to V-1.
 * E is the number of edges present in graph G.
 * Print the path in reverse order. That is, print v2 first, then intermediate vertices and v1 at last.
 * Note : Save the input graph in Adjacency Matrix.
 * Input Format :
 * Line 1: Two Integers V and E (separated by space)
 * Next E lines : Two integers a and b, denoting that there exists an edge between vertex a and vertex b (separated by space)
 * Line (E+2) : Two integers v1 and v2 (separated by space)
 * Output Format :
 * Path from v1 to v2 in reverse order (separated by space)
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
 * 3 0 1
 * Sample Input 2 :
 * 6 3
 * 5 3
 * 0 1
 * 3 4
 * 0 3
 * Sample Output 2 :
 */

public class GetPathBFS {

    static ArrayList<Integer> getPathBFS(int [][] edges, int sv, int ev, boolean visited[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(sv);
        visited[sv] = true;
        int n = edges.length;
        ArrayList<Integer> list = null;
        int num = Integer.MIN_VALUE;

        boolean flag = true;

        while(!queue.isEmpty() && flag){
            int front = queue.poll();

            for(int i=0; i<n; i++){
                if(edges[front][i] == 1 && !visited[i]){
                    if(i==ev){
                        list = new ArrayList<>();
                        list.add(i);
                        list.add(front);
                        num = front;
                        flag = false;
                        break;
                    }
                    map.put(i, front);
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }

        if(list == null){
            return list;
        }
        while (num != sv){
            list.add(map.get(num));
            num = map.get(num);
        }
        return list;
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
        int sv = s.nextInt();
        int ev = s.nextInt();
        boolean visited[] = new boolean[V];
        ArrayList<Integer> list = getPathBFS(edges, sv, ev, visited);
        for(int i=0; list!=null && i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }

    }
}
