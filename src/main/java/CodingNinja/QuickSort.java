package CodingNinja;

import java.util.Arrays;

public class QuickSort {

    static void swap(int input[], int index1, int index2){
        int temp = input[index1];
        input[index1] = input[index2];
        input[index2] = temp;
    }

    static int partition(int input[], int si, int ei){

        int pivotElement = input[si];
        int count=0;
        for(int i=si; i<=ei; i++){
            if(input[i]<pivotElement){
                count++;
            }
        }
        int pivotPositon = si+count;

        swap(input, si, pivotPositon);

        int i = si, j=ei;
        while(i<j){
            if(input[i]>=pivotElement && input[j]<pivotElement){
                swap(input, i, j);
                i++;
                j--;
            }
            else if(input[i]<pivotElement){
                i++;
            }
            else {
                j--;
            }
        }
        return pivotPositon;
    }

    static void quickSort(int input[], int si, int ei){
        if(si>=ei){
            return;
        }
        int pivotPoint = partition(input, si, ei);
        quickSort(input, si, pivotPoint-1);
        quickSort(input, pivotPoint+1, ei);
    }

    public static void quickSort(int[] input) {
        quickSort(input, 0, input.length-1);
    }

    public static void main(String [] args){
        //int arr[] = {2,6,8,5,4,3};
        //int arr[] = {1,5,2,7,3,2};
        int arr[] = {1138,3340,442,3752,2639,4312,1,3525,223,2036,243,3195,4622,2533,4748,4824,4259,2394,4450,481,597,3574,3734,3486,4043,2716,3727,3735,2761,1911,1827,847,3732,2967,3857,96,4417,682,2157,2976,4412,2301,4351,1982,4545,352,3469,2724,993,4288,633,714,4107,2947,1501,279,804,4630,2252,3878,591,4755,4953,1716,3511,2388,801,3989,3534,1661,2846,1245,3257,2023,2500,2330,43,2517,1364,4159,125,4770,1612,3046,558,2221,4474,3672,4328,4140,2161,3854,1371,2402,3898,1143,2738,1582,1619,961,1638,3880,258,398,3643,4591,1518,2034,3907,1303,3450,3127,1852,794,1171,2325,3405,1630,1576,3574,2542,2804,1952,299,2588,4366,3990,1999,3451,4876,813,360,3714,2707,276,2630,1327,3645,2991,1518,3434,1009,3230,3077,4734,1488,96,2112,4665,236,158,3436,1608,2292,1008,1908,2242,4307,3061,4548,1194,662,4297,4203,99,1492,4508,1148,1236,1859,2084,1757,4003,1266,2293,1856,2548,996,1551,1657,62,3299,2155,4255,4351,1283,1535,473,546,1466,4166,4519,6,2353,2894,2283,4748,2058,4569,2306,4011,957,2594,3435,3902,1593,1157,2903,2402,2558,2708,4130,412,895,1494,4837,4930,3618,1755,3175,2887,3341,4559,2425,3654,602,2090,3513,4752,1448,2612,3988,3808,2994,3275,2365,414,2200,1363,2702,4093,3852,2618,1093,4270,2780,2750,3305};
        //int arr [] = {50,50,67,23,90,11,0,2,76,456,8765,1245,84939};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
