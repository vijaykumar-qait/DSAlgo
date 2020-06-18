package HackerRank;

import DSAndAlgo.LinkedListQue.LinkedListOp;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MatrixQuesOne {
    public static void main(String args[]){
        int arr[][] = {{1,1,3,4}, {1,2,3,2}, {3,6,2,3}, {5,2,5,3}};

        for(int i=0;i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        int m = arr.length;
        int n = arr[0].length;
        int count = 0;
        Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();

        for(int i=0; i<m;i++){
            int element = arr[0][i];
            if(map.get(element) == null) {
                map.put(element, true);

                boolean elementPresent = true;

                for(int j=1; j<m; j++){
                    boolean flag = false;

                    for(int k=0; k<n; k++){
                        System.out.println(arr[j][k]);
                        if(element == arr[j][k]) {
                            flag = true;
                        }
                    }
                    if(flag == false){
                        elementPresent = false;
                        break;
                    }
                }

                if(elementPresent == true){
                    System.out.println(element);
                    count++;
                }
            }
            else {

            }


        }
        System.out.println("count: "+ count);


    }
}
