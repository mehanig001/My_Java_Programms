import java.security.cert.CertPathValidatorException.Reason;

public class QueuesImplementationByArray{
    static class Queue{
        static int arr[];
        static int size;
        static int rear;

        // for circular queue
        static int front;

        Queue(int n){
            arr = new int [n];
            size = n;
            rear = -1;

            // for circular queue
            front = -1;

        }
        public static boolean isEmpty(){
            //return rear == -1 ;
            
            // for circular queue
            return (rear == -1 && front == -1);
        }
         //// for circular queue
         public static boolean isFull(){
            return (rear + 1) % size == front;
         }
        public static void print(){
           while(! Queue.isEmpty()){
            System.out.print(Queue.peek() + " ");
            Queue.remove();
           }
        }
        public static void add(int data ){
            if( /*rear == size - 1 */ isFull()){
                System.out.println("Queue is already full");
            }
            // rear++;
            // for circular queue
            if(front == -1){
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Already empty");
            }
            // int front = arr[0];
            // for(int i = 0; i < size - 1; i++ ){
            //     arr[i] = arr[i + 1];
            // }
            // rear--;
            // return front;

            // for circular queue
            int result = arr[front];
            
            //deleting last ele
            if(rear == front){
                rear = front = -1;
            }
            else{
                front = (front + 1) % size;
            }
            return result;

        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Already empty");
            }
            // int front = arr[0];
            // return front;

            return arr[front];
        }

    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        System.out.println( q.remove()  + " is removed ");

        q.print();
               
    }
}