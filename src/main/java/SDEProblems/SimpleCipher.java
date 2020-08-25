package SDEProblems;

public class SimpleCipher {

    public static String simpleCipher(String encrypted, int k) {
        String output = "";

        for(int i=0; i<encrypted.length(); i++){
            char ch = encrypted.charAt(i);

            if((int)ch - k < 65){
                int newk = ch - k;
                newk = 'A' - newk;
                char chr = (char)('Z'-newk+1);
                output+= chr;
            }

            else  {
                int num = ch;
                char chr = (char)(num - k);
                output += chr;
            }
        }
        return output;
    }

    public static void main(String [] args){
        String str = "UGBQTFOTHJ";
        int k = 1;
        System.out.println(simpleCipher(str, 2));
    }
}