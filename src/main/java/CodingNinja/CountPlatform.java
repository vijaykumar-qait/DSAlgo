package CodingNinja;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CountPlatform {

    public static int platformsNeeded(int arrival[], int departure[]){
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */

        Arrays.sort(arrival);
        Arrays.sort(departure);
        int size = arrival.length;
        int platform[] = new int [size];

        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                if(arrival[i]>platform[j]){
                    platform[j] = departure[i];
                    break;
                }
            }
        }
        //to count no. of platform
        int count = 0;
        for(int i=0; i<size; i++){
            if(platform[i]==0){
                break;
            }
            count++;
        }
        return count;
    }

    public static void main(String [] args){
//        int arrival [] = {900, 940, 950, 1100, 1500, 1800};
//        int departure[] ={910, 1200, 1120, 1130, 1900, 2000};

        int arrival [] = {1100, 1101, 1103, 1105};
        int departure [] = {1110, 1102, 1104, 1106};


//        int arrival [] = {0310, 2329, 2358, 995};
//        int departure [] = {0315, 2338, 2359, 1018};

        System.out.println(platformsNeeded(arrival, departure));
    }
}
