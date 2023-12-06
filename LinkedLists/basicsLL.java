public class basicsLL {
    public static class Node{

        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public static void add(int data){
        Node newnode = new Node(data);
        size++;
        if(head == null){
            head = tail = newnode;
        }
        
        tail.next = newnode;
        tail = newnode;
    }
    public static void print(){
        Node temp = head;
        while(temp != null ){
            System.out.print(temp.data + " -->  ");
            temp = temp.next;

        }
        System.out.println("null");
    }
    public static Node rev(){
        Node prev = null;
        Node curr = tail = head;
        Node nexts = head;

       while(curr != null){
        // 1-->2-->3-->4-->null
        nexts = curr.next;

        curr.next = prev;

        prev = curr;

        curr = nexts;
       }
       head = prev;
       
       return head;
    }
    public static int length(Node head){
        int l = 0;
        // return size;
        if(head == null){
            return l;
        }
            l++;
            length(head.next);
            
        return l;
    }
    public static Node revInGroup(Node head,int k ){
        Node temp = head;
        for(int i = 0; i < (size - size%k); i+=k){
            int j = 0;
            while(j <= k/2){
            
            j++;
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        
        basicsLL.add(1);
        basicsLL.add(2);
        basicsLL.add(3);
        basicsLL.add(4);
        basicsLL.add(5);
        basicsLL.add(6);
        basicsLL.add(7);
        basicsLL.add(8);
        basicsLL.add(9);
        basicsLL.add(10);
        basicsLL.print();
        basicsLL.rev();
    
        basicsLL.print();

        basicsLL.revInGroup(head, 4);
        basicsLL.print();
        System.out.println( basicsLL.length(head) );

    }

}