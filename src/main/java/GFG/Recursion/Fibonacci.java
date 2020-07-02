package GFG.Recursion;

public class Fibonacci {

    static long fibonacci(int n)
    {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }

        long smallAns = fibonacci(n-1) + fibonacci(n-2);
        return smallAns;
    }

    public static void main(String [] args){
        int num = 6;
        System.out.println(fibonacci(num));
    }
}
