package Crio.QprepJava;

import java.util.Scanner;

public class Exceptions {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double a, b;
        a = sc.nextDouble();
        b = sc.nextDouble();
        String ans = Exceptions(a, b);
        System.out.println(ans);

    }
    public static String Exceptions(double a, double b) {
        // TODO
        // Hint:
        // 1. Read on how to use the try-catch block.
        // 2. Check the `getMessage()` method in Exception object when you divide by 0.

        try{
            String str = Double.toString(a/b);
            return str;
        }
        catch (Exception e){
            return e.getMessage();
        }
    }
}
