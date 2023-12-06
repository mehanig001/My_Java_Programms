import java.util.*;
public class countNumberOfPos {
    public static void main(String[] args) {
        // System.out.println("Enter 1 to start the code ");
        int cp = 0;
        int cn = 0;
        int c0 = 0;
        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt() ;
        int a = 1;
        while(a ==1){
            System.out.println("do you want to enter more, enter 1 for yes or 0 for no");
            int b = sc.nextInt();
            while(b == 1){

                System.out.println("Enter the main no here");
                int x = sc.nextInt();
                if(x>0){
                    cp = cp + 1;

            }
                else if(x<0){
                    cn = cn + 1;

            }
                else{
                    c0 = c0 + 1;


            }
            b = 0;
            

            }
            System.out.println("Enter 1 to start the code again");

            a = sc.nextInt();

        }
        System.out.println("you entered  " + cp + "  positive no");
        System.out.println("you entered  " + cn + "  negative no");
        System.out.println("you entered  " + c0 + "  zeroes no");
        
 }
    
}
