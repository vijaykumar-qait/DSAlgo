package CodingNinja;

import java.util.Scanner;

public class SquareRootPrac {
    public static void main(String []  args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sqrt = 2;
        while (true){
            long sqrtNum = sqrt*sqrt;
            if(sqrtNum==num){
                System.out.println(sqrt);
                break;
            }
            else if(sqrtNum>num){
                System.out.println(sqrt-1);
                break;
            }
            else{
                sqrt++;
            }
        }
    }
}
