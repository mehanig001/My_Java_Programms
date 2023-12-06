public class CountSetsInBit{
    public static int fastExpo(int a,int n){
        int ans = 1;
        while(n>0){
            if((n & 1) != 0){
                ans = ans * a;
                 
            }
            a = a*a;
            n = n>>1;
        }
        return ans; 
    }
    public static void main(String[] args) {
        int n = 15; // 1111
        int count = 0;
        while(n!=0){
            if((n&1)==1){
                count++;
            }
            n = n>>1;
         }
      
         int pow = fastExpo(3, 5);
         System.out.println(pow);
    }
}