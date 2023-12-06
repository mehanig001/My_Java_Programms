import java.lang.annotation.Retention;

public class Queues{
    static class Queue{
        static int arr[];
        static int size;
        static int rear;

        Queue(int n){
            arr = new int [n];
            size = n;
            rear = -1;

        }
        public static boolean isEmpty(){
            return rear == -1;
        }
        public static void print(){
            for(int i = 0; i < size; i++){
                System.out.print(arr[i] + " ");
            }
        }
        public static void add(int data ){
            if(rear == size - 1){
                System.out.println("array is already full");
            }
            rear++;
            arr[rear] = data;
        }

        public static int remove(int i){
            for(int j = i; j < size - 1; j++){
                arr[j] = arr[j + 1];
            }
            rear--;
            return arr[i];
        }
        
        

    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
      
        q.remove(2);
        q.print();        
    }
}