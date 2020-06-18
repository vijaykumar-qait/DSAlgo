package CodingNinja;

import java.util.Scanner;

public class SumArray {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int sum=0;
        for(int i=0; i<input; i++){
            int num = scanner.nextInt();
            sum+=num;
        }

    }
}
