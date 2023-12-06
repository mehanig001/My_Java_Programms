import java.util.Scanner;

public class patternprint {
    public static void main(String[] args) {
        //1234
        //4321
        //1234
        //4321
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    for(int i = 1; i<=n; i++){
        for(int j = 1; j<=n; j++){
            if(i%2!=0){
                System.out.print(j);
            }
            else{
                System.out.print(n-j+1);
            }
        }
        System.out.println();
    }
    }
}
