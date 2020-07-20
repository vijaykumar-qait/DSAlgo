package CodingNinja.BacktrackingDynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class AlphaCodeCountMemoization {

    /**
     * Alpha Code
     * Send Feedback
     * Alice and Bob need to send secret messages to each other and are discussing ways to encode their messages:
     * Alice: “Let’s just use a very simple code: We’ll assign ‘A’ the code word 1, ‘B’ will be 2, and so on down to ‘Z’ being assigned 26.”
     *
     * Bob: “That’s a stupid code, Alice. Suppose I send you the word ‘BEAN’ encoded as 25114. You could decode that in many different ways!”
     *
     * Alice: “Sure you could, but what words would you get? Other than ‘BEAN’, you’d get ‘BEAAD’, ‘YAAD’, ‘YAN’, ‘YKD’ and ‘BEKD’. I think you would be able to figure out the correct decoding. And why would you send me the word ‘BEAN’ anyway?”
     *
     * Bob: “OK, maybe that’s a bad example, but I bet you that if you got a string of length 5000 there would be tons of different decodings and with that many you would find at least two different ones that would make sense.”
     *
     * Alice: “How many different decodings?”
     *
     * Bob: “Jillions!”
     * For some reason, Alice is still unconvinced by Bob’s argument, so she requires a program that will determine how many decodings there can be for a given string using her code.
     * Input
     * Input will consist of multiple input sets. Each set will consist of a single line of at most 5000 digits representing a valid encryption (for example, no line will begin with a 0). There will be no spaces between the digits. An input line of ‘0’ will terminate the input and should not be processed.
     * Output
     * For each input set, output the number of possible decodings for the input string. Print your answer taking modulo "10^9+7"
     * Sample Input:
     * 25114
     * 1111111111
     * 3333333333
     * 0
     * Sample Output:
     * 6
     * 89
     * 1
     */

    /**
     * Falling for cases:
     * 25114   -> 6
     * 1111111111   -> 89
     * 3333333333   -> 1
     * 123112563    -> 15
     * 12345654321346864   -> 9
     * 301 -> 0
     * 1020 -> 1
     * 2002 -> 0
     * 201 -> 1
     * 3020 -> 0
     * 0
     *
     *
     *
     * @param arr
     * @param size
     * @param storage
     * @return
     */


    /*
    * Scanner sc=new Scanner(System.in);
        String s=sc.next();
            int n=s.length();
        int input[]=new int[n];
        for(int i=0;i<n;i++)
        {
            input[i]=s.charAt(i)-'0';
        }
       while(input.length>=1&&input[0]!=0)
       {
        System.out.println(CountDP(input,n));
       s=sc.next();
          n=s.length();
          input=new int[n];
        for(int i=0;i<n;i++)
        {
            input[i]=s.charAt(i)-'0';
        }

       }
       *
       *
       *
       * static int countAlphaCode(int arr[], int size){
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
    *
    * */




    static int countAlphaCode(int arr[], int size, int storage[]){
        if(size==1){
            storage[size] = 1;
            return storage[size];
        }

        //for space we can h 1 code that is space
        if(size==0){
            storage[size] = 1;
            return storage[size];
        }

        if(storage[size]!=0){
            return storage[size];
        }

        int smallAns = countAlphaCode(arr, size-1, storage);

        if(arr[size-1]*10 + arr[size]<=26){
            smallAns+=countAlphaCode(arr, size-2, storage);
        }

        //below check are not good way
        /*if((arr[size-1]*10 + arr[size])>26 && arr[size]==0){
            smallAns=0;
        }

        if((arr[size-1]*10 + arr[size])<26 && arr[size-1]==0){
            smallAns += -1;
        }

        if((arr[size-1]*10 + arr[size])<26 && arr[size]==0){
            smallAns += -1;
        }
        if(smallAns<0){
            smallAns=0;
        }*/
        storage[size] = smallAns;
        return storage[size];
    }

    static int countAlphaCode(String code){
        int arr[] = new int [code.length()+1];
        int storage[] = new int[arr.length];
        for(int i=0; i<code.length(); i++){
            arr[i+1] = code.charAt(i)-48;
        }
        //System.out.println(Arrays.toString(arr));
        return countAlphaCode(arr, arr.length-1, storage);
    }

    public static void main(String [] args){
        String num = "3020";
        System.out.println(countAlphaCode(num));

//        Scanner scanner = new Scanner(System.in);
//        boolean flag = true;
//        while(flag) {
//            String str = scanner.nextLine();
//            if(!str.equalsIgnoreCase("0")){
//                System.out.println(countAlphaCode(str));
//            }else{
//                flag = false;
//            }
//        }
    }
}
