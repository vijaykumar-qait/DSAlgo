package CodeChef;

import java.util.*;
class lics {
    static int LongIncrConseqSubseq(int arr[], int n)
    {
        // create hashmap to save latest consequent
        // number as "key" and its length as "value"
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        // put first element as "key" and its length as "value"
        map.put(arr[0], 1);
        for (int i = 1; i < n; i++) {

            // check if last consequent of arr[i] exist or not
            if (map.containsKey(arr[i] - 1)) {

                // put the updated consequent number
                // and increment its value(length)
                map.put(arr[i], map.get(arr[i] - 1) + 1);

                // remove the last consequent number
                map.remove(arr[i] - 1);
            }

            // if their is no last consequent of
            // arr[i] then put arr[i]
            else {
                map.put(arr[i], 1);
            }
        }
        return Collections.max(map.values());
    }

    // driver code
    public static void main(String args[])
    {
        // Take input from user
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int arr[] = new int[n];
//        for (int i = 0; i < n; i++)
//            arr[i] = sc.nextInt();
        int arr [] = {2, 12, 9, 16, 10, 5, 3, 20, 25, 11, 1, 8, 6};
        //int arr[] = {3, 7, 2, 1, 9, 8, 1}; // handle this
        //int arr [] = {15, 24, 23, 12, 19, 11, 16};
        System.out.println(LongIncrConseqSubseq(arr, arr.length));
    }
}
