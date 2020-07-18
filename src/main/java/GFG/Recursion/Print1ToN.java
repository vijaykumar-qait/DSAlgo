package GFG.Recursion;

import java.util.Scanner;

public class Print1ToN {
    static void printNos(int N, int i)
    {
        if(i==N){
            System.out.println(N);
            return;
        }
        System.out.print(i + " ");
        printNos(N, i+1);
    }

    static void printNos(int N)
    {
        printNos(N,1);
    }

    public static void main(String[] args){
        int num = 10;
        printNos(num);
        submit();
    }

    public static void submit(){
        Scanner scanner = new Scanner(System.in);
        int testcases = scanner.nextInt();
        for(int i=0; i<testcases; i++){
            int times = scanner.nextInt();
            printNos(times);
        }
    }
}
