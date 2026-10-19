package Exercise1;

/**
 * Name:Furkan Bozkurt
 * Date:17.10.2026
 */
public class SinglyLinkedList {
    private Node head;

    public SinglyLinkedList(){
        head = null;
    }
    public void add(int data) {
        Node new_node = new Node(data);

        if (head == null){
            head = new_node ;

        }
        else{
            Node current = head ;
            while (current.next  != null){
                current = current.next ;

            }
            current.next = new_node ;

        }
    }
    public void display(){
        Node current = head ;

        while (current != null){
            System.out.print(current.data + " --> ");
            current = current.next;

        }
        System.out.println("NULL");

    }
    public Node findMiddle(){
        int count = 0;
        Node current = head ;
        while ( current != null){
            count++;
            current = current.next ;
        }
        int middleIndex = count / 2 ;
        current = head ;
        for(int i=0 ; i < middleIndex ; i++){
            current = current.next;
        }
        return current;


    }


    public Node getHead(){
        return head;
    }


}
