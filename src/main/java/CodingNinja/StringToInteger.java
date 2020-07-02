package CodingNinja;

public class StringToInteger {

    public static int convertStringToInt(String input){
        if(input.length()==0){
            return 0;
        }
        int smallAns = (input.charAt(0)-48)*(int)Math.pow(10, input.length()-1);
        return smallAns + convertStringToInt(input.substring(1));
    }

    public static void main(String [] args){
        String str = "12345";
        System.out.println(convertStringToInt(str));

    }
}
