package CodingNinja;

import java.util.Scanner;

public class SumOrProduct {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int choice = scanner.nextInt();

        switch (choice){
            case 1:
                int sumOfNumber = (number * (number+1))/2;
                System.out.println(sumOfNumber);
                break;
            case 2:
                long product = 1;
                for(int i=2; i<=number; i++){
                    product*=i;
                }
                System.out.println(product);
                break;
             default:
                 System.out.println(-1);
                 break;
        }

    }
}
