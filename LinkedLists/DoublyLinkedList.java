public class DoublyLinkedList {
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    } 
    public static Node head;
    public static Node tail;
    public static int size;
    public void print(){
        if(head == null){
            System.out.println("linked list is empty");
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " <--> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //add
    public void addFirst(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = tail = newnode;
            size++;
            return;
        }
        newnode.next = head;
        head.prev = newnode;
        head = newnode;
        size++;
    }
    public void addLast(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = tail = newnode;
            size++;
            return;
        }
        tail.next = newnode;
        newnode.prev = tail;
        tail = newnode;
        size++;
    }

    //remove
    public void removeFirst(){
        if(head == null){
            return;
        }
        if(head.next == null){
            head = tail = null;
            size--;
        }
        head = head.next;
        head.prev = null;
        size--;
    }
    public void removeLast(){
        if(head == null){
            return;
        }
        if(head.next == null){
            head = tail = null;
            size--;
        }
        tail = tail.prev;
        tail.next = null;
        size--;
    }
    public void rev(){
        Node curr = head;
        Node prev = null;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.addFirst(5);
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addLast(6);
    
        dll.removeFirst();
        dll.removeLast();
        System.out.println(dll.size);
        dll.rev(); 
        dll.print();
    }
}
