package Leetcode;

import java.util.Arrays;

public class ReverseString {

    static void swap(char arr[], int i, int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static public void reverseString(char[] s, int si, int ei) {
        if(si>=ei){
            return;
        }
        swap(s, si, ei);
        reverseString(s, si+1, ei-1);

    }

    static public void reverseString(char[] s) {
        reverseString(s, 0, s.length-1);
    }

    public static void main(String [] args){
        char arr[] = {'h','e','l','l','o'};
        reverseString(arr);
        System.out.println(Arrays.toString(arr));

    }
}
