import java.util.*;
public class entery {
    public static void main(String[] args) {
        int cp = 0;
        int cn = 0;
        int c0 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("do you want to enter more, enter true for yes or false for no");
        boolean a = sc.nextBoolean();
        if(a == true){
        while(a == true){
            System.out.println("give no or write 0 to end");


            int x = sc.nextInt();
            if(x>0){
                cp = cp + 1;

            }
            else if(x<0){
                cn = cn + 1;

            }
            else{
                c0 = c0 + 1;


                a = false;
    
                
            }

        }
    }
        System.out.println("you entered  " + cp + "  positive no");
        System.out.println("you entered  " + cn + "  negative no");
        System.out.println("you entered  " + c0 + "  zeroes no");
        

        
    }
    
}
