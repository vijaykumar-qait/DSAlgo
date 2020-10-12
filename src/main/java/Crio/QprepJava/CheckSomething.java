package Crio.QprepJava;

import java.util.ArrayList;

public class CheckSomething {

    public static void checkSomethingFunc(ArrayList<Integer> list, int n){
        if(n==1){
            list.add(n);
            return;
        }
        list.add(n);
        checkSomethingFunc(list, n-1);
    }

    public static void main(String [] args){
        ArrayList<Integer> list = new ArrayList<>();
        checkSomethingFunc(list, 5);
        System.out.println(list.toString());
    }
}
