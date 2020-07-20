package CodingNinja.BacktrackingDynamicProgramming;

public class AlphaCodeDP {

//    static int countAlphaCode(int arr[], int size){
//        int dp[] = new int [arr.length+1];
//        dp[0] = 1;
//        dp[1] = 1;
//        for(int i=2; i<arr.length; i++){
//            dp[i] = 0;
//
//
//
//            if (arr[i-1]*10 + arr[i] <= 26 && arr[i-1]!=0){
//                dp[i]+=dp[i-2];
//            }
//        }
//        return dp[size];
//    }

    static int countAlphaCode(int arr[], int size){
        int m=(int)Math.pow(10,9)+7;
        int dp[] = new int [arr.length+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2; i<arr.length; i++){

            if(arr[i]==0){

            }
            else
                dp[i] += dp[i-1];


            if (arr[i-1]*10 + arr[i] <= 26 && arr[i-1]!=0){
                dp[i]=(dp[i]+dp[i-2])%m;
            }
        }
        return dp[size]%m;
    }

    public static int countAlphaCode(String code){
        int arr[] = new int [code.length()+1];
        int storage[] = new int[arr.length];
        for(int i=0; i<code.length(); i++){
            arr[i+1] = code.charAt(i)-48;
        }
        //System.out.println(Arrays.toString(arr));
        return countAlphaCode(arr, arr.length-1);
    }

/**
 * Falling for cases:
 * 25114   -> 6
 * 1111111111   -> 89
 * 3333333333   -> 1
 * 123112563    -> 15
 * 12345654321346864   -> 9
 * 301 -> 0
 * 1020 -> 1
 * 2002 -> 0 this is not working
 * 201 -> 1
 * 3020 -> 0
 * 0
 * */

    public static void main(String [] args){
        String str = "201";
        System.out.println(countAlphaCode(str));
    }
}
