public class helloa {
    public static int power(int x,int n){
        if(n == 0){
            return 1;
        }
        if(x == 0){
            return 0;
        }   f

        int xpnm1 = power(x, n-1);
        int xpn = x * xpnm1;

        return xpn;
    }
public static void main(String[] args) {
    int m = power(2,10);
    System.out.println(m);
    
}
}
