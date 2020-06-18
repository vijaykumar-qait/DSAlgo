package HackerRank;

import java.util.HashMap;

public class CheckNAndDouble {
    public static void main(String [] args){
        int arr[] ={-2, 0, 10, -19, 4, 6, -8};

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i=0; i<arr.length; i++){
            map.put((arr[i]), i);
        }


        for(int i=0; i<arr.length; i++){
            if(map.get(arr[i]*2) !=null && map.get(arr[i]*2) != i){
                System.out.println("index: " + i + "  " + map.get(arr[i]*2));
            }
        }
    }
}
