package CodingNinja;

public class PrintSubStringRecursion {

    static void printSubString(String str, String outputSoFar){
        if(str.length() == 0){
            System.out.println(outputSoFar);
            return;
        }
        printSubString(str.substring(1), outputSoFar);
        printSubString(str.substring(1), outputSoFar+str.charAt(0));
    }

    static void printSubString(String str){
        printSubString(str, "");
    }

    public static void main(String [] args){
        String str = "xyz";
        printSubString(str);
    }
}
