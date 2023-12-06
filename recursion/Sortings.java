import java.util.*;
//selection sorting
public class Sortings {
    public static void sortin(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();


    }
    public static void main(String[] args) {
        
        int arr[] = {1, 5, 7, 2, 8, 9};
        
        for (int i = 0; i<arr.length-1;i++){
            int smallest = i;
            for (int j = i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    smallest = j;
                    
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;            
            
        }
        sortin(arr);

        
    }
    
}
