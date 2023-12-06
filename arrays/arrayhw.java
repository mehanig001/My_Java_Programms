import java.util.*;
public class arrayhw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of rows:--");
        int rows = sc.nextInt();
        System.out.print("Enter the no of columns:--");
        int columns = sc.nextInt();

        int a[][] = new int[rows][columns];
        //input
        //rows
        System.out.print("Enter the entries:--");
        for(int i = 0;i<1;i++){
            
            
            //columns
            for(int j = 0;j<columns;j++){
                a[i][j] = sc.nextInt();

            }
        }


        for(int j = 5;j>4;j--){
            
            for(int i = 1;i<5;i++){
                a[i][j] = sc.nextInt();

            }
        }




        for(int i = 4;i<5;i++){
            
            
            //columns
            for(int j = 4;j>=0;j--){
                a[i][j] = sc.nextInt();

            }
        }

        for(int j = 0;j<1;j++){
            
            for(int i = 4;i>0;i--){
                a[i][j] = sc.nextInt();

            }
        }



        for(int i = 1;i<2;i++){
            
            
            //columns
            for(int j = 1;j<5;j++){
                a[i][j] = sc.nextInt();

            }
        }

        for(int j = 4;j<5;j++){
            
            for(int i = 2;i<4;i++){
                a[i][j] = sc.nextInt();

            }
        }


        for(int i = 3;i<4;i++){
            
            
            //columns
            for(int j = 3;j>0;j--){
                a[i][j] = sc.nextInt();

            }
        }

        for(int j = 1;j<2;j++){
            
            for(int i = 2;i<3;i++){
                a[i][j] = sc.nextInt();

            }
        }

        for(int i = 2;i<3;i++){
            
            
            //columns
            for(int j = 2;j<4;j++){
                a[i][j] = sc.nextInt();

            }
        }










        //output
        for(int i = 0;i<rows;i++){
            
            //columns
            for(int j = 0;j<columns;j++){
                System.out.print(a[i][j] + "   ");
            }
            System.out.println();
        }
    }
}