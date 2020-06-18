package DSAndAlgo;

public class MergeSortAlgo {
    public static void main(String... args) {
        System.out.println("hello");

        int arr[] = {5,4,6,1,2,3};

        MergeSortAlgo obj = new MergeSortAlgo();

        obj.sort(arr,0, arr.length-1);

    }

    public void sort(int arr[], int l, int r) {
        System.out.println("Spliting: " + l + " " + r);

        if(l<r) {
            int mid = (l+r)/2;

            sort(arr, l, mid);
            sort(arr, mid+1, r);

            merge(arr, l, mid , r);
        }
    }

    public void merge(int arr[], int l, int mid, int r) {
        System.out.println("merge: " + l + " " + mid + " " + r);

        //Find the size of array
        int n1 = mid - l +1;
        int n2 = r - mid;

        System.out.println("n1: "+ n1);
        System.out.println("n2: "+ n2);

        //create 2 temp array
        int L[] = new int [n1];
        int R[] = new int [n2];

        for(int i=0; i<n1; ++i) {
            L[i] = arr[l+i];
        }

        for(int j=0;j<n2;++j) {
            R[j] =arr[mid+j+1];
        }


        //merge the temp array
        //initial index of first and second array
        int i=0; int j=0;

        int k=l;

        while(i<n1 && j<n2) {
            if(L[i]<R[i]) {
                arr[k] = L[i];
                i++;
            }
            else  {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        //Copy remaining array L[]
        while(i<n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        //copy remaining of array R[]
        while(j<n2) {
            arr[k] = R[j];
            j++;
            k++;
        }

        printArr(arr);
    }

    void printArr(int arr[]) {
        for(int i=0  ;i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
