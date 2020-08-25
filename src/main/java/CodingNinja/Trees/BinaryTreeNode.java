package CodingNinja.Trees;

public class BinaryTreeNode<T> {
    T data;
    BinaryTreeNode <T> leftChild;
    BinaryTreeNode <T> rightChild;

    public BinaryTreeNode(T data){
        this.data = data;
        leftChild = null;
        rightChild = null;
    }
}
