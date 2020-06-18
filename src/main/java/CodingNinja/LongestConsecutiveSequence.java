package CodingNinja;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LongestConsecutiveSequence {

    public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
        //Your Code goes here
        int maxLength = 0;
        int startIndex = 0;

        Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        for(int i=0; i<arr.length; i++){
            map.put(arr[i], true);
        }

        for(int i=0; i<arr.length; i++){
            int count = 1; int j=1; int small=arr[i];

            while(count<arr.length){
                if(map.get(arr[i]+j)!=null && map.get(arr[i]+j)!=false){
                    map.put(arr[i]+j, false);
                    count++;
                    j++;
                }
                else{
                    map.put(arr[i], false);
                    break;
                }
            }
            j=-1;
            while (count<arr.length){
                if(map.get(arr[i]+j) != null && map.get(arr[i]+j)!=false){
                    map.put(arr[i]+j, false);
                    small=arr[i]+j;
                    count++;
                    j--;
                }
                else{
                    break;
                }
            }

            if(count>=maxLength){

                if(count>maxLength){
                    startIndex = small;
                    maxLength = count;
                }
                else {
                    int oldIndex = 0, newIndex=0;
                    for(int k = 0; k<arr.length; k++){
                        if(arr[k]==startIndex){
                            oldIndex = k;
                            break;
                        }
                    }

                    for(int k = 0; k<arr.length; k++){
                        if(arr[k]==small){
                            newIndex = k;
                            break;
                        }
                    }


                    System.out.println("oldIndex: " + oldIndex + " newIndex: " + newIndex);
                    if(newIndex<oldIndex){
                        startIndex = small;
                    }
                }
            }
        }

        //System.out.println("length: " + maxLength + " start index: " + startIndex);
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<maxLength; i++){
            list.add(startIndex++);
        }
        return list;
    }

    public static void main(String [] args){
        //int arr [] = {2, 12, 9, 16, 10, 5, 3, 20, 25, 11, 1, 8, 6};
        //int arr[] = {3, 7, 2, 1, 9, 8, 1}; // handle this
        //int arr [] = {15, 24, 23, 12, 19, 11, 16};
        //int arr[] = {6,5,4,3,2,1};
        int arr[] = {1, 5, 5, 3, 3, 1};
        System.out.println(longestConsecutiveIncreasingSequence(arr).toString());
    }

}
