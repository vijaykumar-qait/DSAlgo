package CodingNinja;

import java.util.Scanner;

public class TermOfAP {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int index = 1;
        while(num>0){
            int an = 3*index + 2;

            if(!(an%4==0)){
                System.out.print(an + " ");
                num--;
            }
            index++;
        }

    }
}
