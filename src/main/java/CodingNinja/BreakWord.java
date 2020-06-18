package CodingNinja;

public class BreakWord {
    public static void main(String [] args){
        //String input = "Helloo world good morniing";

        String input = "aabbcd efg hi jklm nopqrst uv wxyb a";

        String inputArr[] = input.split(" ");

        String newInput = "";

        for(int i=0; i<inputArr.length; i++) {

            if(inputArr[i].length()%2 == 0 && inputArr[i].length()>3){
                int len = inputArr[i].length();

                newInput += inputArr[i].substring(0, len/2) + " " + inputArr[i].substring(len/2, len) + " ";

            }
            else {
                newInput += inputArr[i] + " ";
            }

        }

        System.out.println("newinput: " +  newInput);
    }
}
