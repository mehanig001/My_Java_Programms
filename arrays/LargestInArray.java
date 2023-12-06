import java.util.*;

public class LargestInArray{

    //input
    public static void getInput(int arr[]){
        Scanner sc = new Scanner(System.in);
       
        for(int i = 0; i<arr.length;i++){
            System.out.println("ENter Entries");
            arr[i] = sc.nextInt();
        }

    }
    //getLargest
    public static int getLargest(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length;i++){
            if(largest<arr[i]){
                largest = arr[i];
        }
    }
    return largest;

    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size here");
        int size = sc.nextInt();

        int n[] = new int [size];
        getInput(n);
        int k = getLargest(n);
        System.out.println("Largest no found = " + k);

    }
}