import java.util.*;
//insertion
public class Sortingsinsertion {
    public static void sortin(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();


    }
    public static void main(String[] args) {
        
         int arr[] = {15, 5, 7, 2, 8, 9};
        
        /*for (int i = 1; i<arr.length-1;i++){
            int current = arr[i];  //5
            int j = i-1; //j(0) =1
                while(j>=0 && arr[j]>current){ //
                    arr[j+1] = arr[j];
                    j--;

            }
                arr[j+1] = current;
            
                    
            
        }*/


        //insertion sort 
        for (int i = 1;i<arr.length;i++){
            int current = arr[i];
            int j = i-1;
            
                while(j>=0 && arr[j]>current){
                    arr[j+1] = arr[j];
                    j--;


                }
                arr[j+1] = current;
               
                     

                }
        sortin(arr);

        
    }
    
}
