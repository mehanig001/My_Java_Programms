public class stack_xpown{
    public static void power(int x,int n,int ans) {
       
        if(n==2){
            ans = ans * x * x;
            System.out.println(ans);
            
            return ;
        }
       

        power(x, n-1,ans*x);
        

        
    }


    public static void main(String[] args) {
        power(2, 10,1);
        
    }


}


