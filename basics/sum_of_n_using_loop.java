import java.util.Scanner;

public class sum_of_n_using_loop{
    public static void main(String[] args) { 
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no you want:---");
        int n = sc.nextInt();
        int i = 1;
        
        /*for(int  i=1;i<=n;i++){
            
            sum = sum + i;
            
        }
        System.out.println(sum);*/


        //while loop
        /*int i = 1;
        while(i<=n){
            sum = sum + i;
            i++;*/
            



       /*  do{
            sum = sum + i;
            i++;

        }
        while(i<=n);
        System.out.println(sum); */
        
        //table of 2

        for(int x=1;x<11;x++){
            int k=1;
            k=n*x;
            System.out.println(n + " * "+i + " = "+ k);
        }

        }
    }


