package CodingNinja.Pracitse.Recursion;

public class RecursionRemoveDuplicate {

    public static String removeConsecutiveDuplicates(String s) {
        if(s.length()==1){
            return s;
        }
        String smallAns = s.charAt(0)!=s.charAt(1)?""+s.charAt(0):"";
        return smallAns + removeConsecutiveDuplicates(s.substring(1));
    }

    public static void main(String args[]){
        String str = "aabccaa";
        System.out.println(removeConsecutiveDuplicates(str));
    }
}
