package CodingNinja.PriorityQueue;

public class MaxPriorityQueueUsage {
    public static void main(String [] args){
        MaxPriorityQueue maxQueue = new MaxPriorityQueue();
        int arr[] = {5,1,9,2,0};

        for(int ele : arr){
            maxQueue.insert(ele);
        }

        System.out.println(maxQueue.toString());

        while (!maxQueue.isEmpty()){
            try {
                System.out.print(maxQueue.removeMax()+ " ");
            }
            catch (HeapEmptyException e){

            }

        }
    }
}
