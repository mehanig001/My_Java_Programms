public class powerlogn {

    public static int pow(int x, int n){
        if(n == 0){
            
            return 1;
            }
        if(x == 0){
            
            return 0;
            }
            
        int xpn = 1;
        int hp = pow(x, n/2);
        if(n%2 == 0){
            xpn = hp * hp;
        }
        if(n%2 != 0){
            xpn = hp * hp * x;
           
            }
        return xpn;
}
    public static void main(String[] args) {
        int power = pow(2,5);
        System.out.println(power);
    }
}
