public class recursion1 {
    public static void printSum(int i,int n,int sum){
        if(i>n+1){
            return;
        }
        System.out.print(sum + " ");
        printSum(i+1,n,sum + i);
        sum = sum + i;
    }
    public static int pow(int a,int n){
        if(n == 0){
            return 1;
        }
        int halfpow = pow(a, n/2);
        int hpsq = halfpow * halfpow;
        if(n%2 != 0){
        hpsq = a * hpsq;
        }
        return hpsq;
    }
        
    public static void main(String[] args) {
        printSum(1,5,0);
        System.out.println();
        System.out.println(pow(2, 10));
    }
}
