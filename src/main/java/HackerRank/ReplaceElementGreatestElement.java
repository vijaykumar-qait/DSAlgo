package HackerRank;

import java.util.Arrays;

public class ReplaceElementGreatestElement {

    public static int[] replaceElements(int[] arr) {
        for(int i=0; i<arr.length-1; i++){
            int max = arr[i+1];
            for(int j=i+1; j<arr.length; j++){
                if(max<arr[j]){
                    max = arr[j];
                }
            }
            arr[i]=max;
        }
        arr[arr.length-1] = -1;
        return arr;
    }

    public  static void main(String args[]){
//        int arr[] = {17,18,5,4,6,1};
//        int arr[] = {1,2,3,4,5,6};
//        int arr[] = {6,5,4,3,2,1};
//        int arr[] = {1,1,1,1,1,1,};
        int arr[] = {2,2,2,2,2,3};

        System.out.println(Arrays.toString(replaceElements(arr)));
    }
}
