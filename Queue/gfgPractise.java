import java.util.ArrayList;

import javax.print.attribute.standard.RequestingUserName;
public class gfgPractise {
    
     //Function to find the leaders in the array.
     static int leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> l = new ArrayList<>();
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                while(arr[i]< arr[j]){
                    i++;
                }  
            }
            l.add(arr[i]); 
        }
        System.out.println(l);
        return -1;
     }
     public static void main(String[] args) {
        int arr[] = {16,17,4,3,5,2};
         System.out.println( leaders(arr, 6) );
     }
}
