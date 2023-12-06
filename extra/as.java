public class as{
    public static int  g(int n){
        int k = 1;
        if(n==0||n==1)
        
        return k ;

        int f1 = g(n - 1);
        int f = n * f1;

        return f;
    }
    public static void main(String[] args) {
        int a = 5;
        int fact = g(a);
        System.out.println(fact);
        
    }

}