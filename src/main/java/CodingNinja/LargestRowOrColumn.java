package CodingNinja;

public class LargestRowOrColumn {
    public static void main(String [] args){
        //int input[][] = {{1,1}, {1,1}};

        int input[][] = {{3,6,9}, {1,4,7}, {2,8,9}};

        int row = input.length;
        int colmn = 0;
        if(row>0){
            colmn = input[0].length;
        }

        int rowSum = Integer.MIN_VALUE;
        int maxRow = 0;

        for(int i=0; i<row; i++){
            int sum = 0;
            for(int j=0; j<colmn; j++){
                sum+=input[i][j];
            }
            if(sum>rowSum){
                rowSum=sum;
                maxRow=i;
            }
        }

        int columnSum = Integer.MIN_VALUE;
        int maxColumn = 0;

        for(int j=0; j<colmn; j++){
            int sum=0;
            for(int i=0; i<row; i++){
                sum+=input[i][j];
            }
            if(sum>columnSum){
                columnSum=sum;
                maxColumn=j;
            }
        }

        if(columnSum>rowSum){
            System.out.println("column " + maxColumn + " " + columnSum);
        }
        else if(columnSum<rowSum){
            System.out.println("row "+maxRow + " " + rowSum);
        }
        else {
            System.out.println("row "+maxRow + " " + rowSum);
        }
    }
}
