package CodeChef;

import java.util.Scanner;

public class LifeUniverseEverytihing {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        while(true){
            int num = scanner.nextInt();
            if(num==42){
                break;
            }
            else {
                System.out.println(num);
            }
        }
    }
}
