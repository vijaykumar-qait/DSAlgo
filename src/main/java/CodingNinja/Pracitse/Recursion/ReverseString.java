package CodingNinja.Pracitse.Recursion;

public class ReverseString {

    public static String reverseString(String str){
        if(str.length()==1){
            return str;
        }
        String smallString = reverseString(str.substring(1));
        return smallString + str.charAt(0);
    }

    public static void main(String [] args){
        String str = "abc";
        System.out.println(reverseString(str));
    }
}
