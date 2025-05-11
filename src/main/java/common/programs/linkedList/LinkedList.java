package common.programs.linkedList;

public class LinkedList {
    public Node head;
    public Node tail;
    private int size;

     public LinkedList() {
        head = null;
        this.size = 0;
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size++;
    }

    public void insertLast(int value){
         Node node = new Node(value);

         if(head == null){
             tail = node;
             head = tail;
         }

         tail.next = node;
         tail = node;
         size++;
    }

    public void insertAtIndex(int value, int index){
        if (index > size) {
            System.err.println("Index is greater than size");
            return;
        }

        if(index == size){
            insertLast(value);
            return;
        }
        if(index == 0){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        Node temp = head;
        int count = 1;
        while(count < index){
            temp = temp.next;
            count++;
        }
        node.next = temp.next;
        temp.next = node;

    }

    public void deleteFirst(){
         if(head == null){
             System.err.println("Empty list, Nothing to delete");
         }
         else if(head == tail){
             head = null;
             return;
         }
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public boolean isEmpty(){
         if(head == null){
             return true;
         }
         return false;
    }

    public class Node{
        public int value;
        public Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}
