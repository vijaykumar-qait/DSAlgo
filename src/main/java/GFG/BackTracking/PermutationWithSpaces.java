package GFG.BackTracking;

import java.util.Scanner;

public class PermutationWithSpaces {

    public static void permutationWithSpaces(String str, String output){
        if(str.length()==0){
            System.out.print("("+output.trim()+") ");
            return;
        }
        for(int i=1; i<=str.length(); i++){
            permutationWithSpaces(str.substring(i), output+str.substring(0,i)+" ");
        }
    }

    public static void main(String args[]){
//        String str = "ABCD";
//        permutationWithSpaces(str, "");

        Scanner scanner = new Scanner(System.in);
        int times = scanner.nextInt();
        scanner.nextLine();
        for(int i=0; i<times; i++){
            String string = scanner.nextLine();
            permutationWithSpaces(string, "");
            System.out.println();
        }
    }
}
