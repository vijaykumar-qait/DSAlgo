package CodingNinja.Pracitse.Recursion;

public class InterleavingString {

    static public void interLeavingNodes(String str1, String str2, String str3){
        if(str1.length() == 0 && str2.length() == 0){
            System.out.println(str3);
            return;
        }

        if(str1.length()>0){
            interLeavingNodes(str1.substring(1), str2, str3+str1.charAt(0));
        }
        if(str2.length()>0){
            interLeavingNodes(str1, str2.substring(1), str3+str2.charAt(0));
        }
    }

    public static void main(String args[]){
        String str1 = "ab";
        String str2 = "cd";
        interLeavingNodes(str1, str2, "");
    }
}
