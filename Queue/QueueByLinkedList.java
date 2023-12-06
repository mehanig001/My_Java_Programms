import java.util.LinkedList;
public class QueueByLinkedList {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Queue{
        static Node head = null;
        static Node tail = null;
    
    public static boolean isEmpty(){
        return head == null && tail == null;
    }
    public static void add(int data){
        Node newnode = new Node(data);
        if(isEmpty()){
            head = tail = newnode;
            return;
        }
        
        tail.next = newnode;
        tail = newnode; 
    }
    public static int remove(){
        if(isEmpty()){
            System.out.println("Already empty");
            return -1;
        }
        else if(tail == head){
            int front = head.data;
            tail = head = null;
            return front;
            
        }
        int front = head.data;
        head = head.next;
        return front;
    }
    public static int peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
        }
        return head.data;
    }
}
    

    
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);


        System.out.println( q.remove()  + " is Removed");

        while(!q.isEmpty()){
            System.out.print( q.peek() + " ");
            q.remove();
        }
        
    }
}
