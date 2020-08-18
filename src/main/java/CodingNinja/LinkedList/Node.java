package CodingNinja.LinkedList;

public class Node <T>{
    public T data;
    public Node <T> next;
    public Node(T data){
        this.data = data;
        this.next = null;
    }

    public void setData(T data){
        this.data = data;
    }

    public T getData(){
        return this.data;
    }

}
