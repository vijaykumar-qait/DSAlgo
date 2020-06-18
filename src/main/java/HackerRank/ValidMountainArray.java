package HackerRank;

public class ValidMountainArray {

    static int getPivotPoint(int A[]){
        int i = 0;
        int j = A.length-1;

        if(A.length<3){
            return  -1;
        }

        while(i<j){
            int mid = i + (j-i)/2;

            if(mid!=j && mid!=i && A[mid]>A[mid-1] && A[mid]> A[mid+1]){
                return mid;
            }
            else if(mid!=i && mid!=j && A[mid]>A[mid-1] && A[mid]<A[mid+1]){
                i++;
            }
            else {
                j--;
            }
        }
        return -1;
    }

    static boolean validMountainArray(int[] A) {
        int pivotPoint = getPivotPoint(A);
        if(pivotPoint == -1){
            return  false;
        }
        for(int i=1; i<=pivotPoint; i++){
            if(A[i]<A[i-1]){
                return false;
            }
        }

        for(int i=pivotPoint+1; i<A.length-1; i++){
            if(A[i]<A[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        int arr [] ={14,82,89,84,79,70,70,68,67,66,63,60,58,54,44,43,32,28,26,25,22,15,13,12,10,8,7,5,4,3};

        System.out.println("Boolean: " + validMountainArray(arr));

        System.out.println(2<2);
    }
}
