import java.util.*;
public class TramppingRainwaterArray {
    /*  public static int trappingRainwater(int arr[],int width){
        
        int left_max = Integer.MIN_VALUE;
        int right_max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0;i < arr.length;i++){
            //claculating max hieght from left
            for(int j = 0;j<=i;j++){
                if(left_max < arr[j]){
                    left_max = arr[j];
                    System.out.println("LeftMAx = " + left_max);
                }
            }

            right_max = arr[i];
            for(int j = i+1; j<arr.length; j++){
                
                if(right_max<arr[j]){
                    right_max = arr[j];
                    System.out.println("RighttMAx = " +right_max);
                }
               
            }
            int wl = Math.min(right_max, left_max); //wl water_level
            System.out.println("Water level = " + wl);
            int tw = (wl - arr[i])*width;
            System.out.println(tw);
            sum += tw;

            }
            return sum;
        }


      
    
    public static void main(String[] args) {
        int heights[] = {4,2,0,6,3,2,5};
        int tw = trappingRainwater(heights, 1);
        System.out.println(tw);
    }
    */
    public static int trappingRainwater(int arr[]){
        // time complexity O(nṇ)
        int l = arr.length;
        //leftmaxArray
        int leftmax[] = new int [l];
        leftmax[0] = arr[0];
        for(int i = 1; i < l; i++){
            leftmax[i] = Math.max(leftmax[i-1], arr[i]);
        }
        //rightMaxArray
        int rightmax[] = new int [l];
        rightmax[l-1] = arr[l-1];
        for(int i = l-2; i >= 0 ; i--){
            rightmax[i] = Math.max(rightmax[i+1], arr[i]);
        }
        int tw = 0;
        //loop
        for(int i = 0; i < l ; i++){
            //water level = min rightmax,leftmax
            int wl = Math.min(leftmax[i], rightmax[i]);
            //trapped water
            tw += wl-arr[i];
        }
        
       
        return tw;
    }
    public static void main(String[] args) {
        int heights[] = {4,2,0,6,3,2,5};
        System.out.println( trappingRainwater(heights));
    }
}
    

