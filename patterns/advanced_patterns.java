public class advanced_patterns {
    
    public static void main(String[] args) {
        int n=4;
        //upper
        for(int i = 1;i<=n;i++){
            //part 1 
            for(int j = 1; j<=i;j++){
                System.out.print("*");
            }
            for(int k = 1;k<=2*(n-i);k++){
                System.out.print(" ");
            }
            for(int l = 1;l<=i;l++){
                System.out.print("*");
            }
            System.out.println("");

        }
        //lower


        //
        for(int i = n;i>=1;i--){
            //part 1 
            for(int j = 1; j<=i;j++){
                System.out.print("*");
            }
            for(int k = 1;k<=2*(n-i);k++){
                System.out.print(" ");
            }
            for(int l = 1;l<=i;l++){
                System.out.print("*");
            }
            System.out.println("");

        }
          
        }
    }

