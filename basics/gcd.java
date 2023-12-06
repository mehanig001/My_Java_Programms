import java.util.Scanner;
import java.util.*;

public class gcd {
    public static void gcd(int a , int b){
        int gcd = 1;
       
        for (int i = 1 ; i<=Math.min(a,b);i++){
            if(a%i==0){
                if(b%i==0){
                    gcd = i;

                }
               
            }
            
        }
    
 
        System.out.println(gcd);
        
      
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        gcd(a,b);
        System.out.println("");
   

        

    }
    
}

