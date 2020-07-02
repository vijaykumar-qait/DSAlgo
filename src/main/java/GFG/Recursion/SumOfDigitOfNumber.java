package GFG.Recursion;

public class SumOfDigitOfNumber {

    static int sumOfDigits(int n)
    {
        if(n==0){
            return 0;
        }
        int smallAns = n%10;
        return smallAns + sumOfDigits(n/10);
    }

    public static void main(String [] args){
        System.out.println(sumOfDigits(99999));
    }
}
