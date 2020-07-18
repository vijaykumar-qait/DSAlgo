package CodingNinja;

import java.util.Arrays;
import java.util.List;

public class LargestNumber {

    static public String largestNumber(final List<Integer> A) {

        String output = "";

        for(int i=0; i<A.size(); i++){
            String a = output + A.get(i);
            String b = A.get(i) + output;
            output = Long.toString(Math.max(Long.parseLong(a), Long.parseLong(b)));
        }
        return output;
    }

    public static void main(String [] args){
        Integer arr[] = {3, 30, 34, 5, 9};
        List<Integer> list = Arrays.asList(arr);
        System.out.println(largestNumber(list));

    }
}
