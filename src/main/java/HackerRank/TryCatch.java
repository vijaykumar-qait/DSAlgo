package HackerRank;

import java.util.InputMismatchException;
import java.util.Scanner;


public class TryCatch {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        try {
            int a = scan.nextInt();
            int b = scan.nextInt();
            System.out.println(a/b);
        }
        catch (InputMismatchException e) {
            System.out.println(e.getClass().getName());
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
