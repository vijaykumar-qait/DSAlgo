package CodingNinja;

import java.util.HashMap;
import java.util.Map;

public class FindSmallestSubstring {

    public static boolean checkSmallStringContains(String smallStr, String small){

        Map<Character, Integer> mapSmallStr = new HashMap<>();
        for(char c : smallStr.toCharArray()){
            if(mapSmallStr.get(c) == null){
                mapSmallStr.put(c, 0);
            }
            else {
                mapSmallStr.put(c, mapSmallStr.get(c)+1);
            }
        }

        Map<Character, Integer> mapsmall = new HashMap<>();
        for(char c : small.toCharArray()){
            if(mapsmall.get(c)==null){
                mapsmall.put(c, 0);
            }
            else {
                mapsmall.put(c, mapsmall.get(c)+1);
            }
        }


        return mapSmallStr.entrySet().containsAll(mapsmall.entrySet());
    }

    public static String findMinSubstringContainingString(String large, String small){

        String smallStr = large;

        for(int i=0; i<large.length(); i++){
            for(int j=i+1; j<=large.length(); j++){
                String newStr = large.substring(i, j);
                if(newStr.length()>=small.length()){
                    if(checkSmallStringContains(newStr, small)){
                        if(smallStr.length()>newStr.length()){
                            smallStr = newStr;
                        }
                    }
                }
            }
        }

        return smallStr;
    }

    public static void main(String [] args){
//        String s1 = "this is a test string";
//        String s2 = "tist";

        String s1 = "geeksforgeeks";
        String s2 = "ork";

        System.out.print(findMinSubstringContainingString(s1, s2));
    }
}
