package CodingNinja;

import java.util.Arrays;

public class Sort012 {
    public static void main(String [] args){
        //int arr[] = {0, 1, 2, 0, 2, 0, 1};
        //int arr[] = {2, 2, 0, 1, 1};
        int arr[] = {0,0,0};

        int nextZero = 0;
        int nextTwo = arr.length-1;
        int i=0;
        while(i<=nextTwo){
            if(arr[i] == 0){
                int temp = arr[i];
                arr[i]=arr[nextZero];
                arr[nextZero] = temp;

                nextZero++;
                i++;
            }
            else if(arr[i]==2){
                int temp = arr[i];
                arr[i] = arr[nextTwo];
                arr[nextTwo] = temp;

                nextTwo--;
            }
            else {
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
