package CodingNinja.BacktrackingDynamicProgramming;

import java.util.Scanner;
import java.util.stream.IntStream;

public class FairWorkload {
    /**
     * Fair work load
     * Send Feedback
     * We are Given N number of cabinets and every cabinet has a certain amount of files. We want to go through each and every file in these cabinets and for that, we have x number of workers. Distribute the work amongst x workers such that the difference between the number of files that two worker goes through is minimized and the amount that one worker does is maximized.
     * The constraint is - a worker can go through only cabinets that are adjacent.
     * Return the maximum amount of work (Work is defined as the amount of files a worker has to go through) a worker is doing in such an arrangement.
     * For Example :-
     * Given 9 cabinets each containing 10 20 30 40 50 60 70 80 90 folders and with 3 workers, we can divide the cabinets in 10 20 30 40 50 | 60 70 | 80 90 . So in this case output should be 170, as it is the maximum amount of work done by any worker.
     * Input format:
     * <p>
     * Line 1: N (Number of cabinets)
     * <p>
     * Line 2: N integers denoting the number of files in the cabinets respectively (separated by space)
     * <p>
     * Line 3: x (No. of workers)
     * <p>
     * Output format: A single integer, denoting the maximum work any worker is doing such that difference in work between two workers is minimized
     */

    private FairWorkload fw;

    public static int getMostWork(int[] folders, int workers) {

        // a more detailed explanation of the algorithm can be found here :
        // http://help.topcoder.com/data-science/competing-in-algorithm-challenges/algorithm-tutorials/binary-search/


        // the minimum workload corresponds to the maximum amount of files that can be found in the provided folders
        int lo = IntStream.of(folders).max().getAsInt();
        // the maximum amounth of files is simply the sum of all the files from all the folders.
        int hi = IntStream.of(folders).sum();

        // there needs to be found the maximum configuration which can be handled by the provided
        // number of workers (binary search algorithm is applied) by constantly refining the maximum workload
        // to be handled by a worker.
        while (lo < hi) {
            int maxWorkLoad = lo + (hi - lo) / 2;
            int requiredWorkers = 1;
            int currentLoad = 0;
            for (int i = 0; i < folders.length; i++) {
                if (currentLoad + folders[i] > maxWorkLoad) {
                    currentLoad = 0;
                    requiredWorkers++;
                }

                currentLoad += folders[i];
            }

            // requiredWorkers is indirect proportional with their load
            // when the number of required workers grow, the workload needs to decrease (and vice versa)
            if (requiredWorkers <= workers) {
                hi = maxWorkLoad;
            } else {
                lo = maxWorkLoad + 1;
            }
        }

        return lo;
    }

    /*
     * Return the sum of the elements in the nums array
     * starting at s and stopping just before e.
     */
//    private static  int sumSections(int s, int e, int[] nums) {
//        int sum = 0;
//
//        for (int x = s; x < e; x++)  {
//            sum += nums[x];
//        }
//
//        return sum;
//    }


    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
//        int arr [] = {10, 20, 30, 40, 50, 60, 70, 80, 90};
//        int n = 3;

        int size = scanner.nextInt();

        int folders[] = new int [size];

        for(int i=0; i<size ; i++){
            folders[i] = scanner.nextInt();
        }

        int workers = scanner.nextInt();

        System.out.println(getMostWork(folders, workers));
    }
}
