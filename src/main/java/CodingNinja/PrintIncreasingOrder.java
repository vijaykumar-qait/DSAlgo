package CodingNinja;

public class PrintIncreasingOrder {

    public static void printIncreasingNumber(int n, String prefix, int j){
        if(n==0){
            System.out.print(prefix + " ");
            return;
        }
        for(int i=j+1; i<10; i++){
            String newPrefix = prefix + i;
            printIncreasingNumber(n-1, newPrefix, i);
        }
    }

    public static void printIncreasingNumber(int n) {
        printIncreasingNumber(n, "", 0);
    }

    public static void main(String [] args){
        int num = 1;
        printIncreasingNumber(num);
    }
}
