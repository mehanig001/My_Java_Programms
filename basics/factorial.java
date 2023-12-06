import java.util.*;

public class factorial {
    
    public static int fact(int a ) {
        int f = 1;
        for(int i = a;i>=1;i--){
            
            f = f * i;
            
        }
        return f;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(fact(a));

        
    }
    
}
