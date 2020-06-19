package CodingNinja;

public class CountNumberOfZeroRec {
    public static int countZerosRec(int input){
        // Write your code here
        if(input==0){
            return 0;
        }
        int smallInput = (input%10 == 0 ? 1 : 0) + countZerosRec(input/10);
        return smallInput;
    }
    public static void main(String [] args){
        int num = 102010;
        System.out.println(num);
        System.out.println(countZerosRec(num));
    }
}
