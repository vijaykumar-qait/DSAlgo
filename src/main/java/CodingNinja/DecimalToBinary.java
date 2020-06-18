package CodingNinja;

import java.util.Scanner;

public class DecimalToBinary {

    static void DecimalToBinary(int num){
        StringBuilder stringBuilder = new StringBuilder();
        while(num>0){
            int rem = num%2;
            stringBuilder.append(rem);
            num/=2;
        }
        String binary = stringBuilder.reverse().toString();
        System.out.println(binary.equals("")?"0":binary);
    }

    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        DecimalToBinary(num);
    }
}
