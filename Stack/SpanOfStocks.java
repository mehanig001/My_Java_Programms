import java.util.Stack;
import java.util.ArrayList;
public class SpanOfStocks {
    public static void span(int arr[]) {
        ArrayList<Integer> list = new ArrayList<>();
        //stack me prev high ka idx lenge 
        Stack<Integer> st = new Stack<>();
        st.push(0);
        int prev = st.peek();
        list.add(1);
        for(int i = 1; i < arr.length; i++){
            while(st.isEmpty() == false && arr[i] > arr[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                list.add(i+1);
           
            }
            else{
                list.add(i - st.peek());
            }
            st.push(i);
        }
        System.out.println(list);
    }

  
    public static void main(String[] args) {
        int arr[] = {100,80,60,70,60,85,100};
        span(arr);
    }
}
