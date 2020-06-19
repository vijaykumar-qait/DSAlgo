package DSAndAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DiffBetweenTwoString {

    static String[] diffBetweenTwoStrings(String source, String target) {
        // your code goes here
        char [] sourceArr = source.toCharArray();
        char [] targetArr = target.toCharArray();
        Arrays.sort(sourceArr);
        Arrays.sort(targetArr);

        int i=0, j=0;
        List<String> list = new ArrayList<>();

        while(i<sourceArr.length && j<targetArr.length){
            if(sourceArr[i] == targetArr[j]){
                list.add(""+sourceArr[i]);
                i++;
                j++;
            }
            else {
                if(sourceArr[i]<targetArr[j]){
                    list.add("-"+sourceArr[i]);
                    i++;
                }
                else {
                    list.add("+"+targetArr[j]);
                    j++;
                }
            }
        }

        while(i<sourceArr.length){
            list.add("-"+sourceArr[i]);
            i++;
        }

        while (j<targetArr.length){
            list.add("+"+targetArr[j]);
            j++;
        }

        Object[] objArr = list.toArray();
        String [] strArr = Arrays.copyOf(objArr, objArr.length, String[].class);
        Arrays.sort(strArr);
        return strArr;
    }

    public static void main(String [] args){
        String source = "ABCDEFG";
        String target = "ABDFFGH";

//        String source = "CCBC";
//        String target = "CABAABBC";

//        Scanner scanner = new Scanner(System.in);
//        String source = scanner.nextLine();
//        String target = scanner.nextLine();
        System.out.print(Arrays.toString(diffBetweenTwoStrings(source, target)));
    }
}
