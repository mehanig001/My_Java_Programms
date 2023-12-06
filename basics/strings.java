import java.util.*;
public class strings {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in) ;
      String a = sc.nextLine();
      String b = "";
      int l = a.length();
      for(int i = 0;i<l;i++){
        b= b + a.charAt(l-i-1);

      }
      System.out.println(b);

      
    }
}
