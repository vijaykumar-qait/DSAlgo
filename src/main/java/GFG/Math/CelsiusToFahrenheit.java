package GFG.Math;

public class CelsiusToFahrenheit {
    static double cToF(int C)
    {
        double constant= (double)9/5;
        System.out.println(constant);
        return (constant*C) + 32;
    }

    public static void main(String args[]){
        int c = 1;
        System.out.println(cToF(c));
    }
}
