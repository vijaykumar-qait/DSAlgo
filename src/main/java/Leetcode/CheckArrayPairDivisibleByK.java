package Leetcode;

import java.util.HashMap;

public class CheckArrayPairDivisibleByK {
    static public boolean canArrange(int[] arr, int k) {

        if((arr.length&1)!=0){
            return false;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        for(int i=0; i< arr.length; i++){
            int firstVal = -arr[i];
            int secondVal = arr[i]%k==0?arr[i]:k>arr[i]?k-arr[i]:k*2-arr[i];


            System.out.println("arr[i]: "+arr[i]);
            System.out.println("first: " + firstVal);
            System.out.println("second: "+ secondVal);

            if(map.containsKey(firstVal)){
                System.out.println("removed: " + firstVal );
                if(map.get(firstVal)>1){
                    map.put(firstVal, map.get(firstVal)-1);
                }
                else {
                    map.remove(firstVal);
                }
            }
            else if(map.containsKey(secondVal)){
                System.out.println("removed: " + secondVal);
                if(map.get(secondVal)>1){
                    map.put(secondVal, map.get(secondVal)-1);
                }
                else {
                    map.remove(secondVal);
                }
            }
            else {
                return false;
            }
            System.out.println();
        }

        System.out.println("size: "+map.size());

        return map.size()==0?true:false;
    }

    public static void main(String [] args){
        int arr[]= {1,2,3,4,5,10,6,7,8,9};
        int k =5;

//        int arr[] = {1,2,3,4,5,6};
//        int k =7;

//        int arr[] = {1,2,3,4,5,6};
//        int k = 10;

//        int arr[] = {-10, 10};
//        int k =2;


//        int arr[] = {-1,1,-2,2,-3,3,-4,4};
//        int k = 3;

//        int arr[] = {5,10};
//        int k =5;
        System.out.println(canArrange(arr, k));
    }
}
