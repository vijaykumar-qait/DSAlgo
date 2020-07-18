package CodingNinja.BacktrackingDynamicProgramming;

public class PrintSubSet {
    //si -> start index
    public static void printSubsets(int input[], int output[], int si) {
        if(si == input.length){
            for(int i=0; i<output.length; i++){
                System.out.print(output[i] + " ");
            }
            System.out.println();
            return;
        }

        int newOutput[] = new int[output.length+1];
        int i=0;
        for(; i<output.length; i++){
            newOutput[i] = output[i];
        }
        newOutput[i] = input[si];
        printSubsets(input, newOutput, si+1);
        printSubsets(input, output, si+1);
    }

    public static void printSubsets(int input[]) {
        // Write your code here
        int output[] = {};
        printSubsets(input, output, 0);

    }
    public static void main(String [] args){
        int input [] = {1,2,3};
        printSubsets(input);
//        System.out.println(output.length);
    }
}
