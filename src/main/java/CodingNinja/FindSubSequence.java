package CodingNinja;

import java.util.Arrays;

public class FindSubSequence {

    public static String [] findSubSequence(String str){
        if(str.length()==0){
            String [] arr = {""};
            return arr;
        }
        String [] smallArr = findSubSequence(str.substring(1));
        String [] ansArr = new String [2*smallArr.length];

        int k=0;
        for(int i=0; i<smallArr.length; i++){
            ansArr[k++] = smallArr[i];
        }

        for(int i=0; i<smallArr.length; i++){
            ansArr[k++] = str.charAt(0) + smallArr[i];
        }
        return ansArr;
    }

    public static void main(String [] args){
        String str = "xyz";
        System.out.println(Arrays.toString(findSubSequence(str)));
    }

}
