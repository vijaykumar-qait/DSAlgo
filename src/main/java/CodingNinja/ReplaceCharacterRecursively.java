package CodingNinja;

public class ReplaceCharacterRecursively {
    public static String replaceCharacter(String input, char c1, char c2) {
        if(input.length() == 0){
            return input;
        }
        String smallAns = ""+input.charAt(0);
        if(input.charAt(0) == c1){
            smallAns = ""+c2;
        }
        return smallAns + replaceCharacter(input.substring(1), c1, c2);
    }

    public static void main(String [] args){
        String s1 = "abacd";
        char c1 = 'b';
        char c2 = 'x';
        System.out.print(replaceCharacter(s1, c1, c2));
    }
}
