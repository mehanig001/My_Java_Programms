import java.util.LinkedList;
import java.util.Queue;
public class QueueByJCF {
    public static void main(String[] args) {
        Queue q = new LinkedList<>();  // ArrayDeque instead of linkedlist read article
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);


        System.out.println( q.remove()  + " is Removed");
        Object top = q.remove();
        
        while(!q.isEmpty()){
            System.out.print( q.peek() + " ");
            q.remove();
        }
    }
}
