package CodingNinja;

public class RemoveDuplicateRecursively {
    public static String removeConsecutiveDuplicates(String s) {
        // Write your code here
        if(s.length() <= 1){
            return s;
        }

        String smallString = s.charAt(0)!=s.charAt(1) ? (""+s.charAt(0)) : "";
        return smallString + removeConsecutiveDuplicates(s.substring(1));
    }

    public static void main(String [] args){
        String s = "aabbcddaa";
        System.out.println(removeConsecutiveDuplicates(s));
    }
}
