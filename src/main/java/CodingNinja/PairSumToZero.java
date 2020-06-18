package CodingNinja;

import java.util.HashMap;
import java.util.Map;

public class PairSumToZero {
    public static void main(String [] args) {
        int input[] = {2, 1, 2, 3, -2, -2};
        int size = input.length;

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<size; i++){
            int req = 0 - input[i];
            if(map.get(req) != null){
                int small = 0;
                int large = 0;

                if(req<input[i]){
                    small = req;
                    large = input[i];
                }
                else {
                    small = input[i];
                    large = req;
                }

                for(int j=0; j<map.get(req); j++){
                    System.out.println(small + " " + large);
                }
            }
            if(map.get(input[i])==null){
                map.put(input[i], 1);
            }
            else {
                map.put(input[i], map.get(input[i])+1);
            }
        }

    }
}

