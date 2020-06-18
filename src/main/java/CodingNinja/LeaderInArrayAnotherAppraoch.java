package CodingNinja;

import java.util.ArrayList;

public class LeaderInArrayAnotherAppraoch {
    public  static void main(String [] args){
        int input[] = {3, 12, 34, 2, 0, -1};
//        ArrayList<Integer> list = new ArrayList<Integer>();
//
//        int max = input[input.length-1];
//        list.add(max);
//        int i = input.length -2;
//
//        while (i>=0){
//            if(input[i]>=max){
//                max = input[i];
//                list.add(max);
//            }
//            i--;
//        }
//
//        for(int j=list.size()-1; j>=0; j--){
//            System.out.print(list.get(j) + " ");
//        }

        int max = input[input.length-1];
        System.out.print(max);
        int i = input.length -2;

        while (i>=0){
            if(input[i]>=max){
                max = input[i];
                System.out.print(max + " ");
            }
            i--;
        }

//        for(int j=list.size()-1; j>=0; j--){
//            System.out.print(list.get(j) + " ");
//        }
    }
}
