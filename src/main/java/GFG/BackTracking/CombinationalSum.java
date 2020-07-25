package GFG.BackTracking;

import java.util.*;

public class CombinationalSum {

    public static boolean combinationalSum(int arr[], int sum, int sumTobe, int i, ArrayList<Integer> list, int j, boolean flag) {
        if(sum==sumTobe){
            System.out.print("(");
            for(int k=0;k<list.size()-1; k++){
                System.out.print(list.get(k)+ " ");
            }
            System.out.print(list.get(list.size()-1));
            System.out.print(")");
            flag = true;
            return flag;
        }
        if(i==arr.length){
            if(sum==sumTobe){
                System.out.print("(");
                for(int k=0;k<list.size()-1; k++){
                    System.out.print(list.get(k)+ " ");
                }
                System.out.print(list.get(list.size()-1));
                System.out.print(")");
                flag = true;
                return flag;
            }
            return flag;
        }

        if(!(sumTobe+arr[i]>sum)){
            sumTobe += arr[i];
            list.add(arr[i]);
            flag = combinationalSum(arr, sum, sumTobe, i, list, j+1, flag);
            sumTobe-=arr[i];
            list.remove(j);
        }
        flag = combinationalSum(arr, sum, sumTobe, i+1, list, j, flag);
        return flag;
    }

    public static boolean combinationalSum(int arr[], int sum) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            set.add(arr[i]);
        }
        int newArr[] = new int[set.size()];
        Iterator<Integer> itr = set.iterator();
        int i=0;
        while(itr.hasNext()){
            newArr[i++] = itr.next();
        }
        Arrays.sort(newArr);
        ArrayList<Integer> list = new ArrayList<>();
        return combinationalSum(newArr, sum, 0, 0, list, 0, false);
    }

    public static void main(String args[]){
        int arr[] = {5 ,2 ,2 ,6};
        int sum = 3;
        System.out.println(combinationalSum(arr, sum));

//        Scanner scanner = new Scanner(System.in);
//        int testCases = scanner.nextInt();

//        for(int i=0; i<testCases; i++){
//            int arraySize = scanner.nextInt();
//            int newArr[] = new int [arraySize];
//            for(int j=0; j<arraySize; j++){
//                newArr[j] = scanner.nextInt();
//            }
//            int sum = scanner.nextInt();
//            if(!combinationalSum(newArr, sum)){
//                System.out.println("Empty");
//            }
//        }
    }
}
