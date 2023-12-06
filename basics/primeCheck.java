import java.util.*;

public class primeCheck {

    public static void primeOrNot(int a ){
        boolean flag = false;
      for (int i = 2; i <= a / 2; ++i) {
        // condition for nonprime number
        if (a % i == 0) {
          flag = true;
          break;
        }
      }
  
      if (flag==false)
        System.out.println(a + " is a prime number.");
      else
        System.out.println(a + " is not a prime number.");
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        primeOrNot(a);



        
    }

    
}
