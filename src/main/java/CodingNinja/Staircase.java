package CodingNinja;

public class Staircase {

    public static int staircase(int n){

        if(n == 0){
            return 1;
        }
        else if(n<0){
            return 0;
        }

        int smallAns = staircase(n-1);
        int smallAns1 = smallAns + staircase(n-2);
        int smallAns2 = smallAns1 + staircase(n-3);

        return smallAns2;
    }

    public static void main(String [] args){
        System.out.println(staircase(44));
    }
}
