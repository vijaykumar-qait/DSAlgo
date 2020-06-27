package GFG.Math;

public class DigitsInFactorial {

//    static long factorial(long num){
//        if(num==0){
//            return 1;
//        }
//        long smallAns = num*factorial(num-1);
//        return smallAns;
//    }

    /**
     * Hints
     * When you need to calculate the digits of some number X. You do 10k=X. As 10 to power k tells us the k(digits).
     * The above point can easily be understood if you see that 104=10000 has (4+1) digits.
     *
     * Let's take 10!=10x to get the value of x.
     *
     * Take log both sides log(10)!=xlog10
     *
     * log(10*9*8*..*1)=x
     *
     * log10+log9+log8+...+log1=x
     *
     * Take the floor of sum and add 1 to get the number of digits.
     */

    static int digitCountOfFactorial(int num){
        double count=0;
        for(int i=1; i<=num; i++){
            //System.out.println("i: " + i + " sum: " + count);
            count= count + Math.log10(i);
        }
        return (int)Math.floor(count+1);
    }

    public static void main(String [] args){
        int num = 120;
        System.out.println(digitCountOfFactorial(num));
    }
}
