import java.util.*;
public class calculator{
    public static void main(String[] args){
        //sum - * / % of 2 no given by user 
        Scanner sc =new Scanner (System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int n=sc.nextInt();
        switch(n){
            case 1: System.out.println(a+b);
            break;
            case 2: System.out.println(a-b);
            break;
            case 3: System.out.println(a/b);
            break;
            case 4: System.out.println(a*b);
            break;
            case 5: System.out.println(a%b);
            break;
            default: System.out.println("wrong no");
        }      
        
    }
}
