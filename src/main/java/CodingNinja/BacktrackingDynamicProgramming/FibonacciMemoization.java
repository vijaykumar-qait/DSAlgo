package CodingNinja.BacktrackingDynamicProgramming;

public class FibonacciMemoization {

    public static int fibM(int n){
        int store[] = new int[n+1];
        for(int i=0; i<store.length; i++){
            store[i] = -1;
        }
        return fibM(n, store);
    }

    public static int fibM(int n, int store[]){
        if(n==0 || n==1){
            store[n] = 0;
            return store[n];
        }
        if(store[n]!=-1){
            return store[n];
        }
        store[n] = fibM(n-1, store) + fibM(n-2, store);
        return store[n];
    }

    public static void main(String [] args){

    }
}
