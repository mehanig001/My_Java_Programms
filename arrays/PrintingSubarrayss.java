import java.util.zip.*;
public class PrintingSubarrayss {
    public static void subarrays(int arr[]){
        
        int largest = Integer.MIN_VALUE;
        int totalsubs = 0;
        for(int i = 0; i<arr.length;i++){

            
            int curr = arr[i];
            
          
            for(int j = i; j<arr.length; j++){
                int sum = 0;
                System.out.print("( ");
                
                for(int k = i; k<=j; k++){
                    System.out.print( arr[k] +"," );
                    sum += arr[k];
                    if(largest < sum){
                        largest  = sum;
                    }
                   


                }
                totalsubs++;
                
                System.out.print(") ");
            }
            System.out.println();

        }
        System.out.println(totalsubs);
        System.out.println("Sum of subset largest =" + largest);
    }
    public static void main(String[] args) {
        int nums[] = {-1,2,3,4,5,-3};
        subarrays(nums);
    }
    
}
