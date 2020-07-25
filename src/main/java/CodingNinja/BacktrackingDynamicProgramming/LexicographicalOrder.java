package CodingNinja.BacktrackingDynamicProgramming;

public class LexicographicalOrder {

    /**
     * Lexicographical Order
     * Send Feedback
     * Given a number n, print numbers from 1 to n in dictionary(lexicographical) order.
     * Sample Input
     * 20
     * Sample Output
     * 1
     * 10
     * 11
     * 12
     * 13
     * 14
     * 15
     * 16
     * 17
     * 18
     * 19
     * 2
     * 20
     * 3
     * 4
     * 5
     * 6
     * 7
     * 8
     * 9
     */

    /*public static void lexicographicalOrder(int print, int num){
        if(print>num){
            return;
        }
        if(print%10==9 && print!=9){
            System.out.println(print);
            return;
        }
        System.out.println(print);
        lexicographicalOrder(print*10, num);
        lexicographicalOrder(print+1, num);
    }*/

    /*public static void lexicographicalOrder(int i, int num){
        if(i>num){
            return;
        }

        for(int j=0; j<10; j++){
            System.out.println(i+j);
            lexicographicalOrder((i*10), num);
        }
    }*/

    static void rec(int a,int num)
    {
        if(num>a)
            return;

        System.out.println(num);

        for(int i=0;i<=9;i++)
        {
            num=num*10+i;

            rec(a,num);
            num=(num-i)/10;
        }
    }

    public static void lexicographicalOrder(int num){

        for(int i=1;i<=9;i++)
            rec(num,i);

        //lexicographicalOrder(1, num);
    }

    public static void main(String [] args){
        int num = 99;
        lexicographicalOrder(num);
    }
}
