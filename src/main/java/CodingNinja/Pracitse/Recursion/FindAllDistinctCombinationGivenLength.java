package CodingNinja.Pracitse.Recursion;

public class FindAllDistinctCombinationGivenLength {

    static public void printCombinationGivenLength(int arr[], String out, int i, int n, int k){
        if(k>n){
            return;
        }


        //base case
        if(k==0){
            System.out.println(out);
            return;
        }

        for(int j=i; j<n; j++){
            String smallString = out + " " + arr[j];
            printCombinationGivenLength(arr, smallString, i+1, n, k-1);
        }

    }

    public static void main(String [] args){
        int arr[] = {1,2,3};
        printCombinationGivenLength(arr, "", 0, arr.length, 2);
    }
}
