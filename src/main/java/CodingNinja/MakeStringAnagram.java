package CodingNinja;

import java.util.HashMap;

public class MakeStringAnagram {

    public static int makeAnagram(String s1,String s2){
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        int count=0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s1.length(); i++){
            map.put(s1.charAt(i),map.getOrDefault(s1.charAt(i),0)+1);
        }

        for(int i=0; i<s2.length(); i++){
            if(map.get(s2.charAt(i))!=null && map.get(s2.charAt(i))>0){
                count++;
                map.put(s2.charAt(i), map.get(s2.charAt(i))-1);
            }
        }
        return  (s1.length() + s2.length() - count*2);
    }

    public static void main(String [] args){
        String str1 = "aab";
        String str2 = "aba";
        System.out.println(makeAnagram(str1, str2));
    }
}
