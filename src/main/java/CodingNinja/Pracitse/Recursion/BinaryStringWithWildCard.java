package CodingNinja.Pracitse.Recursion;

public class BinaryStringWithWildCard {

    /*
    Given a binary pattern that contains ‘?’ wildcard character at few positions, find all possible combinations of
    binary strings that can be formed by replacing the wildcard character by either 0 or 1.


     */

    public static void binaryStringWithWildCard(String str, String temp, int i){
        if(i==str.length()){
            System.out.println(temp);
            return;
        }

        if(str.charAt(i) == '?'){
            /*String newString = temp.substring(0, i) + '0' + temp.substring(i+1, temp.length());
            binaryStringWithWildCard(str, newString, i+1);

            newString = temp.substring(0,i) + '1' + temp.substring(i+1, temp.length());
            binaryStringWithWildCard(str, newString, i+1 );
            */
            for(char ch = '0'; ch <='1' ; ch++){
                String newString = temp.substring(0, i) + ch + temp.substring(i+1, temp.length());
                binaryStringWithWildCard(str, newString, i+1);
            }
            return;
        }
        binaryStringWithWildCard(str, temp, i+1);
    }

    public static void binaryStringWithWildCard(String str){
        binaryStringWithWildCard(str, str, 0);
    }

    public static void main(String [] args){
        //String str = "1?11?00?1?";
        String str = "??";
        binaryStringWithWildCard(str);
    }
}
