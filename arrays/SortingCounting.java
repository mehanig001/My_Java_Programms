import java.util.*;
public class SortingCounting {
    public static void countingArray(int arr[]){
    
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }
        //counting freq
        int counts[] = new int[largest + 1];
        for(int i = 0; i<arr.length; i++){
            counts[arr[i]]++;
        }
        //sorting
        int j =0;
        for(int i = 0; i<counts.length; i++){
            while (counts[i]>0){
                arr[j] = i;
                j++;
                counts[i]--;

            }
        }

        
    
    }
    public static void main(String[] args) {
        int lengths[] = {1,4,1,3,2,4,3,7};
        countingArray(lengths);
        for(int i = 0;i<lengths.length;i++){
            System.out.print(lengths[i] + " ");

        }
        System.out.println();
    }
}
