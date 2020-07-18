package CodingNinja.OOPS;

import java.util.Scanner;

public class PolynomialUse {
    public static void main(String [] args){
//        Polynomial polynomial = new Polynomial();
//        polynomial.setCoefficient(0,4);
//        polynomial.setCoefficient(10,10);
//        polynomial.print();
//
//        Polynomial p2 = new Polynomial();
//        p2.setCoefficient(1,5);
//        p2.setCoefficient(2,2);
//        p2.print();
//
//        Polynomial p3 = polynomial.add(p2);
//        p3.print();
//
//        Polynomial p4 = polynomial.subtract(p2);
//        p4.print();
//
//        Polynomial p5 = polynomial.multiply(p2);
//        p5.print();


        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int degree1[] = new int[n];
        for(int i = 0; i < n; i++){
            degree1[i] = s.nextInt();
        }
        int coeff1[] = new int[n];
        for(int i = 0; i < n; i++){
            coeff1[i] = s.nextInt();
        }
        Polynomial first = new Polynomial();
        for(int i = 0; i < n; i++){
            first.setCoefficient(degree1[i],coeff1[i]);
        }
        n = s.nextInt();
        int degree2[] = new int[n];
        for(int i = 0; i < n; i++){
            degree2[i] = s.nextInt();
        }
        int coeff2[] = new int[n];
        for(int i = 0; i < n; i++){
            coeff2[i] = s.nextInt();
        }
        Polynomial second = new Polynomial();
        for(int i = 0; i < n; i++){
            second.setCoefficient(degree2[i],coeff2[i]);
        }
        int choice = s.nextInt();
        Polynomial result;
        switch(choice){
            // Add
            case 1:
                result = first.add(second);
                result.print();
                break;
            // Subtract
            case 2 :
                result = first.subtract(second);
                result.print();
                break;
            // Multiply
            case 3 :
                result = first.multiply(second);
                result.print();
                break;
        }

    }
}
