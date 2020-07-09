package CodingNinja.OOPS;

import java.util.Arrays;

public class DynamicArray {
    private int data[];
    private int nextIndex;

    /*1*/
    public DynamicArray(){
        data = new int [5];
        nextIndex = 0;
    }

    /*2*/
    public int size(){
        return nextIndex;
    }

    /*3*/
    public void add(int element){
        if(nextIndex == data.length){
            restructure();
        }
        data[nextIndex] = element;
        nextIndex++;
    }

    /*4*/
    public void set(int index, int value){
        if(index > nextIndex){
            return;
        }
        if(index<nextIndex){
            data[index] = value;
        }
        else {
            add(value);
        }
    }

    /*5*/
    public int get(int index){
        if(index>=nextIndex){
            return -1;
        }
        return data[index];
    }

    /*6*/
    public boolean isEmpty(){
        return nextIndex == 0 ? true : false;
    }

    /*7*/
    public int removeLast(){
        if(nextIndex==0){
            return -1;
        }
        int value = data[nextIndex-1];
        data[nextIndex-1] = 0;
        nextIndex--;
        return value;
    }

    private void restructure(){
        int temp[] = data;
        data = new int[data.length * 2];
        for(int i=0; i<temp.length; i++){
            data[i] = temp[i];
        }
    }
}
