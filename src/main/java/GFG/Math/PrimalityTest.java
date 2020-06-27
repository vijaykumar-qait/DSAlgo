package GFG.Math;

public class PrimalityTest {

    public static boolean isPrime(int N)
    {
        for(int i=2; i<Math.floor(Math.sqrt(N))+1; i++){
            if(N%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String args []){
        int num = 4;
        System.out.println(isPrime(num));
    }
}
