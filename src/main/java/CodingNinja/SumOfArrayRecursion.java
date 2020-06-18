package CodingNinja;

public class SumOfArrayRecursion {
    public static int sum(int input[]) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */

        if(input.length<1){
            return 0;
        }

        if(input.length==1){
            return input[0];
        }

        int smallArr[] = new int[input.length-1];
        for(int i=1; i<input.length; i++){
            smallArr[i-1] = input[i];
        }

        int sum = sum(smallArr);
        return input[0]+sum;

    }

    public static void main(String [] args){
        int arr[] = {4,2,1};
        System.out.println(sum(arr));

    }
}
