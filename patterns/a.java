public class a {
    public static void main(String[] args) {
        int a = 36;
        int b = 48;
        int gcd = 1;
        for (int i = 1 ; i<=a ; i++){
            if(b%i==0){
                if(a%i==0){
                    gcd = i;

                }
               
            }

            
        }
        System.out.println(gcd);
    }
}
