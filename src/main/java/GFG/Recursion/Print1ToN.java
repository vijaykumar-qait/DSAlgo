package GFG.Recursion;

public class Print1ToN {
    static void printNos(int N, int i)
    {
        if(i==N){
            System.out.println(N);
            return;
        }
        System.out.println(i);
        printNos(N, i+1);
    }

    static void printNos(int N)
    {
        printNos(N,1);
    }

    public static void main(String[] args){
        int num = 10;
        printNos(num);
    }
}
