public class RcrsnBasics {
    public static void series(int n){
        if(n == 0){
            return;
        }
        System.out.print(n + " ");
        series(n-1);
       
    }
    public static int factorial(int n){
        int fact = 1;


        if(n == 0){
            return 1;
        
        }
        fact =  n * factorial(n-1) ;

        
        return fact;
    }
    public static int sumN(int n){
        int sum = 0;

        if(n == 0){
            return 0;
        }
        sum =  n + sumN(n-1) ;

        
        return sum;
    }
    public static void main(String[] args) {
        series(10);
        System.out.println();
        System.out.println( factorial(5));
        System.out.println(sumN(5));
    }
}
