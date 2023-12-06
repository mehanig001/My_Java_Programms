import java.util.Stack;
import java.util.ArrayList;
    
public class PushAtBottomStack {
  
    public static void pushAtBottom( Stack<Integer> st,int data){
        if(st.isEmpty() == true){
            st.push(data);
            return ;
        }
            int top = st.pop();
            pushAtBottom(st,data);
            st.push(top);

            return ;
        
      
    }
    public static void spanOfStock(int arr[]) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        // stack me prevhigh ka indx
        //list me apan =  (i - prevhigh ka idx)
        
        st.push(0);
        list.add(1);
        int i = 1;
        
        while(i != arr.length){
            int prevhigh = st.peek();
            if(arr[i] <  arr[prevhigh]){
                list.add(i - st.peek());
                st.push(i);
                i++;
            }
            
           
            else if(st.isEmpty()){
                list.add(i+1);
                i++;
            }
            else{
                st.pop();
            }
           
        }
        System.out.println(list);
        
        
            
        }
    
    public static void revString(String str){
        Stack<Character> s = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            s.push(str.charAt(i));
        }
       str = "";
        while(! s.isEmpty()){
            str += s.peek();
            s.pop();
        }
        System.out.println(str);
    }
    public static void revStack(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        int top = st.pop();
        
        revStack(st);
        pushAtBottom(st, top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
  
        
        //pushAtBottom(st,100);
        revStack(st);

        while(! st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
        }

        String str = "Gautam";
        revString(str);
            int arr[] = {100,80,60,70,60,85,100};
            spanOfStock(arr);
    }
}
