import java.util.* ;

public class funcntoadd2no {

    public static int addTwoNum(int a , int b) {
        System.out.println(a + b);
        int sum =  a + b ; 
        return sum;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = addTwoNum(a,b);



        
    }


    
}
