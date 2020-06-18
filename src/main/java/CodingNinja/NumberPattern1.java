package CodingNinja;

public class NumberPattern1 {
    public static void main(String [] args){

        int n = 1;

        //int arr[][]= {{1,2,3}, {4,5,6}, {7,8,9}};

        int row_min = 0;
        int row_max = n*2 - 1;
        int col_min = 0;
        int col_max = n*2 - 1;

        int arr [][] = new int [row_max][col_max];

        int num = n;

        while (row_min<row_max && col_min<col_max) {
            //first row
            for(int i=col_min; i<col_max; i++){
                arr[row_min][i] = num;
                //System.out.print(arr[row_min][i] + " ");
            }
            row_min++;

            //reading last column
            for(int i=row_min; i<row_max; i++){
                arr[i][col_max-1] = num;
                //System.out.print(arr[i][col_max-1] + " ");
            }
            col_max--;

            //reading last row
            if(row_min<row_max){
                for(int i=col_max-1; i>=col_min; i--){
                    arr[row_max-1][i] = num;
                    //System.out.print(arr[row_max-1][i] + " ");
                }
            }
            row_max--;
            //reading first column
            if(col_min<col_max){
                for(int i=row_max-1; i>=row_min; i--){
                    arr[i][col_min] = num;
                    //System.out.print(arr[i][col_min] + " ");
                }
            }
            col_min++;

            num--;
        }

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
