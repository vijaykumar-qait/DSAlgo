package CodingNinja.PriorityQueue;

public class MinPriorityQueueUsage {
    public static void main(String [] args){
        MinPriorityQueue minQueue = new MinPriorityQueue();
        int arr[] = {5,1,9,2,0};

        for(int ele : arr){
            minQueue.insert(ele);
        }

        while (!minQueue.isEmpty()){
            try {
                System.out.print(minQueue.remove()+ " ");
            }
            catch (HeapEmptyException e){

            }

        }
    }
}
