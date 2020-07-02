package CodingNinja;

public class PrintKeyPad {

    public static void printKeypad(int input, String outputSoFar){
        if(input == 0){
            System.out.println(outputSoFar);
            return;
        }
        int num = input%10;
        for(String s : KeyPadRecursion.getChar(num)){
            printKeypad(input/10, s + outputSoFar);
        }
    }


    public static void printKeypad(int input){
        printKeypad(input, "");
    }

    public static void main(String [] args){
        int num = 234;
        printKeypad(num);
    }
}
