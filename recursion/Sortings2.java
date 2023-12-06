import java.util.*;
public class Sortings2 {
    //Selection sort
    public static void sortin(int arr[]){
        for(int i =0;i<arr.length;i++){
            
            System.out.print(arr[i] + " ");
        }
        System.out.println();


    }
    public static void main(String[] args) {
        
        int arr[] = {7, 5, 1, 2, 8, 9};
        for (int i = 0; i<arr.length-1;i++){
            int small = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[small]>arr[j]){
                    
                        //swap
                   
                    small = j;
                    
            }
            

            
            
            
        }
        //swap
        int  temp = arr[small];
        arr[small] = arr[i];
        arr[i] = temp;
        

        
        }
        sortin(arr);
    }
}
