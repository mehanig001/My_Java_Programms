import java.util.Stack;
public class nxt {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        int arr[] = {6,8,0,1,3};
        int nextGreater[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            while(!st.isEmpty() && arr[i]>=arr[st.peek()]){
                st.pop();

            }
            if(st.isEmpty()){
                nextGreater[i] = -1;

            }
            else{
                nextGreater[i] = arr[st.peek()];
            }
            st.push(i);
        }
        for(int k = 0; k < nextGreater.length; k++){
            System.out.print(nextGreater[k] + " ");
        }
        System.out.println();
    }
}
