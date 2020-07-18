package CodingNinja.BacktrackingDynamicProgramming;

public class UglyNumber {

    static int uglyNumber(int n){
        int ugly[] = new int [n+1];

        int i2=0,i3=0,i5 = 0;

        int multipleOf2 = 2;
        int multipleOf3 = 3;
        int multipleOf5 = 5;
        int nextUglyNumber = 1;
        ugly[0] = nextUglyNumber;

        for(int i=1; i<n; i++){
            nextUglyNumber = Math.min(multipleOf2, Math.min(multipleOf3, multipleOf5));
            ugly[i] = nextUglyNumber;
            if(nextUglyNumber == multipleOf2){
                i2 = i2+1;
                multipleOf2 = ugly[i2]*2;

            }
            if(nextUglyNumber == multipleOf3){
                i3=i3+1;
                multipleOf3 = ugly[i3]*3;
            }
            if(nextUglyNumber == multipleOf5){
                i5=i5+1;
                multipleOf5 = ugly[i5]*5;
            }
        }
        return nextUglyNumber;
    }

    public static void main(String [] args){
        int n = 7;
        System.out.println(uglyNumber(n));
    }
}
