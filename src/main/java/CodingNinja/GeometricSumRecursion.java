package CodingNinja;

public class GeometricSumRecursion {

    public static double findGeometricSum(double num, int times, int k){
        if(times == k){
            return Math.pow(num, k);
        }

        double smallAns = Math.pow(num, times);
        return smallAns + findGeometricSum(num, times+1, k);
    }

    public static double findGeometricSum(int k){
        // Write your code here
        return findGeometricSum(0.5, 0, k);
    }

    public static void main(String [] args){
        System.out.println(findGeometricSum(3));
    }
}
