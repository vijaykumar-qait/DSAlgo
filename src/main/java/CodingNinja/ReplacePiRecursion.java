package CodingNinja;

public class ReplacePiRecursion {

    public static String replace(String input){
        if(input.length()==0){
            return "";
        }

        String smallAns = ""+input.charAt(0);
        int jump = 1;

        if(input.length()>=2 && input.charAt(0) == 'p' && input.charAt(1)=='i'){
            smallAns = "3.14";
            jump = 2;
        }

        return smallAns +replace(input.substring(jump));
    }

    public static void main(String [] args){
        String str = "xpipi";
        System.out.println(replace(str));
    }
}
