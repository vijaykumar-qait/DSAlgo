package CodingNinja;

public class Interleavings {

    public static void interleavings(String first, String second, String print){
        if(first.length()==0 && second.length() ==0){
            System.out.println(print);
            return;
        }
        if(first.length()>0){
            interleavings(first.substring(1), second, print+first.charAt(0));
        }
        if(second.length()>0){
            interleavings(first, second.substring(1), print+second.charAt(0));
        }
    }

    public static void interleavings(String first, String second){
        interleavings(first, second, "");
    }

    public static void main(String [] args){
        String s1 = "ab";
        String s2 = "cd";

        interleavings(s1, s2);
    }
}
