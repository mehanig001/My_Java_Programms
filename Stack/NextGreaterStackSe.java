import java.util.Stack;
public class NextGreaterStackSe {
    //right se traverse krte hai 
    // stack me idx store krte hai next ka
    //stack khali krte h jab tak bada ele n mile
    //nxtgreatese[] me add ke dete h mil gaya to nhi to -1
   
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        int arr[] = {6,8,0,1,3};
        int nextGreater[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) { 
            // chote ele ka idx hata rahe h stack se
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
