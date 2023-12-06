import java.sql.Array;
import java.util.Stack;
public class MaxAreaHistogramStack {
    public static void print(int arr[]){
        for(int k = 0; k < arr.length; k++){
            System.out.print(arr[k] + " ");
        }
        System.out.println();
    }
    public static void nextSmallestRight(int arr[], int nsr[]){// 1,-1,2,2,-1,-1
        Stack<Integer> st = new Stack<>();
        
        for(int i = arr.length - 1; i>=0; i--){
            // bade ele ka idx hata rahe h stack se
            while(!st.isEmpty() && arr[i]<=arr[st.peek()]){
            st.pop();
            }
            if(st.isEmpty()){
                nsr[i] = arr.length;

            }
            else{
                nsr[i] = st.peek();
            }
            st.push(i);
        }
        
    }
    public static void nextSmallestLeft(int arr[],int nsl[]){// 1,-1,2,2,-1,-1
        Stack<Integer> st = new Stack<>();
        
        for(int i = 0; i < arr.length; i++){
            // bade ele ka idx hata rahe h stack se
            while(!st.isEmpty() && arr[i]<=arr[st.peek()]){
            st.pop();
            }
            if(st.isEmpty()){
                nsl[i] = -1;

            }
            else{
                nsl[i] = st.peek();
            }
            st.push(i);
        }
      
    }

    public static void main(String[] args) {
        int arr[] = {2,1,5,4,2,3};
        int nsr[] = new int[arr.length]; 
        int nsl[] = new int[arr.length]; 
        nextSmallestRight(arr,nsr);
        nextSmallestLeft(arr,nsl);
        int maxarea = 0;
        for(int k = 0; k < nsl.length; k++){
           int j = nsr[k];
           int i  = nsl[k];
           int hieght = arr[k];
           int area = hieght * (j - i - 1);
           if(maxarea < area){
            maxarea = area;
           }
        }
        System.out.println(maxarea);
       
    }
    
}
