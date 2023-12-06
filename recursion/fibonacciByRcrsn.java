public class fibonacciByRcrsn {
    public static void fibo(int i, int n , int a , int b ){
        
        
        if(i==1){
            System.out.print("0 1 ");
            
    }
       if(i>n-2f){
      
            return;
}
        int c = a + b;
        System.out.print( c + " ");
   

        fibo(i+1,n,b,c);
        a = b;
        b = c;
        c = a+b;
       



       
        


    }
    public static void main(String[] args) {
        fibo(1,10,0,1);

        
    }
    
}
