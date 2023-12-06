import java.util.Scanner;

public class DecToBin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal no here:-");
        int n = sc.nextInt();
        int rem = 0;
        int a, b;
        int i = 5;
        double bin = 0;
        a = n;
        while(i >= 0){
            rem = a%2;
            a = a / 2;

            bin = bin + rem * Math.pow(10, 5-i);
            i--;
        }
        System.out.print(bin);
        // while(i >= 0){
        //     a = n;
        //     b = (a>>i);
        //     rem = (b&1);
        //     System.out.print(rem + " ");
        //     i--;
        // }
    }
}
