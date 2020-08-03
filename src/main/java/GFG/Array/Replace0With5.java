package GFG.Array;

import java.util.Scanner;

public class Replace0With5 {

    static int replace0with5(int num){
        String number = String.valueOf(num);
        if(!number.contains("0")){
            return Integer.valueOf(number);
        }

        while(number.contains("0")){
            number = number.replace('0', '5');
        }
        return Integer.valueOf(number);
    }

    static int replace0with5Method2(int num){
        String number = String.valueOf(num);
        if(!number.contains("0")){
            return Integer.valueOf(number);
        }

        while(number.contains("0")){
            number = number.replace('0', '5');
        }
        return Integer.valueOf(number);
    }

    public static void main(String [] args){
//        int number = 121;
//        replace0with5(number);

        Scanner scanner = new Scanner(System.in);
        int testcases = scanner.nextInt();

        for(int i=0; i<testcases; i++){
            int number = scanner.nextInt();
            replace0with5(number);
        }
    }
}
