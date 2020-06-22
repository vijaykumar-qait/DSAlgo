package CodingNinja;

public class RecursiveMultiply {
    public static int multiplyTwoIntegers(int m, int n){
        // Write your code here
        if(n==0) {
            return 0;
        }
        if(n==1){
            return m;
        }

        int smallSum = m + multiplyTwoIntegers(m, n-1);
        return smallSum;

    }

    public static void main(String [] args){
        System.out.println(multiplyTwoIntegers(3,0));
    }
}
