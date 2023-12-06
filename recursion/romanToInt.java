import java.util.Scanner;

public class romanToInt {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String s = sc.next();
       int I = 1;
       int V = 5;
       int X = 10;
       int L = 50;
       int C = 100;
       int D = 500;
       int M = 1000;
       int IV = 4;
       int IX = 9;
       int XL = 40;
       int XC = 90;
       int CD = 400;
       int CM = 900;
       int value = 0;
       for(int i = 0;i<s.length();i++){
        char currChar = s.charAt(i);
        switch (currChar) {
            case currChar-'I':
            value+=1;
            break;
            case currChar-'V':
            value+=5;
            break;
            case currChar-'X':
            value+=10;
            break;
        
            default:
                break;
        }
        
       }
       System.out.println(value);

        
    }
}
