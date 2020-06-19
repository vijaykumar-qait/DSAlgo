package CodingNinja;

public class SumOfDigit {

    public static int sumOfDigits(int input){
        // Write your code here
        if(input<=0){
            return 0;
        }
        int smallInput = (input%10) + sumOfDigits(input/10);
        return smallInput;
    }
    public static void main(String [] args){
        int num = 1;
        System.out.println(sumOfDigits(num));
    }
}
