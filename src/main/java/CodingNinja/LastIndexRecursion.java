package CodingNinja;

public class LastIndexRecursion {

    public static int lastIndex(int input[], int startIndex, int x) {
        if(startIndex >= input.length) {
            return -1;
        }

        int index = lastIndex(input, startIndex+1, x);

        if(input[startIndex] == x && index==-1 ){
            return startIndex;
        }
        return index;
    }

    public static int lastIndex(int input[], int x) {
        return lastIndex(input, 0, x);
    }

    public static void main(String [] args){
        int arr [] = {9, 8, 10, 8};
        int num = 7;
        System.out.println(lastIndex(arr, num));
    }
}
