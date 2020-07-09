package CodingNinja;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringOfLengthK {

    public static void allStrings(String charSet, String prefix, int strLen, int len, List<String> list){
        if(len==0){
            list.add(prefix);
            return;
        }
        for(int i=0; i<strLen; i++){
            String newPrefix = prefix + charSet.charAt(i);
            allStrings(charSet, newPrefix, strLen, len-1, list);
        }
    }

    public static String[] allStrings(String charSet, int len){
        List<String> list = new ArrayList<>();
        allStrings(charSet, "", charSet.length(), len, list);
        return list.stream().toArray(String[] :: new);
    }
    public static void main(String [] args){
        String str = "ab";
        int k = 2;
        System.out.println(Arrays.toString(allStrings(str, k)));
    }
}
