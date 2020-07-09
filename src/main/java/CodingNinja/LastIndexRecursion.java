package CodingNinja;

public class LastIndexRecursion {

    /*public static int lastIndex(int input[], int startIndex, int x) {
        if(startIndex >= input.length) {
            return -1;
        }

        int index = lastIndex(input, startIndex+1, x);

        if(input[startIndex] == x && index==-1 ){
            return startIndex;
        }
        return index;
    }*/

    public static int lastIndex(int input[], int lastIndex, int x) {
        if(lastIndex == input.length-1) {
            return input[lastIndex] == x ? lastIndex : -1;
        }

        int index = lastIndex(input, lastIndex+1, x);
        return (input[lastIndex]==x && index==-1) ? lastIndex : index;
    }

    public static int lastIndex(int input[], int x) {
        return lastIndex(input, 0, x);
    }

    public static void main(String [] args){
        int arr [] = {42,61,73};
        int num = 61;
        System.out.println(lastIndex(arr, num));
    }
}
