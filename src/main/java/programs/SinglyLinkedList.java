package programs;

//Represent a node of the singly linked list  
class Node{
	int data;
	Node next;
	
	public Node(int data){
		this.data = data;
		this.next = null;
	}
}
public class SinglyLinkedList {
	//Represent the head and tail of the singly linked list    
    public Node head = null;    
    public Node tail = null;    
    
    SinglyLinkedList(){
    	this.head = null;
    	this.tail = null;
    }
    
    SinglyLinkedList(SinglyLinkedList list){
    	
    	int count = 1;
    	while(count <= list.size()) {
    		addNode(list.getNode(count).data);
    		count++;
    	}
    }
    
    public void addNode(int data) {    
        //Create a new node    
        Node newNode = new Node(data);    
            
        //Checks if the list is empty    
        if(head == null) {    
            //If list is empty, both head and tail will point to new node    
            head = newNode;    
            tail = newNode;    
        }    
        else {    
            //newNode will be added after tail such that tail's next will point to newNode    
            tail.next = newNode;    
            //newNode will become new tail of the list    
            tail = newNode;  
            tail.next = null;
        }    
    }    
        
    //display() will display all the nodes present in the list    
    public void display() {    
        //Node current will point to head    
        Node current = head;    
            
        if(head == null) {    
            System.out.println("List is empty");    
            return;    
        }    
        System.out.println("Nodes of singly linked list: ");    
        while(current != null) {    
            //Prints each node by incrementing pointer    
            System.out.print(current.data + " ");    
            current = current.next;    
        }    
        System.out.println();
    }
    
    public int size() {
    	int count = 0;
    	Node temp = head;
    	
    	while(temp != null) {
    		temp = temp.next;
    		count++;
    	}
    	return count;
    }
    
    public Node getNode(int index) {
    	Node n = this.head;
    	int count = 0;
    	
    	while(count < index) {
    		n = n.next;
    		count++;
    	}
    	return n;
    }
}
