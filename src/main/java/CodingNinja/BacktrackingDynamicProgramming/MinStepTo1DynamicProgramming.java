package CodingNinja.BacktrackingDynamicProgramming;

import java.util.Arrays;

public class MinStepTo1DynamicProgramming {

    public static int countStepsTo1(int n){
        int storage[] = new int [n+1];
        storage[1] = 0;
        for(int i=2; i<=n; i++){
            int minStep = storage[i-1];
            if(i%3==0){
                if(minStep>storage[i/3]){
                    minStep = storage[n/3];
                }
            }

            if(i%2 == 0){
                if(minStep>storage[i/2]){
                    minStep = storage[n/2];
                }
            }
            storage[i] = minStep + 1;
        }
        //System.out.println(Arrays.toString(storage));
        return storage[n];
    }

    public static void main(String [] args){
        int n=5;
        System.out.print(countStepsTo1(n));
    }
}
