public class RcrsnFactorial {
    public static void factorial(int i ,int n,int f){
        if(i>n){
            System.out.println(f);
            return;
        }
      
        f = f * i;
      
        factorial(i+1, n,f); 

    }
    public static void main(String[] args) {
        factorial(1, 6,1);
    }
    
}
