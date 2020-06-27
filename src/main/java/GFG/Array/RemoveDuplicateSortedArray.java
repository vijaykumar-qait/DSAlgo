package GFG.Array;

public class RemoveDuplicateSortedArray {

    static int remove_duplicate(int a[], int N)
    {
        int index=0;
        int arr[] = new int[256];
        for(int i=0; i<N; i++){
            arr[a[i]]=1;
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]==1){
                a[index++] = i;
            }
        }
        return index;
    }

    public static void main(String args []){

        int arr[] ={2, 2, 6, 7, 7, 12, 17, 24, 30, 30, 36, 38, 41, 42, 42, 43, 43, 45, 47, 48, 49, 51, 54, 58, 60, 63, 65, 65, 69, 71,
                74, 79, 89, 91, 91};

        int var = remove_duplicate(arr, arr.length);
        for(int i=0; i<var; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
