package CodingNinja;

import java.util.HashMap;
import java.util.Map;

public class PairsWithKDifference {

    public static void findPairsDifferenceK(int[] input, int k){
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i=0; i<input.length; i++){
            if(map.get(input[i])==null){
                map.put(input[i], 1);
            }
            else {
                map.put(input[i], map.get(input[i])+1);
            }
        }

        for(int i=0; i<input.length; i++){
            int firstNum = input[i]+k;
            int secondNum = input[i]-k;

            if(map.get(firstNum)!=null){
                if(input[i]!=firstNum){
                    int times = map.get(input[i])*map.get(firstNum);
                    int min = Math.min(input[i], firstNum);
                    int max = Math.max(input[i], firstNum);
                    for(int j=0; j<times; j++){
                        System.out.println(min + " " + max);
                    }
                }
                else {
                    int times = map.get(firstNum)-1;
                    for(int j=0; j<times; j++){
                        System.out.println(firstNum + " " + firstNum);
                    }
                    map.put(firstNum, map.get(firstNum)-1);
                }
            }

            if(map.get(secondNum)!=null){
                if(input[i]!=secondNum){
                    int times = map.get(input[i])*map.get(secondNum);
                    int min = Math.min(input[i], secondNum);
                    int max = Math.max(input[i], secondNum);
                    for(int j=0; j<times; j++){
                        System.out.println(min + " " + max);
                    }
                }
                else {
                    int times = map.get(secondNum)-1;
                    for(int j=0; j<times; j++){
                        System.out.println(firstNum + " " + secondNum);
                    }
                    map.put(secondNum, map.get(secondNum)-1);
                }
            }

            if(k!=0){
                map.put(input[i], 0);
            }
        }

    }

    public static void main(String [] args){
        //int arr[] = {5, 1, 2, 4, 5};
        //int arr[]= {4,4,4,4};
        int arr[] = {3, 1, 4, 1, 5};
        findPairsDifferenceK(arr,2);
    }
}
