import java.util.Scanner;

public class loop{
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt()
        for(int  i=1;i<=n;i++){
            System.out.println(i);
            int sum=0;
            sum = sum + i;
            System.out.println(sum);
        }
        System.out.println(sum);
    }
}
