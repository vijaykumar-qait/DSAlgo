package Crio.QprepJava;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        byte a = sc.nextByte();
        short b = sc.nextShort();
        int c = sc.nextInt();
        long d = sc.nextLong();

        DataTypes dataTypes = new DataTypes();

        byte byteRes = dataTypes.calc_square(a);
        short shortRes = dataTypes.calc_square(b);
        int intRes = dataTypes.calc_square(c);
        long longRes = dataTypes.calc_square(d);

        System.out.println("Square of the number is: " + byteRes);
        System.out.println("Square of the number is: " + shortRes);
        System.out.println("Square of the number is: " + intRes);
        System.out.println("Square of the number is: " + longRes);
    }

    // TODO
    // Complete the methods below
    // Hint: Some of the methods require typecasting otherwise you will get an error.

    byte calc_square(byte a) {
        return (byte)(a*a);
    }

    short calc_square(short b) {
        return (short) (b*b);
    }

    int calc_square(int c) {
        return (int)c*c;
    }

    long calc_square(long d) {
        return (long)d*d;
    }
}
