package CodingNinja;

public class FirstIndexRecursion {

    public static int firstIndex(int input[], int startIndex, int x) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        if(startIndex >= input.length){
            return -1;
        }
        if(input[startIndex] == x){
            return startIndex;
        }
        int index = firstIndex(input, startIndex+1, x);
        return index;
    }

    public static int firstIndex(int input[], int x) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        return firstIndex(input, 0, x);
    }

    public static void main(String [] args){
        int arr [] = {9, 8, 10, 8};
        int num = 7;
        System.out.print(firstIndex(arr, num));

    }
}
