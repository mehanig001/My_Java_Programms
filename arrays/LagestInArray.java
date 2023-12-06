import java.util.*;

public class LargestInArray{

    //input
    public static void getInput(int arr[]){
        Scanner sc = new Scanner(System.in);
        

        int size = sc.nextInt();
        for(int i = 0; i<size;i++){
            System.out.println("ENter Entries");
            arr[i] = sc.nextInt();
        }

    }
    //getLargest
    public static int getLargest(int arr[]){
        largest = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length;i++){
            if(largest<arr[i]){
                largest = arr[i];
        }
    }
    return largest;

    }
    public static void main(String[] args) {
        int n[] = {1,2,4,5,6};
        getInput(n);
        int k = getLargest(n);
        System.out.println(k);

    }
}