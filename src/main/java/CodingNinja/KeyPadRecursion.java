package CodingNinja;

import java.util.Arrays;

public class KeyPadRecursion {

    public static String [] getChar(int num){
        String [] charArr={""};
        switch (num){
            case 2:
                charArr = new String[] {"a", "b", "c"};
                break;
            case 3:
                charArr = new String[] {"d", "e", "f"};
                break;
            case 4:
                charArr = new String[] {"g", "h", "i"};
                break;
            case 5:
                charArr = new String[] {"j", "k", "l"};
                break;
            case 6:
                charArr = new String[] {"m", "n", "o"};
                break;
            case 7:
                charArr = new String[] {"p", "q", "r", "s"};
                break;
            case 8:
                charArr = new String[] {"t", "u", "v"};
                break;
            case 9:
                charArr = new String[] {"w", "x", "y", "z"};
                break;
        }
        return charArr;
    }

    public static String[] keypad(int n){
        if(n == 0){
            String strArr[] = {""};
            return strArr;
        }
        int currentNum = n%10;
        String smallAns[] = keypad(n/10);
        String charArr[] = getChar(currentNum);
        String ansArr[] = new String[smallAns.length*charArr.length];


        int k=0;
        for(String str: smallAns){
            for(String character : charArr){
                ansArr[k++] = str+character;
            }
        }
        return ansArr;
    }

    public static void main(String [] args){
        System.out.println(Arrays.toString(keypad(239)));
    }
}
