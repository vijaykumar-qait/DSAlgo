package CodeChef;

import java.util.Scanner;

public class ReverseTheNumber {

    public static void reverse(int num){
        int rev=0;
        while(num>0){
            int rem = num%10;
            rev = rev*10 + rem;
            num/=10;
        }
        System.out.println(rev);
    }

    public static void main(String [] args){
        try {
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            int arrInput[] = new int [input];
            for(int i=0; i<input; i++){
                arrInput[i] = scanner.nextInt();
            }

            for(int i=0; i<input; i++){
                reverse(arrInput[i]);
            }
        }
        catch (Exception e){

        }


    }
}
