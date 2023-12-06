public class PractiseAtHome {
    
    public class Nodes{
        int data;
        Nodes next;

        public void Node(int data){
            this.data = data;
            this.next = null;
        }
       
    }
    Nodes head;
    Nodes tail;
    public void addLast(int data){
        if(head == null || tail == null){
           Nodes newnode = new Nodes();
           head = newnode;
        }
        Nodes newnode = new Nodes();
        newnode = tail.next;
        tail = newnode;
    }
    public static void main(String[] args) {
        PractiseAtHome ll = new PractiseAtHome();
        ll.addLast(1);
    }
}
