package CodingNinja;

public class ReverseStringWordWise {
    public static void main(String [] args){
        //String str = "Welcome to Coding Ninjas";
        String str = "Always indent your code";
        String [] strArr = str.split(" ");
        String newStr = "";
        for(int i=strArr.length-1; i>=0; i--){
            newStr+=strArr[i]+" ";
        }
        System.out.println(newStr);
    }
}
