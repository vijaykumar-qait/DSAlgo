package GFG.Math;

public class QuadraticRoots {

    static void quadraticRoots(int a,int b, int c)
    {
        if(b*b > 4*a*c){

            double sqrt = Math.sqrt((b*b) - 4*a*c);
            double twiceA = 2*a;
            double bVal = -b/(twiceA);

            double root1 = bVal + (sqrt/twiceA);
            double root2 = bVal - (sqrt/twiceA);
            System.out.println((int)root1 + " " + (int)root2);
        }
        else if(b*b == 4*a*c){
            int root1 = (-b + (int)Math.sqrt(b*b-4*a))/2*a;
            System.out.println(root1 + " " + root1);
        }
        else {
            System.out.println("Imaginary");
        }
    }

    public static void main(String [] args){
        int a = 2;
        int b = 8;
        int c = 8;
        quadraticRoots(a,b,c);
    }
}
