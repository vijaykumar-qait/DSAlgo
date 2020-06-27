package GFG.Math;

public class AdditionUnderModulo {
    public static long sumUnderModulo(long a, long b)
    {
        int M=1000000007;
        long aMod = a%M;
        long bMod = b%M;
        return (aMod + bMod)%M;
    }
    public static void main(String [] args){
        //long a = 9223372036854775807L;
        //long b = 9223372036854775807L;

        long a = 8279685334796349382L;
        long b = 3890369874501826197L;

        System.out.println(sumUnderModulo(a, b));
    }
}
