package Crio.QprepJava;

import java.util.Scanner;

public class SwitchCase {
    private static String switchCase(int m, int[] arr) {
        String output = "";
        for(int i=0; i<arr.length; i++){
            switch(arr[i]){
                case 0: output += "Zero\n";
                    break;
                case 1: output+="One\n";
                    break;
                case 2: output+="Two\n";
                    break;
                case 3: output+="Three\n";
                    break;
                case 4: output+="Four\n";
                    break;
                case 5: output+="Five\n";
                    break;
                case 6: output+="Six\n";
                    break;
                case 7: output+="Seven\n";
                    break;
                case 8: output+="Eight\n";
                    break;
                case 9: output+="Nine\n";
                    break;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] arr = new int[m];

        for(int i=0;i<m;i++)
            arr[i] = sc.nextInt();

        String res = switchCase(m, arr);

        System.out.println(res);
    }
}
