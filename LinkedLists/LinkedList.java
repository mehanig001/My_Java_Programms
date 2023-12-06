
public class LinkedList {
    public static class Node{
        int data;
        Node next;
        // connstructor --> node
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;


    // Methods 
    public void addFirst(int data){
        // step1 : Create new node
        Node newnode = new Node(data);
        size++;
        if(head == null){
            head = tail = newnode;
            return;
        }
        // step 2 : Assign val newnode.next = head
        newnode.next = head; // Link

        //step 3 : head = newnode
        head = newnode;
    }

    public void addLast(int data){
        // step1 : Create new node
        Node newnode = new Node(data);
        size++;
        if(head == null){
            head = tail = newnode;
            return;
        }
        // step 2 : Assign val newnode = tail.next
        tail.next = newnode; // Link

        //step 3 : tail = newnode;
        tail = newnode; 
    }
    
    public void print(){
        if(head == null){
            System.out.println("linked list is empty");
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "--> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void addInMid(int idx, int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        //create new node
        Node newnode = new Node(data);
        size++;
        //temp node
        Node tempnode = head;
        //find prev idx
        for(int i =0; i < idx - 1 ; i++){
            tempnode = tempnode.next;
          
        }
        //
        newnode.next = tempnode.next;
        tempnode.next = newnode;
        
    }
    // public static int removeFirst(){
    //     if(size == 0){
    //         System.out.println("LL IS EMPTY");
    //         return Integer.MIN_VALUE;
            
    //     }
    //     else if(size == 1){
    //         int val = head.data;
    //         head = tail = null;
    //         size--;
    //         return val;
    //     }
    //     int val = head.data;
    //     head = head.next;
    //     size--;
    //     return val;
    // }

    // public static int removeLast(){
    //     if(size == 0){
    //         System.out.println("LL IS EMPTY");
    //         return Integer.MIN_VALUE; 
    //     }
    //     else if(size == 1){
    //         int val = head.data;
    //         head = tail = null;
    //         size--;
    //         return val;
    //     }
    //     Node temp = head;
    //     for (int i = 0; i < size-2; i++) {
    //     temp = temp.next;

    //    }
    //     int val = temp.next.data;
    //     temp.next = null;
    //     tail = temp;
    //     size--;
    //     return val;
    // }
    // public static int itrSearch(int key){
    //     Node temp = head;
    //     for(int i = 0; i<size; i++){
    //         if(temp.data == key ){
    //             return i;
    //         }
    //         temp = temp.next;
    //     }
    //     return -1;
    // }
   
    // public static int recSearch(Node head,int key){
    //     if(head == null){
    //         return -1;
    //     }
    //     if(head.data == key){
    //         return 0;
    //     }
    //     int idx = recSearch(head.next,key);
    //     if(idx == -1){
    //         return -1;
    //     }
    //     return idx + 1;
    // }
    // public static void rev(LinkedList ll){//O(n)
    //    Node prev = null;
    //    Node curr = tail = head;
    //    Node nexts;
    //    while(curr != null){
    //    nexts = curr.next; 
    //    curr.next = prev;
    //    prev = curr;
    //    curr = nexts;
    //    }
    //    head = prev; 

    //  }
    // public static void findAndRemoveNthNodeFromEnd(int n){
    //     if(size - n == 0){
    //         head = head.next;
    //         size--;
    //         return;
    //     }
    //     Node prev = head;
    //     for(int i = 0; i<size-n-1; i++){
    //         prev =prev.next;
    //     }
    //     prev.next = prev.next.next;

    // }
    // public Node findMidNode(Node head){
    //     Node slow = head;
    //     Node fast = head;
    //     while(fast != null && fast.next != null){
    //         slow = slow.next;
    //         fast = fast.next.next;

    //     }
    //     return slow;
    // }
    // //Important = slowfast + rev half linked list;
   
    // public  boolean isPalindrome(){
    //     if(head == null || head.next == null){
    //         return true;
    //     }
    //     //1--> find mid by slow fast approach;
    //     Node mid = findMidNode(head);
    //       //2--> rev the second half;
    //     Node prev = null;
    //     Node curr = mid;
        
    //     while(curr != null){
    //         Node next = curr.next;
    //         curr.next = prev;
    //         prev = curr;
    //         curr = next;
    //     }
    //     Node right = prev; //2nd half head;
    //     Node left = head;
    //     // 3--> check right half and left half;
    //     while(right != null){
    //         if(left.data != right.data){
    //             return false;
    //         }
    //         left = left.next;
    //         right = right.next;
    //     }
    //     return true;
    // }
    // public boolean detectCycle(){ //FLoyd's cylce finding algorithm;
    //     if(head == null || head.next == null){
    //         return false;
    //     }
    //     Node slow = head;
    //     Node fast = head;

    //     while(fast != null && fast.next != null){
    //         slow = slow.next;
    //         fast = fast.next.next;
    //         if(slow == fast){
    //             return true;
    //         }
    //     }
    //     return false;

    // }
    // public void removeCycle(){
    //    //detect cycle
    //    if(head == null || head.next == null){
    //     return ;
    // }
    // Node slow = head;
    // Node fast = head;
    // boolean flag = false;

    // while(fast != null && fast.next != null){
    //     slow = slow.next;
    //     fast = fast.next.next;
    //     if(slow == fast){
    //         flag = true;
    //         break ;
    //     }
    // }
    // if(flag == false){
    //     return;
    // }

    // //find meeting point;
    // Node prev = null;
    // slow = head;
    // while(slow != fast){
    //     prev = fast;
    //     slow = slow.next;
    //     fast = fast.next;
    // }
    // // remove
    // prev.next = null; 
 
    // }
    private Node getMid(Node head){
        // find mid
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    // private Node merge(Node leftHead, Node rightHead){
    //     Node mergedLL = new Node( -1);
    //     Node temp = mergedLL;

    //     while (leftHead != null && rightHead != null){
    //         if(leftHead.data <= rightHead.data){
    //             temp.next = leftHead;
    //             leftHead = leftHead.next;
    //             temp = temp.next;
    //         }
    //         else {
    //             temp.next = rightHead;
    //             rightHead = rightHead.next;
    //             temp = temp.next;
    //         }
    //       }
    //     while(leftHead != null){
    //         temp.next = leftHead;
    //         leftHead = leftHead.next;
    //         temp = temp.next;
    //     }
    //     while(rightHead != null){
    //         temp.next = rightHead;
    //         rightHead = rightHead.next;
    //         temp = temp.next;
    //     }
    //     return mergedLL.next;
    // }
    
    // public Node mergeSort(Node head){
    //     if(head == null || head.next == null){
    //         return head; 
    //     }
    //     Node mid = getMid(head);
    //     // call merge sort for left and right part
    //     Node leftHead = head;
    //     Node rightHead = mid.next;
    //     mid.next = null;
    //     Node  newLeft =  mergeSort(leftHead);
    //     Node newRight =  mergeSort(rightHead);

    //     //merge
    //     return merge(newLeft, newRight);
        
    // }

    public Node zigZag(Node head){
        Node mid = getMid(head);
       
               //2--> rev the second half;
        Node prev = null;
        Node curr = mid.next;
        mid.next = null;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; //2nd half head;
        Node left = head;
        
       
        
        Node zigzagLL = new Node( -1);
        Node temp = zigzagLL;
        int i = 0;
        Node nextL,nextR;
        while( left != null && right != null){
        // if(i%2 == 0){   even me kam nhi kiya
        //     temp.next = left;
        //     left = left.next;
        //     temp = temp.next;
        //     i++;
        // }
        // else{
        //     temp.next = right;
        //     right = right.next;
        //     temp = temp.next;
        //     i++;
        // }

        // }
        nextL = left.next;
        left.next = right;
        nextR = right.next;
        right.next = nextL;

        left = nextL;
        right = nextR;
        }
        return temp.next;
        
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        
        ll.addFirst(5);
        
        ll.addFirst(6);
        
        ll.addLast(12);
        
        ll.addLast(4);
        ll.addLast(45);
     
       
        
        // ll.addInMid(4, 5);

        // System.out.println(removeFirst());
        // System.out.println(removeLast());
        // ll.print();
        // System.out.println("Size of Linked list is " + ll.size );
        // System.out.println(itrSearch(2));
        // System.out.println(recSearch(head, 3));
        // rev(ll);
        // findAndRemoveNthNodeFromEnd(2);
        // ll.print();
        // ll.addLast(4);

        
        // System.out.println( ll.isPalindrome());
        // LinkedList ll2 = new LinkedList();
        // head = new Node(1);
        // Node temp = new Node(2);
        // head.next = temp;
        // head.next.next = new Node(3);
        // head.next.next.next = temp; 
        // System.out.println( ll2.detectCycle() );
        // ll2.removeCycle();
        // System.out.println( ll2.detectCycle() );
        // ll.head =  ll.mergeSort(ll.head);
        ll.print();
        ll.zigZag(head);
        ll.print();
      
        }
}
