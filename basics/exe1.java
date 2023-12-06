import java.util.*;

public class exe1 {
   
    public static int sumodd(int n){
        
        int sum = 0;
      
        for(int i = 1;i <= n;i = i+2){
            
            sum = sum + i;
            
            

        }
        System.out.println(sum);
        return sum;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int n = sc.nextInt();    
        sumodd(n);

   

}
    

    
}
