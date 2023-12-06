import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        for (int i = 2;i<=N/2;i++){
            if(N%i==0){
                System.out.println("N");
                return;
            }
           

        }
        System.out.println("Y");
           

    }
}
