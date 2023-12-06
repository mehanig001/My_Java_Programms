import java.util.LinkedList;
import java.util.Stack;

public class JavaCollectionFrameworks {
    public static void main(String[] args) {
        //create // Node wala 
        LinkedList<Integer> ll = new LinkedList<>();
        
        //add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        System.out.println(ll);
        //remove
        ll.removeLast();
        ll.removeFirst();

        //Stack
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        
       while(! st.isEmpty()){
        System.out.println( st.peek());
        st.pop();
       }

    }
}
