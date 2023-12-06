public class fibonacciByRecursion {
    public static int fibo(int n){
        if(n == 0 || n == 1){
            return n;
        }
       
        // 0 1 1 2 3 5 8 13 21 34 55
        int fibn = fibo(n-1) + fibo(n-2);
        return fibn;
    }
    public static void main(String[] args) {
        System.out.println( fibo(10) );
    }
}
