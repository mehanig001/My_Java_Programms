import java.util.*;
public class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size here");
        int size = sc.nextInt();
        
        int numbers[] = new int[size];
      
        for (int i = 0; i<size;i++){
            System.out.println("Enter the entries here");
            int inputs = sc.nextInt();
            numbers[i]=inputs;

        }
        System.out.println("ENter the number you want to find");
        int findit = sc.nextInt();
        for(int j = 0;j<size ; j++){
            if(numbers[j] == findit){
                System.out.println("Location of the no is " + j);
            }
        }

    }
}
