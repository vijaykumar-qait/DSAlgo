package Crio.QprepJava;

import java.util.Scanner;

public class StringManipulation {
    /**
     * Problem Description
     * The ancient Romans used a cipher known as Caesar’s cipher. Given a string, the cipher would replace all
     * the alphabets by the next alphabet. For example: if your plain text was 'Java', then the cipher text would be: “Kbwb”. Note that encryption is case sensitive.
     *
     * Input format
     * The input is a string, the input is known as the plaintext (un-encrypted string).
     *
     * Output format
     * The output is a string, the output is known as the cipher text (encrypted string).
     *
     * Constraints
     * 0 < len(plain text) < 100
     *
     * Sample Input
     * Java
     *
     * Sample Output
     * Kbwb
     */

    public static String stringmanipulation(String s) {
//        String output = "";
//        for(int i=0; i<s.length(); i++){
//            char ch = s.charAt(i);
//            if(ch - 'Z' == 0){
//                output+='A';
//            }
//            else if(ch - 'z' == 0){
//                output+= 'a';
//            }
//            else {
//                output += (char)(ch + 1);
//            }
//        }
//
//        return output;

        int n = s.length();

        String ans = new String();

        for (int i = 0; i < n; i++) {

            int ascii = (s.charAt(i) + 1);

            String temp = Character.toString((char)ascii);

            ans += temp;

        }
        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = new String();
        s = sc.next();
        String ans = stringmanipulation(s);
        System.out.println(ans);
    }
}
