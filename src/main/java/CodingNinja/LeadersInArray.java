package CodingNinja;

public class LeadersInArray {
    public static void main(String [] args){
        //int input[] = {3, 12, 34, 2, 0, -1};

        int input [] = {13, 17, 5, 4, 6};

        for(int i=0; i<input.length; i++){
            boolean flag = true;

            for(int j=i+1; j<input.length; j++){
                if(!(input[i]>=input[j])){
                    flag = false;
                    break;
                }
            }
            if(flag==true){
                System.out.print(input[i] + " ");
            }
        }
    }
}
