import java.util.*;
public class 2d_arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows:--");
        int rows = sc.nextInt();
        System.out.println("Enter the no of columns:--");
        int columns = sc.nextInt();

        int a[][] = new int[rows][columns];
        //input
        //rows
        for(int i = 0;i<rows;i++){
            System.out.println("Enter the no of entries:--");
            //columns
            for(int j = 1;j<columns;j++){
                a[i][j] = sc.nextInt();
            }
        }
        //output
        for(int i = 0;i<rows;i++){
            
            //columns
            for(int j = 1;j<columns;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Enter the no you wanna find:--");
        int b = sc.nextInt();
        //finding
        for(int i = 0;i<rows;i++){
            
            //columns
            for(int j = 1;j<columns;j++){
                if(b == a[i][j]){
                    System.out.println("Indices" + i + " " + j);

                }
            }


       
        

    }
}
}

    

