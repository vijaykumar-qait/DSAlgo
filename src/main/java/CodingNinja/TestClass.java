package CodingNinja;

import java.util.Arrays;

public class TestClass {
    public static void main(String [] args){
//        String arr[] = {"ruby", "c", "python", "java"};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));

        String a = "abc";
        String b = "abc";
        String c = new String("abc");
        String d = new String("abc");
        if(a==b){
            System.out.println("1");
        }
        if(a==c){
            System.out.println("2");
        }
        if(c==d){
            System.out.println("3");
        }
    }
}
