import java.util.Stack;

public class QueueUsing2Stacks {
    static class Queue{
        static Stack<Integer> st1 = new Stack<>();
        static Stack<Integer> st2 = new Stack<>();

        public static boolean isEmpty(){
            return st1.isEmpty();
        }
        public static void add(int data){
            // O (n)

            //st1 khali kre
           
            while(!st1.isEmpty()){
                st2.push(st1.pop());
            }

            // data dal de 
            st1.push(data);

            // wapas st2 se st1 me lana h
            while(!st2.isEmpty()){
                st1.push(st2.pop());
            }
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("queue is empty");
            }
            return st1.peek();
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return st1.pop();
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        while(!q.isEmpty()){
            System.out.println( q.peek() );
            q.remove();
            
        }
    }
}
