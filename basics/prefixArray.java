import java.util.*;

public class prefixArray {
    public static void maxSubarraySum(int arr[]){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        //clalculating preafix array 
        for(int i = 1;i<prefix.length;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        for(int i = 0; i<arr.length;i++){
            int start = i;
            for(int j = i;j<arr.length;j++){
                int end = j;
                currsum = start == 0? prefix[end]:prefix[end] - prefix[start-1];
                if(maxsum<currsum){
                    maxsum = currsum;
                }
                
            }
         
        }
        System.out.println(maxsum);
        for(int i = 0; i < prefix.length; i++){
            System.out.print(prefix[i] + " ");
        }
    }
    public static void main(String[] args) {
        int num[] = {-1,2,3,-8,4,5,-3};
        maxSubarraySum(num);
        
    }
}
