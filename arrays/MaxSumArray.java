import java.util.*;
public class MaxSumArray {
    // kadane's algorithm
    //time complexity O(n)
    public static void maxSumSubarray(int arr[]){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            
                currsum = currsum + arr[i];
            if(currsum<0){
                currsum = 0;
            }
            if(maxsum<currsum){
                maxsum = currsum;
            }
            
        }
        System.out.println(maxsum);
    }
    public static void main(String[] args) {
        int num[] = {-2,-3,4,-1,-2,1,5,-3};
        maxSumSubarray(num);
        
        
    }
    
}
