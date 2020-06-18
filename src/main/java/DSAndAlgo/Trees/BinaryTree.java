package DSAndAlgo.Trees;

import java.util.Stack;

public class BinaryTree {

    Node root;

    //recursive method to do insertion of value
    private Node addRecursive(Node current, int value){
        if(current == null){
            return new Node(value);
        }

        if(value < current.value){
            current.left = addRecursive(current.left, value);
        }
        else if(value > current.value){
            current.right = addRecursive(current.right, value);
        }
        else {
            //value already exist;
            return current;
        }
        return current;
    }

    //public method that start recursion from root node
    public void add(int value){
        root = addRecursive(root, value);
    }


    //public method for pre_order display
    public void preOrderTraversal(Node temp){
        if(temp != null){
            System.out.print(temp.value + " -> ");
            preOrderTraversal(temp.left);
            preOrderTraversal(temp.right);
        }
    }

    //public method for pre order traversal iterative
    public void preOrderTraversalIterative(Node temp){

        if(temp == null){
            return;
        }

        Stack<Node> stack = new Stack<Node>();
        stack.push(temp);

        while (stack.isEmpty() == false){
            Node myNode = stack.peek();
            System.out.print(myNode.value + " -> ");
            stack.pop();

            if(myNode.right != null){
                stack.push(myNode.right);
            }

            if(myNode.left != null) {
                stack.push(myNode.left);
            }

        }
    }

    public void inOrderTraversalIterative(Node temp){
        if(temp == null) {
            return;
        }

        Stack<Node> stack = new Stack<Node>();
        Node curr = temp;

        while (curr != null || stack.size()>0){

            while (curr!=null){
                stack.push(curr);
                curr = curr.left;
            }

            curr = stack.pop();

            System.out.print(curr.value + " -> ");

            curr = curr.right;
        }
    }

    //public method for inorder traversal
    public void inOrderTraversal(Node temp){
        if(temp!=null){
            inOrderTraversal(temp.left);
            System.out.print(temp.value + " -> ");
            inOrderTraversal(temp.right);
        }
    }

    //public method for postOrder traversal
    public void postOrderTraversal(Node temp){
        if(temp!=null){
            postOrderTraversal(temp.left);
            postOrderTraversal(temp.right);
            System.out.print(temp.value + " -> ");
        }
    }

    private BinaryTree createBinaryTree(){
        BinaryTree bt = new BinaryTree();
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        return bt;
    }

    public static void main(String args[]){
        BinaryTree bt = new BinaryTree();
        bt = bt.createBinaryTree();
        System.out.print("Pre order: ");
        bt.preOrderTraversal(bt.root);
        System.out.println();
        System.out.print("Pre order: ");
        bt.preOrderTraversalIterative(bt.root);
        System.out.println();
        System.out.print("Inorder order: ");
        bt.inOrderTraversal(bt.root);
        System.out.println();
        System.out.print("Inorder order: ");
        bt.inOrderTraversalIterative(bt.root);
        System.out.println();
        System.out.print("post order: ");
        bt.postOrderTraversal(bt.root);
    }
}
