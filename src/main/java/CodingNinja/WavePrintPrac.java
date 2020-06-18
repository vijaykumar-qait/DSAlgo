package CodingNinja;

public class WavePrintPrac {
    public static void main(String [] args){
        int input[][] = {{1,2,3, 4}, {5,6,7,8}, {9,10,11,12}};

        int row = input.length;
        int col = 0;
        if(row>0){
            col=input[0].length;
        }

        for(int j=0; j<col; j++){
            if((j&1)==1){
                for(int i=row-1; i>=0; i--) {
                    System.out.print(input[i][j] + " ");
                }
            }
            else {
                for(int i=0; i<row; i++){
                    System.out.print(input[i][j] + " ");
                }
            }
        }
    }
}
