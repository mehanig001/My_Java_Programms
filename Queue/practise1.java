import java.util.Arrays;
import java.util.*;
public class practise1 {
   
   
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(5);
        arr1.add(4);
        arr1.add(2);
        arr1.add(1);
        arr1.add(0);
		int arr[] = {0,0,1,2,0,1,0};
        Arrays.sort(arr);;
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] );
        }

       
    }
}