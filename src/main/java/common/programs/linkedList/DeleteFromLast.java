package common.programs.linkedList;


public class DeleteFromLast {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);

        deleteFromLast(list,4);
        list.display();
    }

    // delete nth node from the last
    public static LinkedList.Node deleteFromLast(LinkedList list, int n){
        LinkedList.Node first = list.head;
        LinkedList.Node last = list.head;

        if(list.isEmpty()){
            System.out.println("Linked list in empty");
            return null;
        }
        if(list.head.next == null && n == 1) {
            list.head = null;
            return list.head;
        }
        for(int i = 0; i < n; i++){
            last = last.next;
        }
        if(last == null){
            list.head = list.head.next;
            return list.head;
        }

        while(last.next != null){
            first = first.next;
            last = last.next;
        }
        first.next = first.next.next;
        return list.head;
    }
}
