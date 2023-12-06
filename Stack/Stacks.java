import java.util.*;
public class Stacks {
    // IN LINKEDLIST
    // static class Node{
    //     int data;
    //     Node next;
    //     public Node(int data) {
    //         this.data = data;
    //         this.next = null;
    //     }
    // }
   
    // static class Stack{
    //     public static Node head;
    //     public boolean isEmpty(){
    //         if(head == null){
    //             return true;
    //         }
    //         return false;
    //     }
    //     public void push(int data){ // ADD NEW NODE ON STACK
    //         Node newnode = new Node(data);
    //         if(isEmpty()){
    //             head = newnode;
    //             return; 
    //         }
    //         newnode.next = head;
    //         head = newnode;
    //         return;
    //     }
    //     public int pop( ){// remove upper data
    //         if(isEmpty()) return Integer.MIN_VALUE;
    //         int val = head.data;
    //         head = head.next;
    //         return val;
    //     }
    //     public int peek(){
    //         if(isEmpty()){
    //             return Integer.MIN_VALUE;
    //         }
    //         int val = head.data;
    //         return val;
    //     }
       
    // }

        //In Array List
        static class Stack{
            ArrayList<Integer> al = new ArrayList<>();
            public boolean isEmpty(){
                if(al.size() == 0){
                    return true;
                }
                return false;
            }
            
            public void push(int data){
                al.add(data);
            }
            public int peek(){
                return (al.get(al.size() - 1) );
            }
            public int pop(){
                int val = al.get(al.size() - 1);
                al.remove( al.get(al.size() - 1));
                return val;
            }
        }



    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        
       while(! st.isEmpty()){
        System.out.println( st.peek() );
        st.pop();
       }
    }
}
