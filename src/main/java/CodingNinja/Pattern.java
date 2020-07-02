package CodingNinja;

public class Pattern {

    static void printPattern(int num){
        int loop = 2*num -1;
        char  print = (char)('a' + num-1);

        for(int i=0; i<=loop/2; i++){
            for(int j=i*2; j<loop-1; j++){
                System.out.print(" ");
            }

            char start = print;

            for(int j=0; j<=i; j++){
                System.out.print(start-- + " ");
            }
            start++;
            for(int j=i; j>0; j--){
                System.out.print(++start + " ");
            }
            System.out.println();
        }

        for(int i=(loop/2)+1; i<loop; i++){
            for(int j = i*2; j>=loop; j--){
                System.out.print(" ");
            }

            char start = print;
            for(int j=i; j<loop; j++){
                System.out.print(start-- + " ");
            }
            start++;
            for(int j=loop-1; j>i; j-- ){
                System.out.print(++start + " ");
            }
            System.out.println();
        }
    }

    public static void main(String [] args){
        int num = 10;
        printPattern(num);
    }
}
