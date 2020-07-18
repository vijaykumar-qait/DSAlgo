package CodingNinja.BacktrackingDynamicProgramming;

public class PermutationOfString {

    static void printAllPermutation(String str, String print){
        if(str.length()==0){
            System.out.println(print);
            return;
        }
        for(int i=0; i<str.length(); i++){
            String newPrint = print + str.charAt(i);
            printAllPermutation(str.substring(0,i)+str.substring(i+1, str.length()), newPrint);
        }
    }

    static void printAllPermutation(String str){
        printAllPermutation(str, "");
    }

    public static void main(String[] args){
        String str = "abc";
        printAllPermutation(str);
    }
}
