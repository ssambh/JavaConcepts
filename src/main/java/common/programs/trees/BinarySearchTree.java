package common.programs.trees;

public class BinarySearchTree {

    private Node root;

    public Node getRoot(){
        return root;
    }

    public void setRoot(int data){
        root = new Node(data);
    }

    public boolean isEmpty(){
        return root == null;
    }

    //Adding a new node to the Binary search tree
    public void add(int data){
        if(isEmpty()){
            root = new Node(data);
            return;
        }

        Node n = root;
        while(n != null){
            Node leftChild = n.getLeftChild();
            Node rightChild = n.getRightChild();

            if(data <= n.getData()){
                if(leftChild == null){
                    leftChild = new Node(data);
                    n.setLeftChild(leftChild);
                    return;
                }
                else{
                    n = leftChild;
                }
            }
            else{
                if(rightChild == null){
                    rightChild = new Node(data);
                    n.setRightChild(rightChild);
                    return;
                }
                else{
                    n = rightChild;
                }
            }
        }
    }

    //Searching a value in the binary search tree
    public Node search(int value) {
        if(isEmpty()){
            return null;
        }

        Node n = this.root;
        while(n != null){

            if(value == n.getData()){
                return n;
            }
            if(value < n.getData()){
                n = n.getLeftChild();
            }
            else{
                n = n.getRightChild();
            }
        }
        System.out.println("Value not found");
        return null;
    }

    //Printing the binary search tree
    public void printTree(Node n){
        if(n == null){
            return;
        }
        System.out.println(n.getData() + ",");
        printTree(n.getLeftChild());
        printTree(n.getRightChild());
    }

    //Pre-traversal of the binary search tree - Time complexity is O(n) as we have to visit all the nodes exactly once
    public void preTraverse(Node root){
        if (root == null){
            return;
        }
        else {
            System.out.println(root.getData());
            preTraverse(root.getLeftChild());
            preTraverse(root.getRightChild());
        }
    }

    public static void inTraverse(Node root) {
        if (root == null) return;

        inTraverse(root.getLeftChild());
        System.out.print(root.getData() + ",");
        inTraverse(root.getRightChild());
    }

    public static void postTraverse(Node root) {
        if (root == null) return;

        postTraverse(root.getLeftChild());
        postTraverse(root.getRightChild());
        System.out.print(root.getData() + ",");
    }

    private class Node {

        private int data;
        Node leftChild;
        Node rightChild;

        public Node(int data){
            this.data = data;
            leftChild = null;
            rightChild = null;
        }

        public int getData(){
            return this.data;
        }

        public void setData(int data){
            this.data = data;
        }

        public Node getLeftChild(){
            return leftChild;
        }
        public void setLeftChild(Node left){
            this.leftChild = left;
        }

        public Node getRightChild(){
            return rightChild;
        }

        public void setRightChild(Node right){
            this.rightChild = right;
        }
    }
}
