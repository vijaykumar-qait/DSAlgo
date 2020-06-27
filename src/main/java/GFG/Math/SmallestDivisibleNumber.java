package GFG.Math;

public class SmallestDivisibleNumber {

    static int gcd(int a, int b){
        if(a == 0){
            return b;
        }
        return gcd(b%a, a);
    }

    static int lcm(int a, int b){
        return a*b/gcd(a,b);
    }

    public static void main(String [] args){
        int num = 0;
        int smallestDivisibleNumber = num<2?num:2;
        for(int i=3; i<=num; i++){
            smallestDivisibleNumber = lcm(smallestDivisibleNumber, i);
        }
        System.out.print(smallestDivisibleNumber);
    }
}
