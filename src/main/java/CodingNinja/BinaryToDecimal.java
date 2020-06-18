package CodingNinja;

//input : 1100 output: 12
//input : 111 output: 7

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int binaryNum = scanner.nextInt();
        int rem = 0;
        int two = 1;
        while(binaryNum>0){
            rem = rem + (binaryNum%10)*two;
            two*=2;
            binaryNum=binaryNum/10;
        }
        System.out.println(rem);
    }
}
