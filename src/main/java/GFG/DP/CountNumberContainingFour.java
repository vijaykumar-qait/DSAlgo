package GFG.DP;

public class CountNumberContainingFour {

    /**
     * Count the numbers between 1 to N containing 4 as a digit.
     *
     * Input:
     * Each line will contain the number of test cases T.Each test case will contain a number N.
     *
     * Output:
     * Print the count of numbers for each test case in a separate line.
     *
     * Constraints:
     * 1<=T<=100
     * 1<=N<=106
     *
     * Example:
     * Input:
     * 2
     * 9
     * 3
     *
     * Output:
     * 1
     * 0
     */
    static int numberOfDigit(int num, int digit){
        int count = 0;
        while(num>0){
            count+=num%10==digit?1:0;
            num/=10;
        }
        return count;
    }

    static int countFour(int num, int i){
        if(num<4){
            return 0;
        }
        if(i>num){
            return 0;
        }

        int count = numberOfDigit(i,4);
        count+= countFour(num, i+10);
        return count;
    }

    public static void main(String [] args){
        int num = 54;
        int digit = 4;
        System.out.println(countFour(num, digit));
    }

}
